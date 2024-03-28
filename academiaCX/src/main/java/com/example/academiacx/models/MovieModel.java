package com.example.academiacx.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
//import jakarta.validation.Valid;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.List;

@Entity
@Table(name = "tb_movie")
public class MovieModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private GenreModel genre;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    private StudioModel studio;

    @ManyToOne
    @JoinColumn(name = "franchise_id")
    private FranchiseModel franchise;

    @ManyToMany(mappedBy = "movies")
    private List<DirectorModel> directors;

    @ManyToOne
    @JoinColumn(name = "streaming_id")
    private StreamingModel streaming;

    //    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<ActorModel> actors;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GenreModel getGenre() {return genre;}

    public void setGenre(GenreModel genre) {this.genre = genre;}

    public StudioModel getStudio() {return studio;}

    public void setStudio(StudioModel studio) {this.studio = studio;}

    public FranchiseModel getFranchise() {return franchise;}

    public void setFranchise(FranchiseModel franchise) {this.franchise = franchise;}

    public List<DirectorModel> getDirectors() {return directors;}

    public void setDirectors(List<DirectorModel> directors) {this.directors = directors;}

    public StreamingModel getStreaming() {return streaming;}

    public void setStreaming(StreamingModel streaming) {this.streaming = streaming;}

    public List<ActorModel> getActors() {return actors;}

    public void setActors(List<ActorModel> actors) {this.actors = actors;}
}
