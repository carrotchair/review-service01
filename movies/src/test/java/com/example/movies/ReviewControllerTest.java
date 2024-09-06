package com.example.movies;

import com.example.movies.controller.ReviewController;
import com.example.movies.model.Movie;
import com.example.movies.model.Review;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@DisplayName("ReviewController Test")
@SpringBootTest
public class ReviewControllerTest {

    @Autowired
    ReviewController reviewController;

    @Test
    public void getAllReviews() throws Exception {
        List<Review> reviews = reviewController.getAllReviews();

        Assertions.assertThat(reviews).isNotEmpty();
    }

    @Test
    public void getAllReviewsAndCheckTheSize() throws Exception {
        List<Review> reviews = reviewController.getAllReviews();

        Assertions.assertThat(reviews).hasSizeGreaterThan(5);
    }

    @Test
    public void getMoviesWithSpecificDetails() throws Exception {
        List<Movie> movies = reviewController.viewMovies("imdbId", "title");

        Assertions.assertThat(movies).isNotEmpty();
        Assertions.assertThat(movies.size()).isEqualTo(10);
        Assertions.assertThat(movies.getFirst().getImdbId()).isNotEmpty();
        Assertions.assertThat(movies.getFirst().getPoster()).isNull();
    }
}
