package com.movies.demo.services;

import com.movies.demo.model.Movie;
import com.movies.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl {

    private final MovieRepository movieRepository;

    @Autowired
    public SearchServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

//    public List<Movie> getMoviesBySearch(final String title, final String author, final String genre) {
////        return movieRepository.findAllByTitleOrGenreIgnoreCase(title, author, genre);
////    }

    public List<Movie> getMoviesByTitle(final String title) {
        return movieRepository.findByTitleContainingIgnoreCase(title);
    }

}
