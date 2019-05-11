package com.movies.demo.exceptions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MovieNotFoundException extends Exception {
    public MovieNotFoundException(final String msg) {
        super(msg);
        log.error(msg);
    }

}
