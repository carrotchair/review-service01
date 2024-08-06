//package com.example.movies.resolver;
//
//import com.example.movies.model.Review;
//import com.example.movies.repository.ReviewRepository;
//import graphql.kickstart.tools.GraphQLMutationResolver;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class Mutation implements GraphQLMutationResolver {
//
//    @Autowired
//    private ReviewRepository reviewRepository;
//
//    public Review createReview2(String body) {
//        Review review = new Review();
//        review.setBody(body);
//        return reviewRepository.save(review);
//    }
//}
