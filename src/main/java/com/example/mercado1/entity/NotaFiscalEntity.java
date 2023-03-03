package com.example.mercado1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "nota_fiscal", schema = "caixa_de_pagamento")
public class NotaFiscalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nf_id")
    private Long id;

    @Column(name = "nf_numero_da_nota", nullable = false)
    private Integer numero;

    @Column(name = "nf_valor_da_nota", nullable = false)
    private BigDecimal valor;

    @OneToMany(mappedBy = "id")
    private List<ProdutoEntity> produtos;
}
