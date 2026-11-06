package com.exemplo.api_produtos.service;

import com.exemplo.api_produtos.model.Produto;
import com.exemplo.api_produtos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository){
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProdutos(){
        return produtoRepository.findAll();
    }

    public Produto criarProduto(Produto produto){
       return produtoRepository.save(produto);

    }

    public Produto atualizarProduto(Produto dadosAtualizados, Long id){
        return produtoRepository.findById(id)
                .map(produto -> {
                    produto.setNome(dadosAtualizados.getNome());
                    produto.setPreco(dadosAtualizados.getPreco());

                    return produtoRepository.save(produto);
                })
                .orElse(null);

    }

    public boolean excluirProduto(Long id) {
        if(produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
            return true;
        }

        return false;
    }
}
