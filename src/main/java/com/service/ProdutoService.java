package com.service;
import com.model.Produto;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class ProdutoService {

    private List<Produto>listaDeProdutos = new ArrayList<>();

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public List ordenandoPorPeso(List listaDeProodutos) {

        Collections.sort(listaDeProdutos, new Comparator<Produto>() {
            @Override
            public int compare(Produto p1, Produto p2) {
                return p1.getPeso().compareTo(p2.getPeso());
            }
        });
        return listaDeProodutos;

    }
    public void adicionaProdutos() {
        getListaDeProdutos().add(new Produto("Arrroz", 22.9, 5.0));
        getListaDeProdutos().add(new Produto("feijao", 6.99, 1.0));
        getListaDeProdutos().add(new Produto("açucar", 2.89, 10.0));
        getListaDeProdutos().add(new Produto("Galão de Água", 8.95, 20.0));
    }
}
