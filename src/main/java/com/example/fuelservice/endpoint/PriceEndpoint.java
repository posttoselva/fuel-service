package com.example.fuelservice.endpoint;

import com.example.fuelservice.model.Price;
import com.example.fuelservice.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/price")
public class PriceEndpoint {

    @Autowired
    private PriceService priceService;

    @GetMapping("/{cityCode}/{fuelType}")
    private Price getPriceByCityCodeAndFuelType(@PathVariable String cityCode, @PathVariable String fuelType) {
        return priceService.getPriceByCityCodeAndFuelType(cityCode, fuelType);
    }

}
