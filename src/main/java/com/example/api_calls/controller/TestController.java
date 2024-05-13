package com.example.api_calls.controller;

import com.example.api_calls.bean.Person;
import com.example.api_calls.exceptions.ValidationException;
import com.example.api_calls.service.TestServiceForFeignClient;
import com.example.api_calls.service.TestServiceForRestTemplate;
import com.example.api_calls.service.TestServiceForWebClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private final TestServiceForRestTemplate testServiceForRestTemplate;
    private final TestServiceForFeignClient testServiceForFeignClient;
    private final TestServiceForWebClient testServiceForWebClient;

    public TestController(TestServiceForRestTemplate testServiceForRestTemplate,
                          TestServiceForFeignClient testServiceForFeignClient,
                          TestServiceForWebClient testServiceForWebClient) {
        this.testServiceForRestTemplate = testServiceForRestTemplate;
        this.testServiceForFeignClient = testServiceForFeignClient;
        this.testServiceForWebClient = testServiceForWebClient;
    }

    @GetMapping("/hellow/rest-template/{user}")
    public Person getDataByRestTemplate(@PathVariable String user){
        if(!"dhanushka".equals(user)){
            throw new ValidationException("Invalid user");
        }
        return testServiceForRestTemplate.queryPerson();
    }

    @GetMapping("/hellow/feign-client")
    public Person getDataByFeignClient(){
        return testServiceForFeignClient.getApiResponse();
    }

    @GetMapping("/hellow/web-client")
    public Person getDataByWebClient(){
        return testServiceForWebClient.queryPerson();
    }

    @GetMapping("hellow")
    public String test(){
        return "hellow man";
    }
}
