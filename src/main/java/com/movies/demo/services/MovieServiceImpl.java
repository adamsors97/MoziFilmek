package com.movies.demo.services;

import com.movies.demo.constants.ExceptionConstants;
import com.movies.demo.exceptions.MovieNotFoundException;
import com.movies.demo.model.Movie;
import com.movies.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl {
    private final MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository){
            this.movieRepository = movieRepository;
    }
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public Movie getMovieById(final int id) throws MovieNotFoundException {
        final Movie movie = movieRepository.findById(id);
        System.out.print("Lekérés : Id :" +id + " movie : " +movie);
        if (movie == null) {
            throw new MovieNotFoundException(ExceptionConstants.MOVIE_NOT_FOUND.getMessage());
        }
        return movie;
    }

}
