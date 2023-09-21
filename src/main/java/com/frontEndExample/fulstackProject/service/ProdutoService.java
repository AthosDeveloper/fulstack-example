package com.frontEndExample.fulstackProject.service;

import com.frontEndExample.fulstackProject.model.Produto;

import java.util.List;

public interface ProdutoService {
    List<Produto> findAll();
    Produto findById(Long id);
    Produto create(Produto obj);

}
