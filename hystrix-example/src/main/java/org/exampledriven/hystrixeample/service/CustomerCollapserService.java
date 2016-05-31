package org.exampledriven.hystrixeample.service;

import com.netflix.hystrix.collapser.RequestCollapserFactory;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.exampledriven.hystrixeample.domain.Customer;
import org.exampledriven.hystrixeample.domain.MessageWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

@Service
public class CustomerCollapserService {

    private Logger logger = LoggerFactory.getLogger(CustomerCollapserService.class);

    // timerDelayInMilliseconds is set only for testing purposes
    @HystrixCollapser(scope = com.netflix.hystrix.HystrixCollapser.Scope.GLOBAL, batchMethod = "getCustomerByIds", collapserProperties = {
            @HystrixProperty(name = "timerDelayInMilliseconds", value = "2000")
    })
    public Future<MessageWrapper> getCustomerById(Integer id) {
        throw new RuntimeException("This method body should not be executed");
    }

    @HystrixCommand
    public List<MessageWrapper> getCustomerByIds(List<Integer> ids) {
        logger.info("" + ids.size() + " calls collapsed into a single one");

        List<MessageWrapper> customers = new ArrayList<>(ids.size());

        for (Integer id : ids) {
            customers.add(new MessageWrapper<>(new Customer(id, "First", "Last"), "This customer was queried in a batch"));
        }

        return customers;

    }

}
