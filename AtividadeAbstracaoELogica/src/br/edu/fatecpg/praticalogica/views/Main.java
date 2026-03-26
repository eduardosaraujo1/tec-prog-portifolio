package br.edu.fatecpg.praticalogica.views;

import br.edu.fatecpg.praticalogica.models.*;
import java.util.Scanner;

public class Main {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		exercicio1();
		exercicio2();
		exercicio3();
		exercicio4();
		exercicio5();
		exercicio6();
		exercicio7();
		exercicio8();
		exercicio9();
		exercicio10();
		exercicio11();
		exercicio12();
		
		scanner.close();
	}

	// ### PARTE DO JORGE
	// 🔹 1. Sistema de Marcenaria (Retângulo)
	// Uma marcenaria precisa calcular a quantidade de madeira utilizada na fabricação de tampos de mesa retangulares.
	// Crie uma classe Retangulo que represente o tampo de uma mesa.
	// O sistema deve:
	//    Receber a largura e a altura no construtor
	//    Calcular a área do tampo
	//    Calcular o perímetro (para acabamento com fita de borda)
	public static void exercicio1() {
        System.out.println("=== Cálculo de Tampo de Mesa - Marcenaria ===");
        System.out.print("Digite a largura do tampo (em metros): ");
        double largura = scanner.nextDouble();
        System.out.print("Digite a altura do tampo (em metros): ");
        double altura = scanner.nextDouble();
        
        Retangulo tampo = new Retangulo(largura, altura);
        
        double area = tampo.calcularArea();
        double perimetro = tampo.calcularPerimetro();
        
        System.out.println("\n=== Resultados ===");
        System.out.printf("Área do tampo: %.4f m²%n", area);
        System.out.printf("Perímetro do tampo: %.4f m%n", perimetro);
        System.out.println("Quantidade de madeira necessária para o tampo: " + area + " m²");
        System.out.println("Comprimento de fita de borda necessária: " + perimetro + " m");

	}
	// 🔹 2. RH de Empresa (Funcionário)
	// Uma empresa deseja automatizar o cálculo de salários de seus funcionários.
	// Crie uma classe Funcionario que represente um colaborador.
	// O sistema deve:
	//    Receber nome e salário inicial no construtor
	//    Permitir aplicar um aumento percentual no salário
	//    Calcular o salário anual do funcionário
	public static void exercicio2() {
        System.out.println("=== Cálculo de Salário - RH da Empresa ===");
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário inicial (R$): ");
        double salarioInicial = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioInicial);

        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = scanner.nextDouble();

        funcionario.aplicarAumento(percentual);

        double salarioAnual = funcionario.calcularSalarioAnual();

        System.out.println("\n=== Resultados ===");
        System.out.printf("Funcionário: %s%n", funcionario.getNome());
        System.out.printf("Salário atual após aumento: R$ %.2f%n", funcionario.getSalario());
        System.out.printf("Salário anual: R$ %.2f%n", salarioAnual);		
	}
	// 🔹 3. Banco Digital (Conta Bancária)
	// Um banco digital precisa de um sistema simples para gerenciar contas de clientes.
	// Crie uma classe ContaBancaria.
	// O sistema deve:
	//    Receber o nome do titular e saldo inicial
	//    Permitir depósitos e saques
	//    Exibir o saldo atual após operações
	public static void exercicio3() {
        System.out.println("=== Banco Digital - Conta Bancária ===");
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o saldo inicial (R$): ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

        System.out.print("Digite o valor do depósito (R$): ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);

        System.out.print("Digite o valor do saque (R$): ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        System.out.println("\n=== Resultados ===");
        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Saldo atual: R$ %.2f%n", conta.getSaldo());
	}
	// 🔹 4. Controle de Estoque (Produto)
	// Uma loja precisa controlar seu estoque de produtos.
	// Crie uma classe Produto.
	// O sistema deve:
	//    Receber nome, preço e quantidade no construtor
	//    Calcular o valor total em estoque
	//    Permitir entrada e saída de produtos
	public static void exercicio4() {
        System.out.println("=== Controle de Estoque - Loja ===");
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço unitário (R$): ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade inicial: ");
        int quantidadeInicial = scanner.nextInt();

        Produto produto = new Produto(nome, preco, quantidadeInicial);

        System.out.print("Digite a quantidade de entrada: ");
        int entrada = scanner.nextInt();
        produto.entrada(entrada);

        System.out.print("Digite a quantidade de saída: ");
        int saida = scanner.nextInt();
        produto.saida(saida);

        double valorTotal = produto.calcularValorTotal();

        System.out.println("\n=== Resultados ===");
        System.out.printf("Produto: %s%n", produto.getNome());
        System.out.printf("Quantidade atual: %d unidades%n", produto.getQuantidade());
        System.out.printf("Valor total em estoque: R$ %.2f%n", valorTotal);

	}
	// 🔹 5. Sistema Escolar (Aluno)
	// Uma escola deseja automatizar o cálculo de notas dos alunos.
	// Crie uma classe Aluno.
	// O sistema deve:
	//    Receber o nome e três notas
	//    Calcular a média final
	//    Informar se o aluno foi aprovado (média ≥ 7)
	public static void exercicio5() {
        System.out.println("=== Cálculo de Notas - Escola ===");
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        double media = aluno.calcularMedia();

        System.out.println("\n=== Resultados ===");
        System.out.printf("Aluno: %s%n", aluno.getNome());
        System.out.printf("Média final: %.2f%n", media);

        if (aluno.foiAprovado()) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
	}
	// ### PARTE DO EDUARDO SOARES
	// 🔹 6. Aplicativo de Veículos (Carro)
	// Um aplicativo de controle de veículos precisa calcular autonomia de carros.
	// Crie uma classe Carro.
	// O sistema deve:
	//    Receber marca, consumo (km/l) e combustível atual
	//    Permitir simular uma viagem (reduzindo combustível)
	//    Permitir abastecimento
	//    Calcular quantos km ainda pode percorrer
	public static void exercicio6() {
		final Carro v = new Carro(
				strInput("Digite a marca do carro: "),
				doubleInput("Digite o consumo do carro (em km/L): ")
				);
		
		v.abastecer(doubleInput("Digite a quantidade de litros para abastecer: "));
		v.calcularDistanciaDisponivel();
		v.tentarViagem(doubleInput("[Viajar] digite a distância para viagem: "));
	}
	// 🔹 7. Conversor de Temperatura
	// Um aplicativo meteorológico precisa converter temperaturas.
	// Crie uma classe Temperatura.
	// O sistema deve:
	//    Receber temperatura em Celsius
	//    Converter para Fahrenheit
	//    Converter para Kelvin
	public static void exercicio7() {
		final Temperatura t = new Temperatura(
				doubleInput("Digite a temperatura em Celsius: ")
				);
		
		t.toFahrenheit();
		t.toKelvin();
	}
	// 🔹 8. Indústria de Bolas (Esfera)
	// Uma fábrica produz bolas e precisa calcular propriedades físicas.
	// Crie uma classe Esfera.
	// O sistema deve:
	//    Receber o raio da esfera
	//    Calcular o volume
	//    Calcular a área da superfície
	public static void exercicio8() {
		final Esfera e = new Esfera(
				doubleInput("Digite o raio da esfera: ")
				);

		e.volume();
		e.surfaceArea();
	}
	// 🔹 9. Sistema de Vendas (Vendedor)
	// Uma empresa de vendas comissionadas quer calcular ganhos dos vendedores.
	// Crie uma classe Vendedor.
	// O sistema deve:
	//    Receber nome, total de vendas e percentual de comissão
	//    Calcular o valor da comissão
	//    Calcular o salário final com base em um salário base
	public static void exercicio9() {
		final Vendedor v = new Vendedor(
				strInput("Digite o nome do vendedor: "),
				doubleInput("Digite o total de vendas: "),
				doubleInput("Digite o percentual de comissão: ")
				);
		
		v.valorComissao();
		v.calcularSalario(doubleInput("Digite o salário base do vendedor: "));
	}
	// 🔹 10. Conta de Energia
	// Uma concessionária de energia precisa calcular contas de luz.
	// Crie uma classe ContaEnergia.
	// O sistema deve:
	//    Receber consumo em kWh e valor por kWh
	//    Calcular o valor total da conta
	//    Aplicar descontos quando necessário
	public static void exercicio10() {
		final ContaEnergia ce = new ContaEnergia(
				doubleInput("Digite o consumo em kWh: "),
				doubleInput("Digite o preço de energia por kWh: ")
				);
		
		ce.valorTotal();
		ce.valorTotal(doubleInput("Digite o percentual de desconto (0 a 100): "));
	}
	// 🔹 11. Planejamento de Viagem
	// Um motorista quer calcular o custo de uma viagem.
	// Crie uma classe Viagem.
	// O sistema deve:
	//    Receber distância, consumo do carro e preço do combustível
	//    Calcular quantos litros serão necessários
	//    Calcular o custo total da viagem
	public static void exercicio11() {
		final Viagem v = new Viagem(
				doubleInput("Digite a distância da viagem: "),
				doubleInput("Digite o consumo do carro em km/L: "),
				doubleInput("Digite o preço do combustível em reais: ")
				);

		v.qtLitrosNecessarios();
		v.custoViagem();
	}
	// 🔹 12. Sistema de Saúde (IMC)
	// Uma clínica deseja calcular o Índice de Massa Corporal dos pacientes.
	// Crie uma classe Pessoa.
	// O sistema deve:
	//    Receber nome, peso e altura
	//    Calcular o IMC
	//    Classificar o resultado (abaixo do peso, normal, sobrepeso, etc.)
	public static void exercicio12() {
		final Pessoa p = new Pessoa(
				strInput("Digite o nome da pessoa: "),
				doubleInput("Digite o peso da pessoa: "),
				doubleInput("Digite a altura da pessoa: ")
				);
		
		double imc = p.calcularImc();
		p.classificarResultado(imc);
	}
	
	// Funções para reduzir boilerplate de código
	// private static int intInput(String mensagem) {
	//	 System.out.print(mensagem);
	//	
	//	 return scanner.nextInt();
	// }
	
	private static double doubleInput(String mensagem) {
		System.out.print(mensagem);
		
		return scanner.nextDouble();
	}
	
	private static String strInput(String mensagem) {
		System.out.print(mensagem);
		
		return scanner.next();
	}
}
