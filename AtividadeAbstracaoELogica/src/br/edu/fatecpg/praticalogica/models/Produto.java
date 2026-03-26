package br.edu.fatecpg.praticalogica.models;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void entrada(int qtd) {
        this.quantidade += qtd;
    }

    public void saida(int qtd) {
        this.quantidade -= qtd;
    }

    public double calcularValorTotal() {
        return this.preco * this.quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

}
