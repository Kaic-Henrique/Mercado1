package com.example.mercado1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produto", schema = "caixa_de_pagamento")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prd_id")
    private Long id;

    @Column(name = "prd_descricao", nullable = false, length = 70)
    private String descricao;

    @Column(name = "prd_preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "prd_unid_medida", nullable = false)
    private Integer unidadeDeMedida;

    @Column(name = "prd_cod_interno", nullable = false)
    private Integer codigoInterno;

    @ManyToOne
    @JoinColumn(name="prd_nf_id")
    private NotaFiscalEntity notaFiscal;

    // TODO - Cirar Controllers e Services de Produto e NotaFiscal
}
