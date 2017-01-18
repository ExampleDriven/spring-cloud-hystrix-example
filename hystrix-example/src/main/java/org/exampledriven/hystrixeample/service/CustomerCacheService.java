package org.exampledriven.hystrixeample.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheKey;
import com.netflix.hystrix.contrib.javanica.cache.annotation.CacheResult;
import org.exampledriven.hystrixeample.domain.Customer;
import org.springframework.stereotype.Service;


/**
 * @see org.exampledriven.hystrixeample.config.HystrixContextInterceptor
 */
@Service
public class CustomerCacheService {

    @CacheResult
    @HystrixCommand
    public Customer createCustomer(@CacheKey int id, String name) {
        return new Customer(id, name, name);
    }

}
