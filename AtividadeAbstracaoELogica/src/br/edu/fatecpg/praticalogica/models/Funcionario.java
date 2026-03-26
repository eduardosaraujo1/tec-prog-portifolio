package br.edu.fatecpg.praticalogica.models;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aplicarAumento(double percentual) {
        this.salario *= (1 + percentual / 100);
    }

    public double calcularSalarioAnual() {
        return this.salario * 12;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
