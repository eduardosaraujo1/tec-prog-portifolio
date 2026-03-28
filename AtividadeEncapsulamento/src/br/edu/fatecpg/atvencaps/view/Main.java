package br.edu.fatecpg.atvencaps.view;

import br.edu.fatecpg.atvencaps.model.*;
import java.util.Scanner;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		exercicio1();
		exercicio2();
		exercicio3();
		scanner.close();
	}
	
	/*
	 1. Evolua o conceito Carro do exercício e defina 1 método para calcular o valor total 
	 para encher o tanque. Este deve receber como parâmetro o valor da gasolina.
	Obs: 

    Crie um atributo capacidadeTanque na classe.
    Usuário deve entrar com as informações do carro.
    Crie métodos específicos para fornecer e obter os valores dos atributos(set/get), caso aplicável. 
	 */
	private static void exercicio1() {
		double resultado;
		Carro c = new Carro(
				strInput("Digite a marca do carro: "),
				doubleInput("Digite o consumo do carro: "),
				doubleInput("Digite a capacidade de tanque do carro: ")
				);
		
		resultado= c.valorParaEncherTanque();
		System.out.println("É necessário mais " + resultado + " para preencher o tanque.");
		
		c.abastecer(5);
		resultado= c.valorParaEncherTanque();
		System.out.println("É necessário mais " + resultado + " para preencher o tanque.");
	}

	private static void exercicio2() {
		// Esse exercicio foi feito em aula com o professor.
		String retorno;
		ContaBancaria cb = new ContaBancaria(
				strInput("Digite o nome do titular: "),
				doubleInput("Digite o saldo inicial: ")
				);
		
		double saque = doubleInput("Digite o valor a sacar: ");
		retorno = cb.sacar(saque);
		System.out.println(retorno);
		System.out.println(cb);

	}
	
	/*
	 3. Implemente uma classe Produto com os atributos privados nome, preco e quantidadeEstoque. Crie métodos 
	 getters e setters para esses atributos.

     Adicione uma regra no setter de preco que impede a definição de valores negativos.
     No setter de quantidadeEstoque, o valor deve ser ajustado apenas se for maior ou igual a zero. No método main, 
     crie um objeto Produto e teste as restrições definidas.
	 */
	private static void exercicio3() {
		Produto p = new Produto(
				strInput("Digite o nome do produto: "),
				doubleInput("Digite o preço unitário do produto: "),
				intInput("Digite a quantidade do produto em estoque: ")
				);
		
		// Tentando definir o preço uniário para valor negativo
		p.setPreco(-5);
		
		// Tentando definir valor em estoque para negativo
		p.setQuantidadeEstoque(-10);
		
		System.out.println("Esperado que os valores ainda sejam os mesmos que os digitados pelo usuário");
		System.out.println(p);
		
		// Definir valores válidos
		p.setPreco(1);
		p.setQuantidadeEstoque(0);
		
		System.out.println("Esperado que os valores sejam diferentes");
		System.out.println(p);
	}
	
	private static double intInput(String msg) {
		System.out.print(msg);
		
		return Integer.parseInt(scanner.nextLine());
	}
	
	private static double doubleInput(String msg) {
		System.out.print(msg);
		
		return Double.parseDouble(scanner.nextLine());
	}
	
	private static String strInput(String msg) {
		System.out.print(msg);
		
		return scanner.nextLine();
	}
}
