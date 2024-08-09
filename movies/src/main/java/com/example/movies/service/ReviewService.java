package com.example.movies.service;

import com.example.movies.feign.ReviewInterface;
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
    ReviewInterface reviewInterface;

    public void getAllMoviesAndAllReviews(String imdbId) {
        reviewInterface.getSmth(imdbId);
    }
}
