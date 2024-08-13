package com.example.movies.service;

import com.example.movies.client.MovieClient;
import com.example.movies.model.Movie;
import com.example.movies.model.Review;
import com.example.movies.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> findAllReviews() {
        return reviewRepository.findAll();
    }

    @Autowired
    private MovieClient movieClient;

    public List<Movie> viewMovies() {
        return movieClient.viewMovies();
    }

    public List<Movie> findAllMoviesWithDetails(String... values) {
        return movieClient.viewMovies2(values);
    }

}
