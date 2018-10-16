package com.example.fuelservice.service;


import com.example.fuelservice.model.City;
import com.example.fuelservice.model.Price;
import com.example.fuelservice.repository.CityRepository;
import com.example.fuelservice.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private PriceRepository priceRepository;


    public Price getPriceByCityCodeAndFuelType(String cityCode, String fuelType) {
        City city = cityRepository.findByCode(cityCode);
        if (city != null) {
            return priceRepository.findByCityIdAndFuelType(city.getId(), fuelType);
        }
        return null;
    }

}
