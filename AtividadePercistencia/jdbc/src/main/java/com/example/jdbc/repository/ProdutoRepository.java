package com.example.jdbc.repository;

import com.example.jdbc.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProdutoRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Create
    public void save(Produto produto) {
        String sql = "INSERT INTO produto (nome, preco) VALUES (?, ?)";
        jdbcTemplate.update(sql, produto.getNome(), produto.getPreco());
    }

    // Read (todos)
    public List<Produto> findAll() {
        String sql = "SELECT id, nome, preco FROM produto";
        return jdbcTemplate.query(sql, this::mapRowToProduto);
    }

    // Read (por ID)
    public Produto findById(Long id) {
        String sql = "SELECT id, nome, preco FROM produto WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, this::mapRowToProduto, id);
    }

    // Update
    public void update(Produto produto) {
        String sql = "UPDATE produto SET nome = ?, preco = ? WHERE id = ?";
        jdbcTemplate.update(sql, produto.getNome(), produto.getPreco(), produto.getId());
    }

    // Delete
    public void delete(Long id) {
        String sql = "DELETE FROM produto WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    // Mapeamento de ResultSet para Produto
    private Produto mapRowToProduto(ResultSet rs, int rowNum) throws SQLException {
        return new Produto(
                rs.getLong("id"),
                rs.getString("nome"),
                rs.getDouble("preco"));
    }
}
