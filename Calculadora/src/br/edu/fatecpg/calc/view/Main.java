package br.edu.fatecpg.calc.view;

import br.edu.fatecpg.calc.model.Calculadora;

public class Main {

	public void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		System.out.println("A soma é: " + calc.somar(5, 2));
		System.out.println("A subtração é: " + calc.subtrair(5, 2));
		System.out.println("A multiplicação é: " + calc.multiplicar(5, 2));
		System.out.println("A divisão é: " + calc.dividir(5, 2));
		System.out.println("A média é: " + calc.media(5, 2));
	}
}
