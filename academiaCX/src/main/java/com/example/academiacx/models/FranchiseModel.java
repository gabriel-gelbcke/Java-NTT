package com.example.academiacx.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_franchise")
public class FranchiseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private GenreModel genre;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    private StudioModel studio;

    @OneToMany(mappedBy = "franchise")
    private List<MovieModel> movies;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public GenreModel getGenre() {return genre;}

    public void setGenre(GenreModel genre) {this.genre = genre;}

    public StudioModel getStudio() {return studio;}

    public void setStudio(StudioModel studio) {this.studio = studio;}

    public List<MovieModel> getMovies() {return movies;}

    public void setMovies(List<MovieModel> movies) {this.movies = movies;}
}
