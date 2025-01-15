package dev.usamaidrsk.movies.movie;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
  @Id
  private ObjectId id;
  private String imdbId;
  private String title;
  private String trailerLink;
  private String releaseDate;
  private String poster;
  private List<String> genres;
  private List<String> backdrops;
  @DocumentReference
  private List<String> reviewIds;

  public Movie(String imdbId, String title, String trailerLink, String releaseDate, String poster, List<String> genres, List<String> backdrops, List<String> reviewIds) {
    this.imdbId = imdbId;
    this.title = title;
    this.trailerLink = trailerLink;
    this.releaseDate = releaseDate;
    this.poster = poster;
    this.genres = genres;
    this.backdrops = backdrops;
    this.reviewIds = reviewIds;
  }
}
