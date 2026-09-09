package br.edu.fatecpg.streamlambda;

import br.edu.fatecpg.streamlambda.model.Produto;
import java.util.List;

public class App {

    private static List<Produto> gerarLista() {
        return List.of(
            new Produto("Celular", "Eletronico", 599.99),
            new Produto("Admirável Novo Mundo", "Livros", 79.99),
            new Produto("Notebook", "Eletronico", 3499.90),
            new Produto("Fone de Ouvido Bluetooth", "Eletronico", 249.90),
            new Produto("Teclado Mecânico", "Eletronico", 399.99),
            new Produto("Mouse Sem Fio", "Eletronico", 129.90),
            new Produto("Monitor 24 Polegadas", "Eletronico", 899.99),
            new Produto("Cadeira de Escritório", "Moveis", 799.90),
            new Produto("Mesa de Escritório", "Moveis", 649.99),
            new Produto("Mochila", "Acessorios", 159.90),
            new Produto("Camiseta", "Roupas", 49.99),
            new Produto("Tênis Esportivo", "Roupas", 299.90),
            new Produto("Caneca", "Casa", 29.99),
            new Produto("Cafeteira Elétrica", "Eletrodomésticos", 219.90),
            new Produto("O Hobbit", "Livros", 59.99)
        );
    }

    public static void main(String[] args) {
        System.out.println(new Produto("Teste", "Teste", 9));
    }
}
