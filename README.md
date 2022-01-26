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

# Curl Commands
1. Retrieve by Location ID example
* curl --location --request GET 'localhost:8080/getByLocationId/751253'
2. Retrieve by Block example
* curl --location --request GET 'localhost:8080/getByBlock/?block=3569'
3. Add a new Food Truck 
* curl --location --request POST 'localhost:8080/newFoodTrucks' --header 'Content-Type: application/json' --data-raw 
* ' { insert food truck object parameters }'
* All key value pairs must be strings as defined by my Food Truck object class. Additionally, my program assumes that location ID is unique. 
* Example:

curl --location --request POST 'localhost:8080/newFoodTrucks --header 'Content-Type: application/json' --data-raw ' { “locationId”: “735318”, “applicant”: “Ziaurehman Amini”, “facilityType”: “Push Cart”, “cnn”: “30727000”, “locationDescription”: “MARKET ST: DRUMM ST intersection”, “address”: “5 THE EMBARCADERO”, “blocklot”: “0234017”, “block”: “0234”, “lot”: “017”, “permit”: “15MFF-0159”, “status”: “REQUESTED”, “foodItems”: ““, “x”: “6013916.72”, “y”: “2117244.027”, “latitude”: “37.7943310032468”, “longitude”: “-122.395811053023”, “schedule”: “http://bsm.sfdpw.org/PermitsTracker/reports/report.aspx?title=schedule&report=rptSchedule&params=permit=15MFF-0159&ExportPDF=1&Filename=15MFF-0159_schedule.pdf”, “daysHours”: ““, “noiSent”: ““, “approved”: ““, “received”: “2015-12-31”, “priorPermit”: “0”, “expirationDate”: “03/15/2016 12:00:00 AM”, “location”: “(37.7943310032468, -122.395811053023)” }'![image](https://user-images.githubusercontent.com/35907509/151186113-4ffef840-9b67-4b3a-8b99-26f442a3305f.png)


Cheers.

--------------

# Take Home Engineering Challenge

Commercial Software Engineering is a very practical team at Microsoft and this extends to the way that we work with you to find out if this team is a great fit for you. We want you to come away with a great understanding of the work that we actually do day to day and what it is like to work with us.

So instead of coding at a whiteboard with someone watching over your shoulder under high pressure, which is not a thing we often do, we instead discuss code that you have written previously when we meet.

## Guidelines

-   This is meant to be an assignment that you spend approximately three hours of dedicated, focused work. Do not feel like you need to overengineer the solution with dozens of hours to impress us. Be biased toward quality over quantity, simplicity over complexity.

-   Think of this like an open source project. Create a repo on Github, use git for source control, and use README.md to document what you built for the newcomer to your project.

-   Our team builds, alongside our customers and partners, systems engineered to run in production. Given this, please organize, design, test, deploy, and document your solution as if you were going to put into production. We completely understand this might mean you can't do as much in the time budget. Be biased for production-ready over features.

-   Think out loud in your submission's documentation. Document tradeoffs, the rationale behind your technical choices, or things you would do or do differently if you were able to spend more time on the project or do it again.

-   Our team meets our customers where they are in terms of software engineering platforms, frameworks, tools, and languages. This means you have wide latitude to make choices that express the best solution to the problem given your knowledge and favorite tools. Make sure to document how to get started with your solution in terms of setup.

## The Problem

Our San Francisco team loves to eat. They are also a team that loves variety, so they also like to discover new places to eat.

In fact, we have a particular affection for food trucks. One of the great things about Food Trucks in San Francisco is that the city releases a list of them as open data.

Your assignment is to make it possible for us to find a food truck no matter where our work takes us in the city.

Feel free to tackle this problem in a way that demonstrates your expertise of an area -- or takes you out of your comfort zone.

## Technical Requirements

### Interface

You can write a simple REST service that returns a set of food trucks (our team is fluent in JSON).

### Expected Data Size

Design the solution assuming that the dataset includes data from many cities with millions of records.

### Data Schema

San Francisco's food truck open dataset is [located here](https://data.sfgov.org/Economy-and-Community/Mobile-Food-Facility-Permit/rqzj-sfat/data) and there is an endpoint with a [CSV dump of the latest data here](https://data.sfgov.org/api/views/rqzj-sfat/rows.csv). We've included a [copy of this data](./Mobile_Food_Facility_Permit.csv) in this repo as well.

### Programming Language 

You are welcome to use any language frameworks or libraries you like. 

### Data Storage

You don’t need to use a database to store food truck data. Instead, your REST Service should use language native data structures (ie _Set, List, Map, Stack, Heap, etc_) to implement the in-memory data store. Please avoid using query and/or ORM frameworks(_ie Linq, Hibernate_).

### Service Requirements

Your REST service should make it possible to:

- Add a new food truck.
- Retrieve a food truck based on the `locationid` field.
- Get all food trucks for a given `block`.

### Testing

You are welcome to use your unit testing framework of choice to validate the in-memory data store and service functionality.

Good luck! Please send a link to your solution on Github back to us at least 12 hours before your interview so we can review it before we speak.
