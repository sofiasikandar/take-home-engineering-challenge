# Introduction
Hello, my name is Sofia Sikandar and I am a Full Stack Developer with a speciality in backend development and data science. Thank you in advance for taking the time to look over my code. Please feel free to ask any questions at any time.

# Overview
For this project, I've used Java 11 and Maven 3.8.4. Among the different libraries and frameworks I've used, the ones worth receiving a special notice are I've also used the Spring framework and Lombok. 

# Endpoints
1. GET - Retrieve by Location ID
3. GET - Retrieve by Block 
4. POST - Add a new Food Truck

# How to Hit the REST API Endpoints
Postman URLs: 
1. Retrieve by Location ID example
* http://localhost:8080/getByLocationId/?locationId=751253
2. Retrieve by Block example
* http://localhost:8080/getByBlock/?block=3549
3. Add a new Food Truck
* http://localhost:8080/newFoodTrucks/
* Add a Food Truck Object into the Request Body as application/json.

# Access via CURL 
1. Retrieve by Location ID example
* curl --location --request GET 'localhost:8080/getByLocationId/751253'
2. Retrieve by Block example
* curl --location --request GET 'localhost:8080/getByBlock/?block=3569'
3. Add a new Food Truck 
* curl --location --request POST 'localhost:8080/newFoodTrucks' --header 'Content-Type: application/json' --data-raw 
* ' { insert food truck object parameters (note they will all be string values }'
