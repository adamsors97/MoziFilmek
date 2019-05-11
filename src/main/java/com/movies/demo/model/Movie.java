package com.movies.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVIES")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "RELEASE_DATE")
    private String releasedate;
    @Column(name = "GENRE")
    private String genre;
    @Column(name = "COUNTRY")
    private String countries;
    @Column(name = "PRICE")
    private Long price;
    @Column(name = "COVER")
    private String cover;
    @Override
    public String toString() {
        return "Film {" +
                "Cim: "+title +
                " , Ár : "+price+'}';
    }
}
