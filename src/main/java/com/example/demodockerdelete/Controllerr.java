package com.example.demodockerdelete;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controllerr {

    private final Repo repo;

    public Controllerr(Repo repo) {
        this.repo = repo;
    }

    @PostMapping("/save")
    public ResponseEntity<School> schoolResponseEntity(@RequestBody School school){

         return ResponseEntity.ok(repo.save(school));
    }

    @GetMapping("/all")
    public List<School> get(){
        return repo.findAll();
    }
}
