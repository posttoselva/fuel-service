package com.example.fuelservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Data
@Document(collection = "prices")
public class Price {

    @Id
    private String id;

    @NotBlank
    @DBRef
    private City city;

    private String fuelType;

    private String fuelName;

    private float price;
}
