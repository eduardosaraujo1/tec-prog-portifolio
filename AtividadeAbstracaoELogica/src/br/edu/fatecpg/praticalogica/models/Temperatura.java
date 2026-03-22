/*
7. Conversor de Temperatura

Um aplicativo meteorológico precisa converter temperaturas.

Crie uma classe Temperatura.

O sistema deve:

    Receber temperatura em Celsius
    Converter para Fahrenheit
    Converter para Kelvin
*/
package br.edu.fatecpg.praticalogica.models;

public class Temperatura {
  public double celsius;

  public Temperatura(double celsius) {
    this.celsius = celsius;
  }

  public double toFahrenheit() {
    double frh = 32 + celsius * 9 / 5;
    System.out.println("Temperatura é " + frh + "°F");
    
    return frh;
  }
  public double toKelvin() {
    double kev = 273.15 + celsius;
    System.out.println("Temperatura é " + kev + "°K");
    
    return kev;
  }
  
}


