import grpc

import proto.stubs.city_pb2 as city_pb2
import proto.stubs.city_pb2_grpc as city_pb2_grpc

def find_city(stub):
    id = input("Type it identifier of the city:")
    request = city_pb2.CitRequest(id=id)
    response = stub.getCityById(request)
    print('-------------------------------------------------')
    print('City Id:{0}'.format(response.id))
    print('City Name:{0}'.format(response.name))
    print('City Population:{0}'.format(response.population))
    print('City CounteCode:{0}'.format(response.countryCode))
    print('-------------------------------------------------')

def run():
    with grpc.insecure_channel('localhost:9090') as channel:
        stub = city_pb2_grpc.CityServiceStub(channel)
        find_city(stub)

if __name__ == '__main__':
    run()