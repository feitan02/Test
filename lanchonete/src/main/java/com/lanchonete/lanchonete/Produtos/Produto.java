package com.lanchonete.lanchonete.Produtos;

import com.lanchonete.lanchonete.GerarId.GerarId;

import com.lanchonete.lanchonete.Receita.Receita;
import com.lanchonete.lanchonete.StatusProduto.StatusProduto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "produtos")
public class Produto extends GerarId {

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private Integer preco;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "statusProduto")
    private StatusProduto Status;

    @Column(name = "estoque")
    private Integer estoque;

}
