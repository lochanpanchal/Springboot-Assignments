<!-- Headinga -->
# <p style="text-align: center;"> Restaurant Api Model👋</p>

## * Frameworks and Language used


    1. Springboot framework
    2. core java


*  Data flow 

    1. Restaurantentiry
    2. RestaurantController
    

## Data Structure used in my project


    ArrayList, basic java




## Project Summary
 

In summary, to build a Restaurant API using Spring Boot:

Use the Spring Initializer website to generate a Spring project with Maven, Java, and the required dependencies (Spring Web).

Create the Restaurant model class with relevant variables like id, name, address, phoneNumber, specialty, and totalStaffs.

Implement the RestaurantController class with operations:

getRestaurantById(): Retrieves a restaurant by its id using @GetMapping.
getAllRestaurants(): Retrieves all restaurants using @GetMapping.
addRestaurant(): Adds a new restaurant to the list using @PostMapping.
updateRestaurant(): Updates the specialty of a restaurant by its id using @PutMapping.
deleteRestaurant(): Deletes a restaurant by its id using @DeleteMapping.
Run the Spring application to start the embedded Tomcat server.

Test the API endpoints by sending HTTP requests:

* Use a POST request to add a restaurant.
* Use a GET request with or without an id parameter to retrieve restaurants.
* Use a PUT request with an id parameter and a JSON body to update a restaurant.
* Use a DELETE request with an id parameter to delete a restaurant.
  
Remember to replace localhost:8080 with the appropriate host and port if you are running the application on a different server.

By following these steps, you will have a functional Restaurant API implemented using Spring Boot, allowing you to perform operations such as retrieving restaurants by ID, getting all restaurants, adding new restaurants, updating restaurant information, and deleting restaurants.
