package com.example.wap.controllers;

import com.example.wap.models.Movie;
import com.example.wap.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieRepository movieRepository;
    @GetMapping("/api/courses")
    public List<Movie> findAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }
}
