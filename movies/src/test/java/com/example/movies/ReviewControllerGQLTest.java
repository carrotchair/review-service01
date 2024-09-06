package com.example.movies;


import com.example.movies.controller.ReviewController;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.client.HttpGraphQlClient;

@DisplayName("ReviewController GraphQL Test")
@GraphQlTest(ReviewController.class)
//@Import(ReviewService.class)
public class ReviewControllerGQLTest {

    @Autowired
    private HttpGraphQlClient graphQlClient;

}
