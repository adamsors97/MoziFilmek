package com.movies.demo.controller;

import com.movies.demo.exceptions.MovieNotFoundException;
import com.movies.demo.model.Movie;
import com.movies.demo.repository.MovieRepository;
import com.movies.demo.services.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/movies")
public class MovieController extends BaseController {
        private MovieServiceImpl movieService;
    @Autowired
        public MovieController(MovieServiceImpl movieService){this.movieService = movieService;};
    @GetMapping("/all")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
    @GetMapping("/id/{id}")
    public String getMovieById(@PathVariable final int id) throws MovieNotFoundException {
        return createGsonFromObject(movieService.getMovieById(id));
    }
}
