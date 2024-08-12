package com.example.movies.client;

import com.example.movies.model.Movie;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface JsonPlaceholderService {

    @GetExchange("/api/v1/movies")
    List<Movie> getAllMovies();

    @PostExchange("/graphql")
    void getSmth(@RequestBody String graphQLQuery);
}
