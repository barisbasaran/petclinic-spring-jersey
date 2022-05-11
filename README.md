# Pet Clinic with Spring Boot and Jersey

## About 

This is an example **RESTful** web service for the **Java Petclinic**.

It is built using the following tools:
* [Jersey](https://eclipse-ee4j.github.io/jersey/)
* [Spring Boot with Jersey](https://docs.spring.io/spring-boot/docs/2.6.7/reference/htmlsingle/#boot-features-jersey)
* [Docker](https://www.docker.com)
* [PostgreSQL](https://www.postgresql.org)
* [Lombok](https://projectlombok.org)
* [Swagger](https://swagger.io)
* [Maven](https://maven.apache.org)

It is using the following test frameworks:
* [JUnit](https://junit.org/junit5/)
* [Mockito](https://site.mockito.org/)
* [AssertJ](https://assertj.github.io/doc/)
* [Testcontainers](https://www.testcontainers.org)

## Setup

### Build project

Run `mvn package` to build project with _Maven_.


### Start application

Run `docker-compose up` to start application with _Docker_.

To check that your application is running enter url `http://localhost:8080/`

## Endpoints

`GET /pets` Get all pets

`PUT /pets` Create pet

`GET /pets/{pet_id}` Get pet

`POST /pets/{pet_id}` Update pet
