package com.example.api_calls.controller;

import com.example.api_calls.bean.Person;
import com.example.api_calls.service.TestServiceForFeignClient;
import com.example.api_calls.service.TestServiceForRestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestServiceForRestTemplate testServiceForRestTemplate;
    private final TestServiceForFeignClient testServiceForFeignClient;

    public TestController(TestServiceForRestTemplate testServiceForRestTemplate, TestServiceForFeignClient testServiceForFeignClient) {
        this.testServiceForRestTemplate = testServiceForRestTemplate;
        this.testServiceForFeignClient = testServiceForFeignClient;
    }

    @GetMapping("/hellow/rest-template")
    public Person getDataByRestTemplate(){
        return testServiceForRestTemplate.queryPerson();
    }

    @GetMapping("/hellow/feign-client")
    public Person getDataByFeignClient(){
        return testServiceForFeignClient.getApiResponse();
    }
}
