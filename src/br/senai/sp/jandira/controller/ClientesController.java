package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.*;
import java.sql.*;

public class ClientesController {

    Conexao conexao = new Conexao();
    Connection connection = conexao.getConnection();

    public void cadastrarCliente(Clientes clientes) throws SQLException {

        Statement statement = connection.createStatement();
        String queryCadastrar = "INSERT INTO clientes (nome, cpf, idade, email) values (" +
                clientes.getNome() + "', '" +
                clientes.getCpf() + "', " +
                clientes.getIdade() + ", '" +
                clientes.getEmail() + "')";

        statement.executeUpdate(queryCadastrar);
        System.out.println("Funcionário cadastrado com sucesso!");
        System.out.println("");

    }

    public void listarClientes() throws SQLException {

        Statement statement = connection.createStatement();
        String queryListar = "SELECT * FROM clientes";
        ResultSet resultSet = statement.executeQuery(queryListar);

        Clientes cliente = new Clientes();

        while (resultSet.next()){

            cliente.setNome(resultSet.getString("nome"));
            cliente.setCpf(resultSet.getInt("cpf"));
            cliente.setIdade(resultSet.getInt("idade"));
            cliente.setEmail(resultSet.getString("email"));
            cliente.setId(resultSet.getInt("id"));

            System.out.println("------------------------------------");
            System.out.println(cliente.getId() + " - " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("IDADE: " + cliente.getIdade());
            System.out.println("EMAIL: " + cliente.getEmail());
            System.out.println("------------------------------------");

        }

    }

    public void deletarCliente(int cpf) throws SQLException {

        Statement statement = connection.createStatement();

        String queryPesquisarNome = "SELECT nome FROM clientes WHERE cpf = '" + cpf + "'";
        ResultSet resultSet = statement.executeQuery(queryPesquisarNome);

        String queryDeletar = "DELETE FROM clientes WHERE cpf = '" + cpf + "'";
        statement.executeUpdate(queryDeletar);

        Clientes cliente = new Clientes();
        cliente.setNome(resultSet.getString("nome"));

        System.out.println(cliente.getNome() + " deletado(a) com sucesso!");
        System.out.println("");

    }

}
