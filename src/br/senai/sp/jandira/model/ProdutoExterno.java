package br.senai.sp.jandira.model;

public class ProdutoExterno extends Produto{

    private int tamanho;
    private String cor;
    private Boolean bluetooth;

    public ProdutoExterno() {
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

