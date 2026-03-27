package br.edu.fatecpg.encapsulamento.model;

public class Vendedor {
	private int codigo;
	private String setor;
	private int produtosEstoque;

	public Vendedor(int codigo, String setor, int produtosEstoque) {
		super();
		this.codigo = codigo;
		this.setor = setor;
		this.produtosEstoque = produtosEstoque;
	}

	public String realizarVenda(int qtProdutos) {
		if (qtProdutos <= this.produtosEstoque) {
			produtosEstoque -= qtProdutos;
			return "Venda realizada com sucesso";
		}
		
		return "Número de produtos inválido.";
	}
}
