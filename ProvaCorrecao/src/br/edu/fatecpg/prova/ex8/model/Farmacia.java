package br.edu.fatecpg.prova.ex8.model;
/*
 8. A rede de farmácias VidaSaúde está enfrentando prejuízos por não controlar adequadamente o
vencimento dos medicamentos em estoque. Produtos próximos do vencimento não recebem desconto a
tempo e acabam sendo descartados. Você foi designado para criar o motor lógico que processa o inventário,
alerta sobre vencimentos e gerencia as operações de venda com desconto automático.
Objetivo
Desenvolver uma classe Java que utilize arrays paralelos para manter a integridade dos dados dos
medicamentos e implementar a lógica de negócio necessária para a operação diária da farmácia.
Especificações do Projeto1. Estrutura de Dados (A Classe Farmacia)
A classe deve gerenciar três vetores sincronizados por índice:
• Um array de String chamado nomesMedicamentos;

• Um array de int chamado diasParaVencimento;
• Um array de double chamado precos.
2. Funcionalidades de Gestão (Métodos)
Você deve implementar os seguintes processos operacionais:
7. Mostrar todos os medicamentos, seus preços e dias restantes para vencimento.
8. Calcular a média de dias para vencimento de todos os medicamentos.
9. Identificar quais medicamentos estão próximos de vencer (ex.: menos de 5 dias).
10. Aplicar automaticamente um desconto de 50% para medicamentos que estão próximos de vencer.
11. Vender um medicamento, removendo-o do array.
 */
public class Farmacia {
	private String[] nomesMedicamentos = new String[100];
	private int[] diasParaVencimento = new int[100];
	private double[] preco = new double[100];
	private int lastIndex = 0;
	
	public void dbgAddMedicamento(String n, int dpv, double p) {
		nomesMedicamentos[lastIndex] = n;
		diasParaVencimento[lastIndex] = dpv;
		preco[lastIndex] = p;
		++lastIndex;
	}
	
	public void mostrarMedicamentos() {
		System.out.println("| Nome      | Dias Para Vencimento  | Preco        |");
		for (int i = 0; i < lastIndex; ++i) {
			System.out.println("| "+nomesMedicamentos[i] +"| "+diasParaVencimento[i]+" | "+preco[i]+" |");
		}
	}
	
	public double mediaVencimento() {
		int s = 0;
		for (int i = 0; i < lastIndex; ++i) {
			s += diasParaVencimento[i];
		}
		
		return (double) s / lastIndex; // Por sorte, quantidade de itens == lastIndex
	}
	
	public void mostrarMedicamentosVencendo() {
		System.out.println("Medicamentos prestes a vencer:");
		for (int i =0; i < lastIndex; ++i) {
			if (diasParaVencimento[i] < 5) {
				System.out.println("- " + nomesMedicamentos[i]);
			}
		}
	}
	
	public void aplicarDescontosMedicamentosVencendo() {
		for (int i =0; i < lastIndex; ++i) {
			if (diasParaVencimento[i] < 5) {
				preco[i] *= 0.5;
			}
		}
	}
	
	public void venderMedicamento(int posMedicamento) {
		if (posMedicamento >= lastIndex || posMedicamento < 0) return;
		
		// Algoritimo melhor que unshift: pegar o último elemento e colocar no lugar
		nomesMedicamentos[posMedicamento] = nomesMedicamentos[lastIndex-1];
		diasParaVencimento[posMedicamento] = diasParaVencimento[lastIndex-1];
		preco[posMedicamento] = preco[lastIndex-1];
		
		nomesMedicamentos[lastIndex-1] = null;
		diasParaVencimento[lastIndex-1] = 0; // int[] não é nullable, Integer[] é.
		preco[lastIndex-1] = 0; // double[] não é nullable, Double[] é.
		
		--lastIndex;
	}
}
