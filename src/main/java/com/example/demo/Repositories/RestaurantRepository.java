package com.example.demo.Repositories;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.example.demo.Models.Restaurant;
import java.util.List;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

    @Query("{borough:'?0'}")
    List<Restaurant> findRestaurantByBorough(String borough);
}
