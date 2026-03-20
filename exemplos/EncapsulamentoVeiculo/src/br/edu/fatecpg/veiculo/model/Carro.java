package br.edu.fatecpg.veiculo.model;

public class Carro {
	public String marca;
	public String modelo;
	public String placa;
	public int ano;
	public double motor;
	
	private boolean isLigado = false;
	
	public Carro(String marca, String modeloCarro, int anoCarro) {
		this.marca = marca;
		this.ano = anoCarro;
		this.modelo = modeloCarro;
	}

    public void ligar() {
    	System.out.println("Ligando..");
    	
    	if (isLigado) {
    		System.out.println("O carro já está ligado!");
    		return;
    	}
    	
    	isLigado = true;
		System.out.println("Ligado!");
    }
    
    public void desligar() {
    	if (!isLigado) {
    		System.out.println("O carro já está desligado!");
    		return;
    	}
    	
    	isLigado = false;
        System.out.println("Desligado!");
    }
    
    public void buzinar() {
        System.out.println("Bi Bi Bi Bi");
    }
    
    @Override
    public String toString() {
    	return "{\n"
    			+ "  \"marca\": \"" + marca + "\",\n"
    			+ "  \"modelo\": \"" + modelo + "\",\n"
				+ "  \"placa\": \"" + placa+ "\",\n"
				+ "  \"ano\": \"" + ano+ "\",\n"
				+ "  \"motor\": \"" + motor + "\"\n"
				+ "}";
    }
}
