package com.example.fuelservice.repository;

import com.example.fuelservice.model.Price;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface PriceRepository extends MongoRepository<Price,String> {

    @Query("{'city.id': ?0, 'fuelType': ?1 }")
    Price findByCityIdAndFuelType(String cityId,String fuelType);

}
