package com.example.Restaurant.mode.restaurant;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

        private List<Restaurant> restaurantList = new ArrayList<>();

        @GetMapping("/{id}")
        public Restaurant getRestaurantById(@PathVariable Long id) {
            return restaurantList.stream()
                    .filter(restaurant -> restaurant.getId().equals(id))
                    .findFirst()
                    .orElse(null);
        }

        @GetMapping
        public List<Restaurant> getAllRestaurants() {
            return restaurantList;
        }

        @PostMapping
        public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
            restaurantList.add(restaurant);
            return restaurant;
        }

        @PutMapping("/{id}")
        public Restaurant updateRestaurant(@PathVariable Long id, @RequestBody Restaurant updatedRestaurant) {
            return restaurantList.stream()
                    .filter(restaurant -> restaurant.getId().equals(id))
                    .map(restaurant -> {
                        restaurant.setSpecialty(updatedRestaurant.getSpecialty());
                        // Update other relevant fields as needed
                        return restaurant;
                    })
                    .findFirst()
                    .orElse(null);
        }

        @DeleteMapping("/{id}")
        public boolean deleteRestaurant(@PathVariable Long id) {
            return restaurantList.removeIf(restaurant -> restaurant.getId().equals(id));
        }
}
