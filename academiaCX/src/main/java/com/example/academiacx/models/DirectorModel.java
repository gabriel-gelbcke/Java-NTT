package com.example.academiacx.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_director")
public class DirectorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "director_movie",
            joinColumns = @JoinColumn(name = "director_id"),
            inverseJoinColumns = @JoinColumn(name = "movie_id"))
    private List<MovieModel> movies;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public List<MovieModel> getMovies() {return movies;}

    public void setMovies(List<MovieModel> movies) {this.movies = movies;}
}
