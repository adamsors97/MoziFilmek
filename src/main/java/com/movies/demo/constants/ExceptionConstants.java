package com.movies.demo.constants;

import lombok.Getter;

public enum ExceptionConstants {
    MOVIE_NOT_FOUND("MOVIE_NOT_FOUND"),
    USER_NOT_FOUND("USER_NOT_FOUND");

    @Getter
    final String message;

    ExceptionConstants(final String message) {
        this.message = message;
    }


}
