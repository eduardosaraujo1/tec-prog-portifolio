package br.edu.fatecpg.atvencaps.model;

public class Produto {
	private String nome;
	private double preco;
	private double quantidadeEstoque;
	
	public Produto(String nome, double preco, double quantidadeEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) return;
		
		this.preco = preco;
	}

	public double getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(double quantidadeEstoque) {
		if (quantidadeEstoque < 0) return;
		
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	@Override
	public String toString() {
		return "Produto [nome="+nome+",preco="+preco+",quantidadeEstoque="+quantidadeEstoque+"]";
	}
}
