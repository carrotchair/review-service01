package com.example.movies.model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
public class MovieWrapper {

    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    @Field("reviewIds")
    @DocumentReference
    private List<Review> reviews;

    public MovieWrapper(ObjectId id, String imdbId, String title, String releaseDate, String trailerLink, String poster, List<String> genres, List<String> backdrops, List<Review> reviews) {
        this.id = id;
        this.imdbId = imdbId;
        this.title = title;
        this.releaseDate = releaseDate;
        this.trailerLink = trailerLink;
        this.poster = poster;
        this.genres = genres;
        this.backdrops = backdrops;
        this.reviews = reviews;
    }
}
