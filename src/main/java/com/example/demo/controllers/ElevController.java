package com.example.demo.controllers;

import com.example.demo.model.Elev;
import com.example.demo.service.ElevService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("elev")
@RequiredArgsConstructor
public class ElevController {

    private final ElevService elevService;

    @PostMapping
    public ResponseEntity<Elev> save(@RequestBody Elev elev){
        Elev savedEelev = elevService.saveElev(elev);
        return  new ResponseEntity<>(savedEelev, HttpStatus.CREATED);
    }

}
