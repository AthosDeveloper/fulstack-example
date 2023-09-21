package com.frontEndExample.fulstackProject.service;

import com.frontEndExample.fulstackProject.model.Produto;
import com.frontEndExample.fulstackProject.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements  ProdutoService{
    @Autowired
    private ProdutoRepository produtoRepository;


    @Override
    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto findById(Long id) {
   Produto obj = produtoRepository.findById(id).get();
return  obj;
    }

    @Override
    public Produto create(Produto obj) {
        return  produtoRepository.save(obj);
    }

}
