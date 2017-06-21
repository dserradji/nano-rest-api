# Tiny reactive RESTful service with Spring 5's WebFlux framework

In this example I tried to write the simplest Hello World Reactive RESTful service using WebFlux framework that comes with Spring 5 along with the Functional programming model.

Thanks to method chaining, handling a GET on /greeting path doesn't take more than one line of Java code.

## Build the service
mvn clean package

## Start the service
java -jar target/nano-rest-api-0.0.1-SNAPSHOT.jar

## Test

### Browser
Open the URL http://localhost:8080/greetings

### curl
curl http://localhost:8080/greetings