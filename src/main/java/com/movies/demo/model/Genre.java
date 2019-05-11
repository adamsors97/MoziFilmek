package com.movies.demo.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "GENRES")
public class Genre {

    @Id
    @Column(name = "ID")
    Long id;
    @Column(name = "GENRE")
    String genre;

    public Genre(String name){
        this.genre = name;
    }
    public Genre() {
    }
    @Override
    public String toString() {
        return "Genre{" +
                "Name = "+genre +
                '}';
    }
}

