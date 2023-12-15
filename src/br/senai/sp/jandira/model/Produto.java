package br.senai.sp.jandira.model;

import java.util.Scanner;

abstract class Produto {

    // Instânciando Scanner
    Scanner scanner = new Scanner(System.in);

    // Criando variáveis
    private int qntDisponivel, id;
    private double preco;
    private String nome, fornecedor;

    // Métodos
    public void cadastrarProduto(){

        System.out.print("Informe o nome do produto: ");
        setNome(scanner.nextLine());

        System.out.print("Informe a quantidade disponível: ");
        setQntDisponivel(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Informe o preço do produto: ");
        setPreco(scanner.nextDouble());
        scanner.nextLine();

        System.out.print("Informe o fornecedor do produto: ");
        setFornecedor(scanner.nextLine());

        System.out.println("Produto cadastrado com sucesso!");

    }


    // Getter e Setter (Encapsulamento)
    public int getQntDisponivel() {
        return qntDisponivel;
    }

    public void setQntDisponivel(int qntDisponivel) {
        this.qntDisponivel = qntDisponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

}
