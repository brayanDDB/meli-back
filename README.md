# MELI-BACK
Is implemented using Java 17 version with Spring Boot framework, a relational database is not used due the data is static in Database class. The pattern clean architecture is used because the project has clean, well structured and easy to maintain code by separating layers with a defined responsibility. The layers are:
Controller: responsible to contain every controller classes.

## Exception: 

responsible to contain every classes that handle the exceptions.
## Model: 

responsible to contain the model.
## Service: 

responsible to contain the business logic.
## Util: 

responsible to contain util classes in the system.

Meli-back exposes 2 services:
## http://localhost:8080/product returns the list of products
## http://localhost:8080/product/{id} returns the detail of a specific product
