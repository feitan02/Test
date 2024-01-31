package com.lanchonete.lanchonete.Produtos;

import com.lanchonete.lanchonete.StatusProduto.StatusProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    @Transactional
    public Produto cadastrarProduto(Produto produto){
        if (validarMateriaPrima(produto)) {
            return this.produtoRepository.save(produto);
        } else {
            throw new IllegalArgumentException("Produto não pode ser cadastrado: não atende aos critérios de validação.");
        }
    }

    public boolean validarMateriaPrima(Produto produto){
        StatusProduto status = StatusProduto.MATERIAPRIMA;
        if (produto.getStatus() == status && produto.getEstoque() == 0){
            return true;
        }
        return false;
    }
}
