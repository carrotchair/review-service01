package com.example.movies.client;

import com.example.movies.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MovieClient {

    @Autowired
    private HttpGraphQlClient graphQlClient;

    public List<Movie> viewMovies() {
        String graphQLQuery = "query GetMovies {\n" +
                "   getAllMovies {\n" +
                "       imdbId\n" +
                "       title\n" +
                "       poster\n" +
                "   }\n" +
                "}";
    return graphQlClient.document(graphQLQuery)
            .retrieve("getAllMovies")
            .toEntityList(Movie.class).block();
    }

    public List<Movie> viewMovies2(String... values) {
        String movieDetails = String.join("\n", values);

        String graphQLQuery = "query GetMovies {\n" +
                "   getAllMovies {\n" +
                movieDetails +
                "   }\n" +
                "}";
        return graphQlClient.document(graphQLQuery)
                .retrieve("getAllMovies")
                .toEntityList(Movie.class).block();
    }
}
