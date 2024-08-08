package com.example.movies;

import io.swagger.v3.core.util.Json;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/graphql")
public class GraphController {

    @PostMapping
    public void getSmth(@RequestBody Json graphQLQuery) {
        //Json? whatever :D
    }
}
