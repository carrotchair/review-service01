//package com.example.movies.resolver;
//
//import com.example.movies.model.Movie;
//import com.example.movies.repository.MovieRepository;
//import graphql.kickstart.tools.GraphQLQueryResolver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Component
//@Service
//public class Query implements GraphQLQueryResolver {
//
//    @Autowired
//    private MovieRepository movieRepository;
//
//    public List<Movie> getAllMovies2() {
//        return movieRepository.findAll();
//    }
//
//    public Movie getSingleMovie(String imdbId) {
//        return movieRepository.findMovieByImdbId(imdbId).orElse(null);
//    }
//
//}
