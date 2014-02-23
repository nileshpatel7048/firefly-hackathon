package com.tritl.firefly.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.annotation.RelatedTo;
import org.springframework.data.neo4j.annotation.RelatedToVia;

@NodeEntity
public class Movie {

  @GraphId Long id;

  @Indexed(type = FULLTEXT, indexName = "search")
  String title;

  Person director;

  @RelatedTo(type="ACTS_IN", direction = INCOMING)
  Set<Person> actors;

  @RelatedToVia(type = "RATED")
  Iterable<Rating> ratings;

  @Query("start movie=node({self}) match movie-->genre<--similar return similar")
  Iterable<Movie> similarMovies;
}