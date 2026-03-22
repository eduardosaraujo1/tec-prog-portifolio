/*
10. Conta de Energia

Uma concessionária de energia precisa calcular contas de luz.

Crie uma classe ContaEnergia.

O sistema deve:

    Receber consumo em kWh e valor por kWh
    Calcular o valor total da conta
    Aplicar descontos quando necessário
*/
package br.edu.fatecpg.praticalogica.models;

public class ContaEnergia {
  public double consumoKWh;
  public double valorPorKWh;
  
  public ContaEnergia(double consumoKWh, double valorPorKWh) {
    this.consumoKWh = consumoKWh;
    this.valorPorKWh = valorPorKWh;
  }
  
  public double valorTotal(double pcDesconto) {
    if (pcDesconto < 0 || pcDesconto > 100) {
      throw new RuntimeException("Valor de desconto inválido: " + pcDesconto);
    }
  
    double valor = valorPorKWh * consumoKWh * (1 - pcDesconto / 100);
    
    System.out.printf("Valor da conta: %.2f%n", valor);
    
    return valor;
  }

  public double valorTotal() {
    return valorTotal(0);
  }
}

