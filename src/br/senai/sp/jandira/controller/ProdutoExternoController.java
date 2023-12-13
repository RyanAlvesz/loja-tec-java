package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.*;
import java.sql.*;

public class ProdutoExternoController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();

    public void cadastrarProdutoExterno(ProdutoExterno produtoExterno) throws SQLException {

        Statement statement = connection.createStatement();
        String queryCadastro = "INSERT INTO produtos (qnt_disponivel, preco, nome, fornecedor, tamanho, cor, bluetooth) values (" +
                produtoExterno.getQntDisponivel() + ", '" +
                produtoExterno.getPreco() + ", '" +
                produtoExterno.getNome() + ", '" +
                produtoExterno.getFornecedor() + ", '" +
                produtoExterno.getTamanho() + ", '" +
                produtoExterno.getCor() + ", '" +
                produtoExterno.getBluetooth() + "')";

        statement.executeUpdate(queryCadastro);
        System.out.println("Produto Cadastrado com sucesso!");

    }

}
