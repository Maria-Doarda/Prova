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
}
