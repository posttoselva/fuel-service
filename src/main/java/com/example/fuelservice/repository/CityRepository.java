package com.example.fuelservice.repository;

import com.example.fuelservice.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CityRepository extends MongoRepository<City,String> {

    City findByCode(String code);

}
