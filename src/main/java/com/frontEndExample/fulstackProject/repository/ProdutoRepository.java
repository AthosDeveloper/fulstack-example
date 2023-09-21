package com.frontEndExample.fulstackProject.repository;

import com.frontEndExample.fulstackProject.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
