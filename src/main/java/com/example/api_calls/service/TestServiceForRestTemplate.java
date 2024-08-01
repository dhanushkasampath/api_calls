package com.example.api_calls.service;

import com.example.api_calls.bean.Person;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceForRestTemplate {

    private final RestTemplate restTemplate;

    public TestServiceForRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * You can use exchange method in rest template to specify the HTTP method, Headers and payload
     * @return Person
     */
    public Person queryPerson(){
        return restTemplate.getForObject("https://run.mocky.io/v3/fdc508a1-409e-43ec-af70-06fecc2a2392", Person.class);
    }
}
