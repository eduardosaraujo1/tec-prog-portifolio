package br.edu.fatecpg.prova.ex7.model;

/*
7. Após o sucesso do protótipo inicial, a equipe da AutoDrive identificou um problema crítico de segurança:
qualquer parte do código conseguia alterar diretamente os dados de um veículo, como o preço de venda, sem
nenhuma validação. Sua tarefa é refatorar o sistema aplicando o pilar de Encapsulamento da POO para
proteger os dados da frota.
Objetivo
Implementar uma classe Java que utilize modificadores de acesso privados para impedir a corrupção de
dados e fornecer uma interface segura para interação.
Especificações do Projeto1. A Classe de Modelo (Aluno)
A classe deve representar um aluno e proteger seus dados contra acessos externos diretos: Atributos
Privados: nome (String), matricula (int) e notaFinal (double). Métodos de Acesso: Implemente os métodos
para permitir a leitura e escrita controlada desses campos.
2. Implementação do Sistema (Main)
No método principal, simule o cadastro de um aluno no sistema:
4. Instanciação: Crie um objeto da classe Aluno.
5. Configuração Segura: Utilize os métodos Setters para definir o nome, a matrícula e a nota final do
aluno.
6. Consulta de Dados: Utilize os métodos Getters para recuperar e exibir as informações no console de
forma organizada, como em um boletim escolar.
 */
public class Aluno {
	private String nome;
	private int matricula;
	private double notaFinal;
	
	public Aluno(String nom, int mat, double not) {
		nome = nom;
		matricula = mat;
		notaFinal = not;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", notaFinal=" + notaFinal + "]";
	}
}
