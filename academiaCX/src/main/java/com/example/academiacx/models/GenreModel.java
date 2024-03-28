package com.example.academiacx.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_genre")
public class GenreModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String genreName) {this.name = name;}

}
