package com.movies.demo.repository;

import com.movies.demo.model.Genre;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GenresRepository extends CrudRepository<Genre, Long> {

}