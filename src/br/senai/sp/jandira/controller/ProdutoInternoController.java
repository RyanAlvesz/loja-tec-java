package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.*;
import java.sql.*;

public class ProdutoInternoController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();

    public void cadastrarProdutoInterno(ProdutoInterno produtoInterno) throws SQLException {

        Statement statement = connection.createStatement();
        String queryCadastro = "INSERT INTO produtos (qnt_disponivel, preco, nome, fornecedor, ram, memoria, nucleos) values (" +
                produtoInterno.getQntDisponivel() + ", '" +
                produtoInterno.getPreco() + ", '" +
                produtoInterno.getNome() + ", '" +
                produtoInterno.getFornecedor() + ", '" +
                produtoInterno.getRam() + ", '" +
                produtoInterno.getMemoria() + ", '" +
                produtoInterno.getNucleos() + "')";

        statement.executeUpdate(queryCadastro);
        System.out.println("Produto Cadastrado com sucesso!");

    }

    public void listarProdutos() throws SQLException {

        Statement statement = connection.createStatement();
        String queryConsulta = "SELECT * FROM produtos WHERE ram IS NOT NULL";
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        ProdutoInterno produtoInterno = new ProdutoInterno();

        while (resultSet.next()){
            produtoInterno.setQntDisponivel(resultSet.getInt("qnt_disponivel"));
            produtoInterno.setPreco(resultSet.getDouble("preco"));
            produtoInterno.setFornecedor(resultSet.getString("fornecedor"));
            produtoInterno.setNome(resultSet.getString("nome"));
            produtoInterno.setRam(resultSet.getInt("ram"));
            produtoInterno.setMemoria(resultSet.getInt("memoria"));
            produtoInterno.setNucleos(resultSet.getInt("nucleos"));

            System.out.println("------------------------------------");
            System.out.println(produtoInterno.getId() + " - " + produtoInterno.getNome());
            System.out.println("------------------------------------");

        }

    }


}
