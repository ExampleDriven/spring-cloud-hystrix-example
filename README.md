[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-hystrix-example.svg?branch=master)](https://travis-ci.org/ExampleDriven/spring-cloud-hystrix-example)
# spring-cloud-hystrix-example
Spring Cloud Hystrix example

This is the source code for the blog post

http://exampledriven.wordpress.com/TBD

This example covers the following :


Feature | Test URL
--- | ---
 Hystrix circuit breaker, fallback using @HystrixCommand | http://localhost:8080/customer-fallback/2
 Hystrix request collapser using @HystrixCollapser | http://localhost:8080/customer-collapser/1 http://localhost:8080/customer-collapser/2
 Hystrix dashboard | http://localhost:8081/hystrix/monitor?stream=http://localhost:8082/turbine.stream http://localhost:8081/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8080%2Fhystrix.stream
 Turbine | http://localhost:8082/turbine.stream
 Cache | http://localhost:8080/customer-cache/2?name=Peter http://localhost:8080/customer-cache/2?name=Peter2
 