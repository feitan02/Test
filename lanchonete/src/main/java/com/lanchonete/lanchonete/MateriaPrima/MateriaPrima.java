package com.lanchonete.lanchonete.MateriaPrima;

import com.lanchonete.lanchonete.GerarId.GerarId;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "materiaPrima")
public class MateriaPrima extends GerarId {

    @Column(name = "nome")
    private String nome;

    @Column(name = "qtdEstoque")
    private Integer qtdEstoque; // cadastrar inicialmente com 0
}