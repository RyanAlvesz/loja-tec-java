package br.senai.sp.jandira.model;

public class Clientes {

    int idade, cpf, id;
    String nome, email;

    public Clientes(int idade, int cpf, int id, String nome, String email) {
        this.idade = idade;
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

}
