package com.tiagodeveloper.dsmovie.repository;

import com.tiagodeveloper.dsmovie.domain.Score;
import com.tiagodeveloper.dsmovie.domain.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
