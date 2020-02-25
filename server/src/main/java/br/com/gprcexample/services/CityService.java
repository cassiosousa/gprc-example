package br.com.gprcexample.services;

import br.com.gprcexample.repositories.CityMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    private @Autowired CityMongoRepository cityMongoRepository;

}
