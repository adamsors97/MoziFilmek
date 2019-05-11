package com.movies.demo;

import com.movies.demo.model.Genre;
import com.movies.demo.model.Movie;
import com.movies.demo.repository.GenresRepository;
import com.movies.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import static java.lang.System.exit;

@SpringBootApplication
public class MoziFilmekApplication  {//implements CommandLineRunner
    @Autowired
    DataSource dataSource;

    @Autowired
    GenresRepository genresRepository;
    @Autowired
    MovieRepository movieRepository;
    public static void main(String[] args) {
        SpringApplication.run(MoziFilmekApplication.class, args);
    }
//    @Transactional(readOnly = true)
//    @Override
//    public void run(String... args) throws Exception {
//
////        System.out.println("DATASOURCE = " + dataSource);
////        System.out.println("\n1.findAll()...");
////        for (Genre genre : genresRepository.findAll()) {
////            System.out.println(genre);
////        }
////        System.out.println("Done!");
////        System.out.println("\n2.findAll()...");
////        for (Movie movie : movieRepository.findAll()) {
////            System.out.println(movie);
////        }
////        System.out.println("Done!");
////        exit(0);
//    }
}
