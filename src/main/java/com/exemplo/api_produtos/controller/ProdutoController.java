package com.exemplo.api_produtos.controller;

import com.exemplo.api_produtos.model.Produto;
import com.exemplo.api_produtos.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController {
   private final ProdutoService produtoService;

   public ProdutoController(ProdutoService produtoService){
       this.produtoService = produtoService;
   }

   @PostMapping ("/produtos")
   @ResponseStatus (HttpStatus.CREATED)
    public Produto criarProduto(@RequestBody Produto produto){
       return produtoService.criarProduto(produto);


   }
   @ResponseStatus (HttpStatus.OK)
   @GetMapping("/produtos")
   public List<Produto> listarProduto(){
       return produtoService.listarProdutos();
   }

   @PutMapping("/produtos/{id}")
   public ResponseEntity<Produto> atualizarProduto(@PathVariable Long id,@RequestBody Produto dadosAtualizados){
       Produto produtoAtualizado = produtoService.atualizarProduto(dadosAtualizados, id);

       if (produtoAtualizado != null){
           return ResponseEntity.ok(produtoAtualizado);
       }

       return ResponseEntity.notFound().build();
   }


   @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Void> excluirProduto(@PathVariable Long id){
       boolean removido = produtoService.excluirProduto(id);

       if (removido){
           return ResponseEntity.noContent().build();
       }
        return ResponseEntity.notFound().build();
   }
}
