package com.karan.movie.repository;

import com.karan.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepo extends JpaRepository<Movie,Integer> {
}
