package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.*;
import java.sql.*;

public class ProdutoExternoController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();

    public void cadastrarProdutoExterno(ProdutoExterno produtoExterno) throws SQLException {

        Statement statement = connection.createStatement();
        String queryCadastro = "INSERT INTO produtos (qnt_disponivel, preco, nome, fornecedor, tamanho, cor, bluetooth) values (" +
                produtoExterno.getQntDisponivel() + ", " +
                produtoExterno.getPreco() + ", '" +
                produtoExterno.getNome() + "', '" +
                produtoExterno.getFornecedor() + "', " +
                produtoExterno.getTamanho() + ", '" +
                produtoExterno.getCor() + "', " +
                produtoExterno.getBluetooth() + ")";

        statement.executeUpdate(queryCadastro);
        System.out.println("");

    }

    public void listarProdutos() throws SQLException {

        Statement statement = connection.createStatement();
        String queryConsulta = "SELECT * FROM produtos WHERE ram IS NULL";
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        ProdutoExterno produtoExterno = new ProdutoExterno();

        while (resultSet.next()){
            produtoExterno.setId(resultSet.getInt("id"));
            produtoExterno.setQntDisponivel(resultSet.getInt("qnt_disponivel"));
            produtoExterno.setPreco(resultSet.getDouble("preco"));
            produtoExterno.setFornecedor(resultSet.getString("fornecedor"));
            produtoExterno.setNome(resultSet.getString("nome"));
            produtoExterno.setTamanho(resultSet.getInt("tamanho"));
            produtoExterno.setCor(resultSet.getString("cor"));
            produtoExterno.setBluetooth(resultSet.getBoolean("bluetooth"));

            System.out.println("------------------------------------");
            System.out.println(produtoExterno.getId() + " - " + produtoExterno.getNome());
            System.out.println("PREÇO: " + produtoExterno.getPreco());
            System.out.println("FORNECEDOR: " + produtoExterno.getFornecedor());
            System.out.println("QUANTIDADE DISPONÍVEL: " + produtoExterno.getQntDisponivel());
            System.out.println("TAMANHO: " + produtoExterno.getTamanho());
            System.out.println("COR: " + produtoExterno.getCor());

            String bluetooth;
            if (produtoExterno.getBluetooth() == false){
                bluetooth = "Não";
            } else {
                bluetooth = "Sim";
            }

            System.out.println("BLUETOOTH: " + bluetooth);
            System.out.println("------------------------------------");

        }

        System.out.println("");

    }

    public void editarProduto(int id, int qntProduto) throws SQLException {

        Statement statement = connection.createStatement();
        String queryAtualizar = "UPDATE produtos SET qnt_disponivel = " + qntProduto + " WHERE id = " + id;
        statement.executeUpdate(queryAtualizar);
        System.out.println("Dados atualizados com sucesso!");
        System.out.println("");

    }

}
