package com.example.academiacx.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
//import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "tb_studio")
public class StudioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String country;

    @JsonIgnore
    @OneToMany(mappedBy = "studio")
    private List<MovieModel> movies;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country) {this.country = country;}

    @JsonIgnore
    public List<MovieModel> getMovies() {return movies;}

    public void setMovies(List<MovieModel> movies) {this.movies = movies;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}
}
