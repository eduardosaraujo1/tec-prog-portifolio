package br.edu.fatecpg.streamlambda;

import br.edu.fatecpg.streamlambda.model.Produto;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        List<Produto> produtos = gerarLista();

        System.out.println("==== Eletrônicos com 10% de Desconto ====");
        produtos
            .stream()
            .filter(p -> p.getCategoria().equalsIgnoreCase("eletronico"))
            .map(p ->
                new Produto(p.getNome(), p.getCategoria(), p.getPreco() * 0.9)
            )
            .sorted((p0, p1) -> p0.getPreco() > p1.getPreco() ? -1 : 1)
            .forEach(System.out::println);
        System.out.println("---");

        System.out.println("==== Total de roupas ====");
        double totalRoupa = produtos
            .stream()
            .filter(p -> p.getCategoria().equalsIgnoreCase("roupas"))
            .mapToDouble(p -> p.getPreco())
            .reduce(0.0, Double::sum);
        System.out.println("Total: " + totalRoupa);
        System.out.println("---");

        System.out.println("==== Agrupamento por Categoria ====");
        produtos
            .stream()
            .collect(
                Collectors.groupingBy(
                    Produto::getCategoria,
                    Collectors.averagingDouble(Produto::getPreco)
                )
            )
            .forEach((cat, val) -> System.out.printf("%s: R$%.2f\n", cat, val));
        System.out.println("---");
    }
}
