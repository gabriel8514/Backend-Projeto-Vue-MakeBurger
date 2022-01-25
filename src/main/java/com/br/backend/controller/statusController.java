package com.br.backend.controller;

import com.br.backend.model.statusModel;
import com.br.backend.repository.statusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/status")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class statusController {

    @Autowired
    private statusRepository repository;

    @GetMapping
    public ResponseEntity<List<statusModel>> GetAll(){
        return ResponseEntity.ok(repository.findAll());
    }
}
