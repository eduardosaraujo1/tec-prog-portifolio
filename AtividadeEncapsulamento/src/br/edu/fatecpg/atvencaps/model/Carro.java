package br.edu.fatecpg.atvencaps.model;

public class Carro {
	  private final String marca;
	  private final double consumo; // km/L
	  private final double capacidadeTanque;
	  
	  private double combustivel = 0;

	  public Carro(String marca, double consumo, double capacidadeTanque) {
	    this.marca = marca;
	    this.consumo = consumo;
	    this.capacidadeTanque = capacidadeTanque;
	  }	  

	  public String getMarca() {
		return marca;
	  }

	  public double getConsumo() {
		  return consumo;
	  }

	  public double getCapacidadeTanque() {
		  return capacidadeTanque;
	  }

	  public double getCombustivel() {
		  return combustivel;
	  }



	  public boolean abastecer(double qtLitros) {
		  if (qtLitros < 0) return false;
		  
		  combustivel = combustivel + qtLitros > capacidadeTanque ?
					  capacidadeTanque : combustivel + qtLitros;
	    
	      return true;
	  }

	  public double calcularDistanciaDisponivel() {
	    // System.out.println("O carro pode percorrer mais " + (combustivel * consumo) + " quilômetros.");
	    
	    return (combustivel * consumo);
	  }

	  public boolean tentarViagem(double distancia) {
	    double distMaxima = calcularDistanciaDisponivel();

	    if (distMaxima < distancia) {
	      // System.out.println("Não há combustível o suficiente. Por favor, abasteça.");
	      return false;
	    }

	    // Consumir combustivel
	    combustivel -= distancia / consumo;
	    
	    return true;
	    // System.out.println("Viagem realizada com êxito! Você possui " + String.format("%.2f", combustivel) + "L restantes.");
	  }

	  public double valorParaEncherTanque() {
		return capacidadeTanque - combustivel;
	  }
	}
