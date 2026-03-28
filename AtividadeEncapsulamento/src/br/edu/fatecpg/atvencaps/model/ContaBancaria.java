package br.edu.fatecpg.atvencaps.model;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public String depositar(double v){
		if(v>0) {
			this.saldo += v;
			return "Deposito Realizado Com Sucesso!";
			
			}
		return "Verifique o Valor Depositado!";
	}
	
	public String sacar(double v){
		if (v>0 && v<=this.saldo) {
			this.saldo -= v;
			return "Saque Ralizado Com Sucesso!";
		}
		return "Verifique o Valor!";		
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
}
