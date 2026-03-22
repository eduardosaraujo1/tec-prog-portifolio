/*
9. Sistema de Vendas (Vendedor)

Uma empresa de vendas comissionadas quer calcular ganhos dos vendedores.

Crie uma classe Vendedor.

O sistema deve:

    Receber nome, total de vendas e percentual de comissão
    Calcular o valor da comissão
    Calcular o salário final com base em um salário base
*/
package br.edu.fatecpg.praticalogica.models;

public class Vendedor {
  public String nome;
  public double totalVendas;
  public double pcComissao;

  public Vendedor(String nome, double totalVendas, double pcComissao) {
    this.nome = nome;
    this.totalVendas = totalVendas;
    this.pcComissao = pcComissao;
  }
  
  public double valorComissao() {
    double vlCom = totalVendas * pcComissao / 100;
    System.out.println("Valor da comissão: " + String.format("%.2f", vlCom));
    
    return vlCom;
  }
  
  public double calcularSalario(double salarioBase) {
    double sal = salarioBase + valorComissao();
    System.out.printf("Salário: %.2f%n", sal);
    
    return sal;
  }
}
