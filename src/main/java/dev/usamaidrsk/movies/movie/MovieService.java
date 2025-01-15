package dev.usamaidrsk.movies.movie;

import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.bson.types.ObjectId;

import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRespository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }
    
    public Optional<Movie> getMovieById(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
