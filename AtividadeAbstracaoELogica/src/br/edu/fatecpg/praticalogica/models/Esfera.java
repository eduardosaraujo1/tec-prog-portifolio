/*
8. Indústria de Bolas (Esfera)

Uma fábrica produz bolas e precisa calcular propriedades físicas.

Crie uma classe Esfera.

O sistema deve:

    Receber o raio da esfera
    Calcular o volume
    Calcular a área da superfície
*/
package br.edu.fatecpg.praticalogica.models;

import java.lang.Math;

public class Esfera {
  public double raio;

  public Esfera(double raio) {
    this.raio = raio;
  }
  
  public double volume() {
    double vol = 4/3 * Math.PI * Math.pow(raio, 3);
    System.out.println("Volume da esfera: " + vol);
    
    return vol;
  }
  
  public double surfaceArea() {
    double area = 4 * Math.PI * Math.pow(raio, 2);
    System.out.println("Área superficial: " + area);
    
    return area;
  }
}
