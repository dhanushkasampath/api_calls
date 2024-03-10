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
        return restTemplate.getForObject("https://run.mocky.io/v3/0174cc82-7b01-411f-9448-01e57d7c7b89", Person.class);
    }
}
