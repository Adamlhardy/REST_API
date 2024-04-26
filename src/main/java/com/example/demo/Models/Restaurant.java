package com.example.demo.Models;

import javax.print.attribute.standard.MediaSize.NA;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("restaurants")
public class Restaurant {
    public String borough;
    public String cuisine;
    public String name;
    @Id
    public String restaurant_id;

    // public Restaurant(String borough, 
    //         String cuisine, String name, String restaurant_id) {
    //     borough = this.borough;
    //     cuisine = this.cuisine;
    //     name = this.name;
    //     restaurant_id = this.restaurant_id;
    // }
}
