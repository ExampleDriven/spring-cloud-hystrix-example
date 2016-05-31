package org.exampledriven.hystrixeample.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.exampledriven.hystrixeample.domain.Customer;
import org.exampledriven.hystrixeample.domain.MessageWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HystrixFallbackController {

    @RequestMapping(value = "/customer-fallback/{id}", method = RequestMethod.GET, produces = "application/json")
    @HystrixCommand(fallbackMethod = "fallbackGetCustomer")
    public MessageWrapper<Customer> getCustomer(@PathVariable int id) {

        throw new RuntimeException("Simulating downstream system failure");
    }

    public MessageWrapper<Customer> fallbackGetCustomer(int id, Throwable t) {
        return new MessageWrapper<>(null, "Fallback method handled exception for id " + id + ". The original exception was " + t.toString());
    }

}