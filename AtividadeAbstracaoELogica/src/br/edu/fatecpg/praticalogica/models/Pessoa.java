/*
12. Sistema de Saúde (IMC)

Uma clínica deseja calcular o Índice de Massa Corporal dos pacientes.

Crie uma classe Pessoa.

O sistema deve:

    Receber nome, peso e altura
    Calcular o IMC
    Classificar o resultado (abaixo do peso, normal, sobrepeso, etc.)
*/
package br.edu.fatecpg.praticalogica.models;

public class Pessoa {
  public String nome;
  public double peso;
  public double altura;
  
  public Pessoa(String nome, double peso, double altura) {
    this.nome = nome;
    this.peso = peso;
    this.altura = altura;
  }
  
  public double calcularImc() {
    double imc = peso / altura * altura;
    System.out.printf("IMC do %s: %.2f%n",nome, imc);
    
    return imc;
  }

  public String classificarResultado(double imc) {
	String resultado;
	
	if (imc < 18.5) {
		resultado = "Baixo peso";
	} else if (imc < 24.9) {
		resultado = "Peso normal";
	} else if (imc < 29.9) {
		resultado = "Sobrepeso";
	} else if (imc < 34.9) {
		resultado = "Obesidade Grau I";
	} else if (imc < 39.9) {
		resultado = "Obesidade Grau II";
	} else {
		resultado = "Obesidade Grau III";
	}
	
	System.out.println(resultado);
	
	return resultado;
  }
}

