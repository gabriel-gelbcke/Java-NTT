package com.example.academiacx.models;


import com.example.academiacx.models.*;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String username;

//    @ManyToMany
//    private List<RoleModel> roles;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    private MovieModel movie;

    //id
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //username
    public String getUsername() {return username;}
    public void setUsername(String username) {this.username = username;}

    //email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    //movie
    public MovieModel getMovie() {
        return movie;
    }
    public void setMovie(MovieModel movie) {
        this.movie = movie;
    }

    //password
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
}
