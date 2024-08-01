package com.example.api_calls.controller;

import com.example.api_calls.bean.Person;
import com.example.api_calls.exceptions.ValidationException;
import com.example.api_calls.service.TestServiceForFeignClient;
import com.example.api_calls.service.TestServiceForHttpClient;
import com.example.api_calls.service.TestServiceForRestTemplate;
import com.example.api_calls.service.TestServiceForWebClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;

@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);


    private final TestServiceForRestTemplate testServiceForRestTemplate;
    private final TestServiceForFeignClient testServiceForFeignClient;
    private final TestServiceForWebClient testServiceForWebClient;
    private final TestServiceForHttpClient testServiceForHttpClient;

    public TestController(TestServiceForRestTemplate testServiceForRestTemplate,
                          TestServiceForFeignClient testServiceForFeignClient,
                          TestServiceForWebClient testServiceForWebClient,
                          TestServiceForHttpClient testServiceForHttpClient) {
        this.testServiceForRestTemplate = testServiceForRestTemplate;
        this.testServiceForFeignClient = testServiceForFeignClient;
        this.testServiceForWebClient = testServiceForWebClient;
        this.testServiceForHttpClient = testServiceForHttpClient;
    }

    @GetMapping("/hellow/rest-template/{user}")
    public Person getDataByRestTemplate(@PathVariable String user){
        if(!"dhanushka".equals(user)){
            throw new ValidationException("Invalid user");// here exception is thrown
        }
        return testServiceForRestTemplate.queryPerson();
    }

    @GetMapping("/hellow/feign-client")
    public Person getDataByFeignClient(){
        return testServiceForFeignClient.getApiResponse();
    }

    @GetMapping("/hellow/web-client")
    public Person getDataByWebClient(){
        logger.info("Request received to web-client");
        Person person = testServiceForWebClient.queryPerson();
        logger.info("Response returned: {}", person);
        return person;
    }

    @GetMapping("/hellow/http-client")
    public String getDataByHttpClientIntroducedInJava11() throws IOException, InterruptedException {
        return testServiceForHttpClient.queryData();
    }

    /**
     * we can redirect to a given url as follows
     * @return
     */
    @GetMapping("hellow")
    public RedirectView test(){
        String externalUrl = "https://en.wikipedia.org/wiki/Sri_Lanka";
        return new RedirectView(externalUrl);
//        return "hellow man";
    }
}
