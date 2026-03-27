package br.edu.fatecpg.encapsulamento.model;

public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public Pessoa(String n, int i, double a, double p) {
		nome = n;
		idade = i;
		altura = a;
		peso = p;
	}
	
	public String nome() { return nome; }
	public int idade() { return idade; }
	public double altura() { return altura; }
	public double peso() { return peso; }
	
	public void setNome(String n) { nome = n; }
	public void setIdade(int i) {
		if (idade <= i) throw new RuntimeException(
				"Proibido definir idade para um valor menor que o anterior (tentou alterar de "+idade+" para "+i+").");
		
		idade = i;
	}
	public void setAltura(double a) { altura = a; }
	public void setPeso(double p) { peso = p; }
	
	
	public String comer(double grama) {
		peso += grama / 1000 * 0.2;
		
		return "Peso atual: " + peso;
	}
	
	public String falar() {
		return "Olá, muito prazer!";
	}
	
	@Override
	public String toString() {
		return "Nome: " + nome 
				+ "\nIdade: " + idade
				+ "\nAltura: " + altura
				+ "\nPeso: " + peso;
	}
}
