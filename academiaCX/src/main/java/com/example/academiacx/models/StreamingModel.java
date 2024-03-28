package com.example.academiacx.models;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_streaming")
public class StreamingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String url;

    @OneToMany(mappedBy = "streaming")
    private List<MovieModel> movies;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getUrl() {return url;}

    public void setUrl(String url) {this.url = url;}

    public List<MovieModel> getMovies() {return movies;}

    public void setMovies(List<MovieModel> movies) {this.movies = movies;}

}
