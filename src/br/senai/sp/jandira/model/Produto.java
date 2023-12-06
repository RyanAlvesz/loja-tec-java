package br.senai.sp.jandira.model;

abstract class Produto {

    private int qntDisponivel, id;

    private double preco;
    private String nome, fornecedor;

    public Produto(int qntDisponivel, double preco, String fornecedor, String nome){

        this.qntDisponivel = qntDisponivel;
        this.preco = preco;
        this.fornecedor = fornecedor;
        this.nome = nome;

    }

    public int getQntDisponivel() {
        return qntDisponivel;
    }

    public void setQntDisponivel(int qntDisponivel) {
        this.qntDisponivel = qntDisponivel;
    }

    public int getId() {
        return id;
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
