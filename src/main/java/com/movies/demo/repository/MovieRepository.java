package com.movies.demo.repository;

import com.movies.demo.model.Movie;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    // SELECT * FROM MOVIES
    // findAll()

    // SELECT * FROM MOVIES WHERE title = :title;
    List<Movie> findByTitleContainingIgnoreCase(String title);

    @Query(value = "SELECT * FROM MOVIES WHERE id = :id", nativeQuery = true)
    Movie findById(@Param("id") int id);
}
