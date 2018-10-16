package com.example.fuelservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "cities")
public class City {

    @Id
    private String id;

    @Indexed(unique = true)
    private String code;

    private String name;

}
