CREATE TABLE movie_director(
    movie_id BIGINT NOT NULL,
    director_id BIGINT NOT NULL,
    PRIMARY KEY (movie_id, director_id),
    FOREIGN KEY (movie_id) REFERENCES tb_movie(id),
    FOREIGN KEY (director_id) REFERENCES tb_director(id)
);

--generos
INSERT INTO tb_genre(name) VALUES ('Acão');
INSERT INTO tb_genre(name) VALUES ('Comédia');
INSERT INTO tb_genre(name) VALUES ('Drama');

--estudios
INSERT INTO tb_studio(name, country) VALUES ('Warner', 'Estados Unidos');
INSERT INTO tb_studio(name, country) VALUES ('Universal', 'Canada');
INSERT INTO tb_studio(name, country) VALUES ('Paramount', 'Alemanha');

--franquias
INSERT INTO tb_franchise(name, genre_id, studio_id) VALUES ('Batman', 2, 1);
INSERT INTO tb_franchise(name, genre_id, studio_id) VALUES ('Harry Potter', 3, 2);
INSERT INTO tb_franchise(name, genre_id, studio_id) VALUES ('Star Wars', 1, 3);

--serviços de streaming
INSERT INTO tb_streaming (name, url) VALUES ('Netflix', 'https://www.netflix.com');
INSERT INTO tb_streaming (name, url) VALUES ('Amazon Prime Video', 'https://www.primevideo.com');
INSERT INTO tb_streaming (name, url) VALUES ('Disney+', 'https://www.disneyplus.com');

--diretores
INSERT INTO tb_director (name) VALUES ('Christopher Nolan');
INSERT INTO tb_director (name) VALUES ('Quentin Tarantino');
INSERT INTO tb_director (name) VALUES ('Steven Spielberg');

--filmes
INSERT INTO tb_movie (title, genre_id, studio_id) VALUES ('Inception', 1, 1);
INSERT INTO tb_movie (title, genre_id, studio_id) VALUES ('Pulp Fiction', 2, 2);
INSERT INTO tb_movie (title, genre_id, studio_id) VALUES ('The Irishman', 3, 3);

--usuarios
INSERT INTO tb_user(name, email, password, movie_id, username) VALUES ('João', 'joao@gmail.com', '123', 1, 'Jão');
INSERT INTO tb_user(name, email, password, movie_id, username) VALUES ('Maria', 'maria@gmail.com', '321', 1, 'Mari');
INSERT INTO tb_user(name, email, password, movie_id, username) VALUES ('Pedro', 'pedro@gmail.com', '456', 1, 'Pedrinho');

--filmes diretores
INSERT INTO movie_director (movie_id, director_id) VALUES (1, 1);
INSERT INTO movie_director (movie_id, director_id) VALUES (2, 2);
INSERT INTO movie_director (movie_id, director_id) VALUES (3, 3);

--atores
INSERT INTO tb_actor (name) VALUES ('Leonardo DiCaprio');
INSERT INTO tb_actor (name) VALUES ('Brad Pitt');
INSERT INTO tb_actor (name) VALUES ('Tom Hanks');
--
-- INSERT INTO tb_role (NAME) VALUES('STUDIO_SELECT');
-- INSERT INTO tb_role (NAME) VALUES('STUDIO_SAVE');
-- INSERT INTO tb_role (NAME) VALUES('STUDIO_UPDATE');
-- INSERT INTO tb_role (NAME) VALUES('STUDIO_DELETE');