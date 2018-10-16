package com.example.fuelservice.endpoint;

import com.example.fuelservice.model.City;
import com.example.fuelservice.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityEndpoint {

    @Autowired
    private CityRepository cityRepository;

    @GetMapping("")
    public List<City>getAllCities(){
        return cityRepository.findAll();
    }
}
