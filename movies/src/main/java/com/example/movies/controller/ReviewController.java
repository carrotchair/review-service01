package com.example.movies.controller;

import com.example.movies.model.Movie;
import com.example.movies.model.Review;
import com.example.movies.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "*")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public List<Review> getAllReviews() {
        return reviewService.findAllReviews();
    }

    @GetMapping("/movies")
    public List<Movie> viewMovies() {
        return reviewService.viewMovies();
    }

    @PostMapping("/movies-details")
    public List<Movie> viewMovies(@RequestBody String... values) {
        return reviewService.findAllMoviesWithDetails(values);
    }

}
