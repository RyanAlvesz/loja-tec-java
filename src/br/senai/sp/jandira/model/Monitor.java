package br.senai.sp.jandira.model;

public class Monitor extends Produto{

    int tamanho;
    String tipo;
    public Monitor(int qntDisponivel, int id, int preco, String fornecedor, String nome, int tamanho) {
        super(qntDisponivel, id, preco, fornecedor, nome);
        this.tamanho = tamanho;
        this.tipo = "Monitor";
    }

}
