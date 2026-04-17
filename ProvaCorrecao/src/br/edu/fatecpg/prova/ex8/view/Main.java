package br.edu.fatecpg.prova.ex8.view;
import br.edu.fatecpg.prova.ex8.model.Farmacia;

public class Main {
    public static void main(String[] args) {

        Farmacia farmacia = new Farmacia();

        farmacia.dbgAddMedicamento("Paracetamol", 10, 20.0);
        farmacia.dbgAddMedicamento("Ibuprofeno", 3, 15.0);
        farmacia.dbgAddMedicamento("Dipirona", 2, 10.0);
        farmacia.dbgAddMedicamento("Amoxicilina", 7, 30.0);
        farmacia.dbgAddMedicamento("Vitamina C", 1, 12.0);

        // teste 1
        farmacia.mostrarMedicamentos();

        // teste 2
        System.out.println('\n');
        double media = farmacia.mediaVencimento();
        System.out.println("Média: " + media);

        // Teste 3
        System.out.println('\n');
        farmacia.mostrarMedicamentosVencendo();

        // Teste 4
        System.out.println('\n');
        farmacia.aplicarDescontosMedicamentosVencendo();
        farmacia.mostrarMedicamentos();

        // Teste 5
        System.out.println('\n');
        farmacia.venderMedicamento(1);
        farmacia.mostrarMedicamentos();
    }
}