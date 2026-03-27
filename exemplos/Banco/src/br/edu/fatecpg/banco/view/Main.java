package br.edu.fatecpg.banco.view;

import br.edu.fatecpg.banco.model.ContaBancaria;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome; double saldo;
		System.out.println("Digite O Nome Do Titular:");
		nome = scan.nextLine ();
		System.out.println("Digite O Valor do Primeiro Depósito:");
		saldo = scan.nextDouble();
		ContaBancaria conta = new ContaBancaria(nome,saldo);
		
		System.out.println("Digite um valor de Saque:");
		double saque = scan.nextDouble();
		
		String retorno = conta.sacar(saque);
		System.out.println(retorno);
		System.out.println(conta);
		scan.close();
	}
}
