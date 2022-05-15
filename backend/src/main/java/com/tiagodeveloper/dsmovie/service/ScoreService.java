package com.tiagodeveloper.dsmovie.service;

import com.tiagodeveloper.dsmovie.domain.Movie;
import com.tiagodeveloper.dsmovie.domain.Score;
import com.tiagodeveloper.dsmovie.domain.User;
import com.tiagodeveloper.dsmovie.dto.MovieDTO;
import com.tiagodeveloper.dsmovie.dto.ScoreDTO;
import com.tiagodeveloper.dsmovie.repository.MovieRepository;
import com.tiagodeveloper.dsmovie.repository.ScoreRepository;
import com.tiagodeveloper.dsmovie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ScoreService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ScoreRepository scoreRepository;

    @Transactional
    public MovieDTO saveScore(ScoreDTO dto){

        User user = userRepository.findByEmail(dto.getEmail());

        if (user == null){
            user = new User();
            user.setEmail(dto.getEmail());
            user = userRepository.saveAndFlush(user);
        }

        Movie movie = movieRepository.findById(dto.getMovieId()).get();

        Score score = new Score();
        score.setMovie(movie);
        score.setUser(user);
        score.setValue(dto.getScore());

        score = scoreRepository.saveAndFlush(score);

        double sum = 0.0;

        for (Score s : movie.getScores()){
            sum = sum + s.getValue();
        }

        double avg = sum / movie.getScores().size();

        movie = movieRepository.save(movie);

        return new MovieDTO(movie);

    }


}
