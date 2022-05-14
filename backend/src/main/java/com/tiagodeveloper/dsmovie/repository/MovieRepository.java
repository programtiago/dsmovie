package com.tiagodeveloper.dsmovie.repository;

import com.tiagodeveloper.dsmovie.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
