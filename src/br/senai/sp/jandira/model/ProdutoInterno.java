package br.senai.sp.jandira.model;

public class ProdutoInterno extends Produto{

    int ram, memoria, nucleos;

    public ProdutoInterno(int qntDisponivel, double preco, String fornecedor, String nome) {
        super(qntDisponivel, preco, fornecedor, nome);
        this.ram = 0;
        this.memoria = 0;
        this.nucleos = 0;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }
}
