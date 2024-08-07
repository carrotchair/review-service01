package com.example.movies.controller;

import com.example.movies.model.Movie;
import com.example.movies.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @QueryMapping
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.findAllMovies();
    }

    @QueryMapping
    @GetMapping("/{imdbId}")
    public Optional<Movie> findMovieByImdbId(@PathVariable @Argument String imdbId) {
        return movieService.findMovieByImdbId(imdbId);
    }

}
