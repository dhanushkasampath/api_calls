package com.example.api_calls.service;

import com.example.api_calls.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TestServiceForWebClient {

    @Autowired
    private WebClient webClient;

    public Person queryPerson(){
        return webClient.get()
            .uri("https://run.mocky.io/v3/0174cc82-7b01-411f-9448-01e57d7c7b89")
            .retrieve()
            .bodyToMono(Person.class)
            .block();
    }
}
