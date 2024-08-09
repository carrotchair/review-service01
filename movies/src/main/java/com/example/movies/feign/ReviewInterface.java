package com.example.movies.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("MOVIES-APP")
public interface ReviewInterface {
    @PostMapping
    public void getSmth(@RequestBody String graphQLQuery);
}
