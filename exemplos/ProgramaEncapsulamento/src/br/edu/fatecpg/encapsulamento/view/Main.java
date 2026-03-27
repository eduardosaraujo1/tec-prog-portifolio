package br.edu.fatecpg.encapsulamento.view;

import br.edu.fatecpg.encapsulamento.model.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("Teste");
		Pessoa p1 = new Pessoa(
				"ThaisC",
				35,
				1.58,
				88
				);
		
		// p1.setIdade(36);
		
		String ret = p1.comer(2500);
		System.out.println(ret);
		System.out.println(p1);
		System.out.println(p1.idade());
		
		Vendedor v1 = new Vendedor(
				1001,
				"Loja",
				20
				);
		
		ret = v1.realizarVenda(10);
		System.out.println(ret);
		ret = v1.realizarVenda(11);
		System.out.println(ret);
	}
}
