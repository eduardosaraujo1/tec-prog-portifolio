package br.edu.fatecph.prova.ex6.model;

/*
6. A AutoDrive é uma concessionária de automóveis que está modernizando seus processos internos. O
controle de entrada e saída de veículos era feito em planilhas manuais, o que gerava erros e retrabalho. Você
foi contratado para desenvolver o protótipo inicial do sistema de inventário, começando pela modelagem do
produto principal.
Objetivo
Desenvolver a estrutura inicial do sistema utilizando Programação Orientada a Objetos, focando na criação
de uma classe para representar o veículo e na manipulação direta de seus dados.
Especificações do Projeto
1. Modelagem da Classe
Crie uma classe chamada Carro. Para este protótipo inicial, utilize modificadores de acesso públicos para os
seguintes atributos: marca (ex: Toyota, Ford), modelo (ex: Corolla, Fiesta), ano (ano de fabricação).
2. Implementação no Método Principal (main)
No ponto de entrada do seu programa, simule a chegada de um novo veículo ao estoque realizando as
seguintes etapas:
1. Instanciação: Crie um objeto da classe Carro.
2. Entrada de Dados: Atribua valores a cada um dos atributos do objeto (ex: simule a chegada de um
Ford Ka 2022 ao estoque).
3. Relatório: Exiba no console as informações completas do veículo cadastrado, garantindo que o
gerente consiga visualizar todos os dados do carro.
 */
public class Carro {
	public String marca;
	public String modelo;
	public int ano;
	
	public Carro(String ma, String mo, int a ) {
		marca = ma;
		modelo = mo;
		ano = a;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + "]";
	}
}
