[![Build Status](https://travis-ci.org/ExampleDriven/spring-cloud-hystrix-example.svg?branch=master)](https://travis-ci.org/ExampleDriven/spring-cloud-hystrix-example)
# spring-cloud-hystrix-example
Spring Cloud Hystrix example

This is the source code for the blog post

https://exampledriven.wordpress.com/2016/07/05/spring-cloud-hystrix-example/

This example covers the following :


Feature | Test URL
--- | ---
 Hystrix circuit breaker, fallback using @HystrixCommand | [http://localhost:8080/customer-fallback/2](http://localhost:8080/customer-fallback/2)
 Hystrix request collapser using @HystrixCollapser | URL1: [http://localhost:8080/customer-collapser/1](http://localhost:8080/customer-collapser/1) URL2: [http://localhost:8080/customer-collapser/2](http://localhost:8080/customer-collapser/2)
 Hystrix stream | [http://localhost:8080/hystrix.stream](http://localhost:8080/hystrix.stream)
 Hystrix dashboard | [http://localhost:8081/hystrix/monitor?stream=http://localhost:8082/turbine.stream http://localhost:8081/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8080%2Fhystrix.stream](http://localhost:8081/hystrix/monitor?stream=http://localhost:8082/turbine.stream http://localhost:8081/hystrix/monitor?stream=http%3A%2F%2Flocalhost%3A8080%2Fhystrix.stream)
 Turbine stream | [http://localhost:8082/turbine.stream](http://localhost:8082/turbine.stream)
 Cache |URL1: [http://localhost:8080/customer-cache/2?name=Peter](http://localhost:8080/customer-cache/2?name=Peter) URL2:  [http://localhost:8080/customer-cache/2?name=Peter2](http://localhost:8080/customer-cache/2?name=Peter2)
 
