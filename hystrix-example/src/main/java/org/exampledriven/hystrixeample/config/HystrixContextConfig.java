package org.exampledriven.hystrixeample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Peter_Szanto on 1/18/2017.
 */
@Configuration
public class HystrixContextConfig extends WebMvcConfigurerAdapter {

    @Bean
    HystrixContextInterceptor hystrixContextInterceptor() {
        return new HystrixContextInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(hystrixContextInterceptor());
    }

}