package org.exampledriven.hystrixeample.controller;

import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;
import org.exampledriven.hystrixeample.domain.Customer;
import org.exampledriven.hystrixeample.service.CustomerCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
class HystrixCacheController {

    @Autowired
    CustomerCacheService customerCacheService;

    @RequestMapping(value = "/customer-cache/{id}", method = RequestMethod.GET, produces = "application/json")
    public Customer getCustomer(@CacheKey @PathVariable int id, @RequestParam String name) throws ExecutionException, InterruptedException {
        try {
            HystrixRequestContext.initializeContext();
            return customerCacheService.createCustomer(id, name);
        } finally {
            HystrixRequestContext.getContextForCurrentThread().shutdown();
        }
    }



}