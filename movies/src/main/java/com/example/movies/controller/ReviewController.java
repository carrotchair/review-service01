package com.example.movies.controller;

import com.example.movies.client.JsonPlaceholderService;
import com.example.movies.model.Movie;
import com.example.movies.model.Review;
import com.example.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    public ReviewController(JsonPlaceholderService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/reviews")
    public List<Review> getAllReviews() {
        return reviewService.findAllReviews();
    }

    private final JsonPlaceholderService movieService;

    @GetMapping("/movies2")
    public List<Movie> getAllMovies2() {
        return movieService.getAllMovies();
    }

    @PostMapping(value = "/details2", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public void getSpecificDetailsOfAllMovies2(@RequestBody String graphQLQuery) {
        movieService.getSmth(graphQLQuery);
    }


}
