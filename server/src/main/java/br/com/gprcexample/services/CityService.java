package br.com.gprcexample.services;

import br.com.gprcexample.documents.City;
import br.com.gprcexample.repositories.CityMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class CityService {
    private @Autowired CityMongoRepository cityMongoRepository;

    public Optional<City> getCityById(String id){
        return cityMongoRepository.findById(id);
    }

    public void save(City city) throws IllegalAccessException {
        throw new IllegalAccessException("Please implements it.");
    }
}
