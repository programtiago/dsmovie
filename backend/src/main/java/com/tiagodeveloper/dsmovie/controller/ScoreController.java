package com.tiagodeveloper.dsmovie.controller;

import com.tiagodeveloper.dsmovie.dto.MovieDTO;
import com.tiagodeveloper.dsmovie.dto.ScoreDTO;
import com.tiagodeveloper.dsmovie.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto){

        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }


}
