package com.example.movies.service;

import com.example.movies.model.Movie;
import com.example.movies.model.Review;
import com.example.movies.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> findAllReviews() {
        return reviewRepository.findAll();
    }

    private final RestClient restClient;

    public ReviewService() {
        restClient = RestClient.builder()
                .baseUrl("http://localhost:8080")
                .build();
    }

    public List<Movie> findAllMovies() {
        return restClient.get()
                .uri("/api/v1/movies")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Movie>>() {});
    }

    public void getDetails(String graphQLQuery) {
        restClient.post()
                .uri("/graphql")
                .contentType(MediaType.valueOf(MediaType.APPLICATION_GRAPHQL_RESPONSE_VALUE))
                .body(graphQLQuery)
                .retrieve();
                //.body(new ParameterizedTypeReference<Object>() {});
    }

    public List<Movie> getDetails2(String graphQLQuery) {
        return restClient.post()
                .uri("/graphql")
                .contentType(MediaType.APPLICATION_JSON)
                .body(graphQLQuery)
                .retrieve()
                .body(new ParameterizedTypeReference<List<Movie>>() {});
    }

}
