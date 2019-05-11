package com.movies.demo.controller;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
public class BaseController {

    String createGsonFromObject(final Object object) {
        return new Gson().toJson(object);
    }

}