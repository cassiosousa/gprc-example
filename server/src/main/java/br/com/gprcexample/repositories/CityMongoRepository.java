package br.com.gprcexample.repositories;

import br.com.gprcexample.documents.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityMongoRepository extends MongoRepository<City,String> {
}
