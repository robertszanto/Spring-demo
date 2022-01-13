package com.example.demo.service;

import com.example.demo.model.Elev;
import com.example.demo.repostory.ElevRepository;
import org.springframework.stereotype.Service;

@Service
public class ElevService {

    private  ElevRepository elevRepository;

    public Elev saveElev(Elev elev) {

        return elevRepository.save(elev);
    }
}
