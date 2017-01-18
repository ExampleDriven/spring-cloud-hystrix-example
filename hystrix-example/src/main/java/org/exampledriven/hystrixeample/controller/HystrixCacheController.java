package org.exampledriven.hystrixeample.controller;

import org.exampledriven.hystrixeample.domain.Customer;
import org.exampledriven.hystrixeample.service.CustomerCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

/**
 * @see org.exampledriven.hystrixeample.config.HystrixContextInterceptor
 */
@RestController
class HystrixCacheController {

    @Autowired
    CustomerCacheService customerCacheService;

    @RequestMapping(value = "/customer-cache/{id}", method = RequestMethod.GET, produces = "application/json")
    public Customer getCustomer(@PathVariable int id, @RequestParam String name) throws ExecutionException, InterruptedException {
        return customerCacheService.createCustomer(id, name);
    }



}