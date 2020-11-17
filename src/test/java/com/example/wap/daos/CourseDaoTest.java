package com.example.wap.daos;

import com.example.wap.models.Movie;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class CourseDaoTest {
    @Autowired
    MovieDao dao;

    @Test
    void findAllCourses() {
        Iterable<Movie> movies = dao.findAllMovies();
        for(Movie movie: movies) {
            System.out.println(movies);
        }
    }

    @Test
    void findCourseById() {
    }

    @Test
    void createCourse() {
    }

    @Test
    void updateCourse() {
    }

    @Test
    void deleteCourse() {
    }
}