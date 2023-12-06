package br.senai.sp.jandira.model;

public class ProdutoExterno extends Produto{

    int tamanho;
    String cor;
    Boolean bluetooth;

    public ProdutoExterno(int qntDisponivel, double preco, String fornecedor, String nome) {
        super(qntDisponivel, preco, fornecedor, nome);
        this.tamanho = 0;
        this.cor = "Preto";
        this.bluetooth = false;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}

