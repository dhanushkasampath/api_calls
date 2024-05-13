package com.example.api_calls.service;

import com.example.api_calls.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceForRestTemplate {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * You can use exchange method in rest template to specify the HTTP method, Headers and payload
     * @return Person
     */
    public Person queryPerson(){
        return restTemplate.getForObject("https://run.mocky.io/v3/c6959e9d-9090-4c2a-9118-1755a445d40b", Person.class);
    }
}
