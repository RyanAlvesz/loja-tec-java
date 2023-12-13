package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Clientes {

    // Instânciando Scanner
    Scanner scanner = new Scanner(System.in);

    // Criando variáveis
    private int idade, cpf, id;
    private String nome, email;

    // Métodos
    public void cadastrarCliente() {

        System.out.print("Informe o nome do Cliente: ");
        setNome(scanner.nextLine());
        System.out.print("Informe o cpf do Cliente: ");
        setCpf(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Informe a idade do Cliente: ");
        setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Informe o email do Cliente: ");
        setEmail(scanner.nextLine());

        System.out.println("Cliente cadastrado com sucesso!");

    }

    // Getter e Setter
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
