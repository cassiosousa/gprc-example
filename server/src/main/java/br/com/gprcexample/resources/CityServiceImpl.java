package br.com.gprcexample.resources;

import br.com.gprcexample.documents.City;
import br.com.gprcexample.grpc.services.CitRequest;
import br.com.gprcexample.grpc.services.CityReply;
import br.com.gprcexample.grpc.services.CityServiceGrpc;
import br.com.gprcexample.services.CityService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class CityServiceImpl extends CityServiceGrpc.CityServiceImplBase {
    private @Autowired
    CityService cityService;
    @Override
    public void getCityById(CitRequest request, StreamObserver<CityReply> responseObserver) {
        City city = cityService.getCityById(request.getId()).orElse(new City());
        CityReply cityReply = CityReply.newBuilder()
                .setId(city.getId())
                .setName(city.getName())
                .setPopulation(city.getPopulation())
                .setCountryCode(city.getCountryCode())
                .build();
        responseObserver.onNext(cityReply);
        responseObserver.onCompleted();
    }
}
