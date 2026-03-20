package br.edu.fatecpg.veiculo.view;

import br.edu.fatecpg.veiculo.model.Carro;

public class Main {

	public static void main(String[] args) {
		Carro meuCarro = new Carro(
				"Renault",
				"Duster",
				2016
				);
		meuCarro.motor = 1.6;
		meuCarro.placa = "ABC-1D23";
		
		meuCarro.ligar();
		meuCarro.buzinar();
		meuCarro.desligar();
		System.out.println(meuCarro.toString());
	}

}
