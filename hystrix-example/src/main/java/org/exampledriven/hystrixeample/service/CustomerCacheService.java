package org.exampledriven.hystrixeample.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.exampledriven.hystrixeample.domain.Customer;
import org.exampledriven.hystrixeample.domain.MessageWrapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;

@Service
public class CustomerCacheService {

    @CacheResult
    @HystrixCommand
    public Customer createCustomer(@CacheKey int id, String name) {
        return new Customer(id, name, name);
    }

}
