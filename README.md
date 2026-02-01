# Search Service - Spring Boot Assignment
## Overview
This project is a *Spring Boot based Search Service** that allows users to search products based on **price criteria**.
It demonstrate clean backend archietecture,Java Stream API usage, and RESTful API design.

The service uses a **mock inventory** (in-memory data) and is designed to be easily extendable to a real database.

---

## Technologies Used
- Java 21
- Spring Boot 3.2.5
- Maven
- IntelliJ IDEA
- Java Stream API
- Swagger (OpenAPI)

## Features 
-Mock inventory data
-Filter products using Java Stream API
-CommandLineRunner used for demonstration

## API Endpoints
### Search Products Above Price
Returns product names that have price **less than the given value**,sorted in ascending order.
---

## How to Run
1. Clone the repository
2. Open in IntelliJ IDEA
3. Run 'SearchSearviceApplication'
4. Console will display filtered product list

---

## Sample Output
Filtered Products:
[Apple,Banana,Mango]

  
