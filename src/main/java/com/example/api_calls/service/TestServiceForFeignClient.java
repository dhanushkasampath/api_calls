package com.example.api_calls.service;

import com.example.api_calls.bean.Person;
import com.example.api_calls.external.ExampleFeignClient;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class TestServiceForFeignClient {

    private static final String API_HOST_HEADER_VALUE = "your-header-value";
    private static final String API_KEY = "your-api-key";

    private final ExampleFeignClient exampleFeignClient;

    public TestServiceForFeignClient(ExampleFeignClient exampleFeignClient) {
        this.exampleFeignClient = exampleFeignClient;
    }

    /**
     * all of below ways are possible
     * @return Person
     */
    public Person getApiResponse(){
//        Map<String, Object> discountMap = exampleFeignClient.getDiscounts(API_HOST_HEADER_VALUE, API_KEY, "anyString");
//        String discountMap = exampleFeignClient.getDiscounts(API_HOST_HEADER_VALUE, API_KEY, "anyString");
        Person discountMap = exampleFeignClient.getDiscounts(API_HOST_HEADER_VALUE, API_KEY, "anyString");
        return discountMap;
    }
}
