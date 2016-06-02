[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-hystrix-example.svg?branch=master)](https://travis-ci.org/ExampleDriven/spring-cloud-hystrix-example)
# spring-cloud-hystrix-example
Spring Cloud Hystrix example

This is the source code for the blog post

http://exampledriven.wordpress.com/TBD

This example covers the following :

- Hystrix circuit breaker, fallback using @HystrixCommand
- Hystrix request collapser using @HystrixCollapser
- Hystrix dashboard
- Turbine

Test URLs :

- Request collapser : http://localhost:8080/customer-collapser/1 and http://localhost:8080/customer-collapser/2
- Fallback : http://localhost:8080/customer-fallback/2
- Cache http://localhost:8080/customer-cache/2?name=Peter http://localhost:8080/customer-cache/2?name=Peterdddd 