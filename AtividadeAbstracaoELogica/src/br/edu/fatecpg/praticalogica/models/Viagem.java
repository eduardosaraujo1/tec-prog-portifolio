/*
11. Planejamento de Viagem

Um motorista quer calcular o custo de uma viagem.

Crie uma classe Viagem.

O sistema deve:

    Receber distância, consumo do carro e preço do combustível
    Calcular quantos litros serão necessários
    Calcular o custo total da viagem
*/
package br.edu.fatecpg.praticalogica.models;

public class Viagem {
  public double distancia;
  public double consumoCarro; // km/L
  public double precoCombustivel;

  public Viagem(double distancia, double consumoCarro, double precoCombustivel) {
    this.distancia = distancia;
    this.consumoCarro = consumoCarro;
    this.precoCombustivel = precoCombustivel;
  }
  
  public double qtLitrosNecessarios() {
    double qt = distancia / consumoCarro;
    System.out.printf("Combustível necessário para a viagem: %.2f%n", qt);
    
    return qt;
  }
  
  public double custoViagem() {
    double custo = precoCombustivel * qtLitrosNecessarios();
    System.out.printf("Custo de viagem: %.2f%n", custo);
    
    return custo;
  }
}
