package com.example.api_calls.external;

import com.example.api_calls.bean.Person;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@FeignClient(name = "discounts-and-comps-data", url = "https://run.mocky.io/v3/c6959e9d-9090-4c2a-9118-1755a445d40b")
public interface ExampleFeignClient {

    String API_HOST_HEADER_NAME = "X-RapidAPI-Host";
    String API_KEY_HEADER_NAME = "X-RapidAPI-Key";

    @GetMapping("/")
//    Map<String, Object> getDiscounts(@RequestHeader(name = API_HOST_HEADER_NAME) String apiHostHeader,
//    String getDiscounts(@RequestHeader(name = API_HOST_HEADER_NAME) String apiHostHeader,
    Person getDiscounts(@RequestHeader(name = API_HOST_HEADER_NAME) String apiHostHeader,
                        @RequestHeader(name = API_KEY_HEADER_NAME) String apiKeyHeader,
                        @RequestParam("params") String params);
}
