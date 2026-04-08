package com.mepr.prova.models;

import com.mepr.prova.enums.StatusProduto;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_produtos")
@Getter
@Setter
@Data
public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private StatusProduto status;

    public ProdutoModel(){}
}
