/*
6. Aplicativo de Veículos (Carro)

Um aplicativo de controle de veículos precisa calcular autonomia de carros.

Crie uma classe Carro.

O sistema deve:

    Receber marca, consumo (km/l) e combustível atual
    Permitir simular uma viagem (reduzindo combustível)
    Permitir abastecimento
    Calcular quantos km ainda pode percorrer
*/
package br.edu.fatecpg.praticalogica.models;

public class Carro {
  public final String marca;
  public final double consumo; // km/L
  
  public double combustivel = 0;

  public Carro(String marca, double consumo) {
    this.marca = marca;
    this.consumo = consumo;
  }

  public void abastecer(double qtLitros) {
    System.out.println("Abastecendo...");
    combustivel += qtLitros;
    System.out.println("Abastecido com sucesso.");
  }

  public double calcularDistanciaDisponivel() {
    System.out.println("O carro pode percorrer mais " + (combustivel * consumo) + " quilômetros.");
    
    return (combustivel * consumo);
  }

  public void tentarViagem(double distancia) {
    double distMaxima = calcularDistanciaDisponivel();

    if (distMaxima < distancia) {
      System.out.println("Não há combustível o suficiente. Por favor, abasteça.");
      return;
    }

    // Consumir combustivel
    combustivel -= distancia / consumo;
    
    System.out.println("Viagem realizada com êxito! Você possui " + String.format("%.2f", combustivel) + "L restantes.");
  }
}
