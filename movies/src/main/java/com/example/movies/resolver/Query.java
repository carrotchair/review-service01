package com.example.movies.resolver;

import graphql.kickstart.tools.GraphQLQueryResolver;
import com.example.movies.model.Movie;
import com.example.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies2() {
        return movieRepository.findAll();
    }

    public Movie getSingleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId).orElse(null);
    }

}
