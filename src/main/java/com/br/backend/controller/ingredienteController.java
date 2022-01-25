package com.br.backend.controller;

import com.br.backend.model.ingredienteModel;
import com.br.backend.repository.ingredienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ingredientes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ingredienteController {

    @Autowired
    private ingredienteRepository repository;

//    @GetMapping
//    public String hello(){
//        return "Teste Api Back end, 25/01, ddd";
//    }
//}

    @GetMapping
    public ResponseEntity<List<ingredienteModel>> GetAll(){
        return ResponseEntity.ok(repository.findAll());
    }
}

