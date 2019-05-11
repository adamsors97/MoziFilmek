package com.movies.demo.controller;

import com.movies.demo.services.SearchServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/search")
public class SearchController extends  BaseController {
    private SearchServiceImpl searchService;

    @Autowired
    public SearchController(SearchServiceImpl searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/{title}")
    public String getBooksByTitle(@PathVariable final String title) {
        return createGsonFromObject(searchService.getMoviesByTitle(title));
    }
}
