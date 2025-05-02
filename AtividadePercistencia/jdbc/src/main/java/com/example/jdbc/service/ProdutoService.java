package com.example.jdbc.service;

import com.example.jdbc.model.Produto;
import com.example.jdbc.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public void salvar(Produto produto) {
        repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void atualizar(Produto produto) {
        repository.update(produto);
    }

    public void deletar(Long id) {
        repository.delete(id);
    }
}
