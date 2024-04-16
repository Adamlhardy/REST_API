package com.example.demo.Models;

import javax.print.attribute.standard.MediaSize.NA;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("restaurants")
public class Restaurant {
    String Borough;
    String Cuisine;
    String Name;
    @Id
    String Id;

    public Restaurant(String borough, 
            String cuisine, String name, String restaurant_id) {
        Borough = borough;
        Cuisine = cuisine;
        Name = name;
        Id = restaurant_id;
    }
}
