package br.com.gprcexample.repositories;

import br.com.gprcexample.documents.City;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityMongoRepository extends MongoRepository<City,String> {
}
