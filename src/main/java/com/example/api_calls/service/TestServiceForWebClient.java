package com.example.api_calls.service;

import com.example.api_calls.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TestServiceForWebClient {

    @Autowired
    private WebClient webClient; // this is called field injection

    public Person queryPerson(){
        return webClient.get()
            .uri("https://run.mocky.io/v3/fdc508a1-409e-43ec-af70-06fecc2a2392")
            .retrieve()
            .bodyToMono(Person.class)
            .block();
    }
}
