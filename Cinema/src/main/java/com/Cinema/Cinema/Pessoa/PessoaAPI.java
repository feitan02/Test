package com.Cinema.Cinema.Pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class PessoaAPI {

    private final PessoaService pessoaService;

    @Autowired
    public PessoaAPI(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @PostMapping("")
    public ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody Pessoa pessoa){
        return ResponseEntity.ok(this.pessoaService.cadastrarPessoa(pessoa));
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<Pessoa>> buscarNome(@RequestParam(name = "nome") String nome){
        return ResponseEntity.ok(this.pessoaService.buscarNome(nome));
    }

//    @PostMapping("/comprar assento/{filmeID}")
//    public ResponseEntity comprarAssento(@PathVariable Integer filmeId,
//                                         @RequestParam(name = "pessoaId") Integer pessoaId,
//                                         @RequestBody ComprarAssentoDTO comprarAssentoDTODTO){
//
//    }

}