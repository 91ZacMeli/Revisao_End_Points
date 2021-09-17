package com.example.demo.controller;
import com.model.Produto;
import com.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/produto")
public class ListarProdutosPorPeso {

    //http://localhost:8080/produto/listarprodutos

    ProdutoService produtoService = new ProdutoService();

    @GetMapping("/listarprodutos")
    public List<Produto>ordenandoLista(){
        produtoService.adicionaProdutos();
       return produtoService.ordenandoPorPeso(produtoService.getListaDeProdutos());

    }

}
