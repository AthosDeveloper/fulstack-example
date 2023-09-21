package com.frontEndExample.fulstackProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Table(name = "tb_produtos")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Produto implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
private String nome;
    private  Integer quantidade;
    private BigDecimal preco;
    private Long codigo;
}
