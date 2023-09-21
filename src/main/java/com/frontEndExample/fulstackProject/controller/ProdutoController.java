package com.frontEndExample.fulstackProject.controller;

import com.frontEndExample.fulstackProject.model.Produto;
import com.frontEndExample.fulstackProject.service.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
    private  static  final String ID = "/{id}";
    @Autowired
    private ProdutoServiceImpl service;
    @CrossOrigin(origins = "http://127.0.0.1.5500")
    @PostMapping
public ResponseEntity<Produto> create(@RequestBody Produto produto){
        URI uri = ServletUriComponentsBuilder
                .fromCurrentRequest().path(ID)
                .buildAndExpand(service.create(produto).getId()).toUri();
        return  ResponseEntity.created(uri).build();
}
    @CrossOrigin(origins = "http://127.0.0.1.5500")
@GetMapping(value = ID)
public  ResponseEntity<Produto> findById(@PathVariable Long id){
    return  ResponseEntity.ok().body(service.findById(id));
}
    @CrossOrigin(origins = "http://127.0.0.1.5500")
@GetMapping
public  ResponseEntity<List<Produto>> findAll() {
return  ResponseEntity.ok().body(service.findAll());
}
}
