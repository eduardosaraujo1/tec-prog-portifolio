package br.edu.fatecpg.streamlambda;

import br.edu.fatecpg.streamlambda.model.Funcionario;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    private static List<Funcionario> gerarLista() {
        return List.of(
            new Funcionario("Ana Silva", "TI", 4500.0, 12),
            new Funcionario("Bruno Souza", "TI", 2800.0, 3),
            new Funcionario("Carla Dias", "RH", 3200.0, 11),
            new Funcionario("Daniel Alves", "RH", 2500.0, 4),
            new Funcionario("Eduardo Lima", "Financeiro", 6000.0, 15),
            new Funcionario("Fernanda Costa", "Financeiro", 3100.0, 8),
            new Funcionario("Gabriel Rocha", "TI", 5200.0, 5),
            new Funcionario("Helena Martins", "Marketing", 2900.0, 2)
        );
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = gerarLista();

        System.out.println("==== Salário superior a R$ 3000=====");
        funcionarios
            .stream()
            .filter(f -> f.getSalario() > 3000.0)
            .forEach(System.out::println);
        System.out.println("---");

        System.out.println(
            "==== Aumento de 5% para Anos de Serviço > 10 ====="
        );
        funcionarios = funcionarios
            .stream()
            .map(f -> {
                return f.getAnosDeServico() > 10
                    ? new Funcionario(
                          f.getNome(),
                          f.getDepartamento(),
                          f.getSalario() * 1.05,
                          f.getAnosDeServico()
                      )
                    : f;
            })
            .toList();
        funcionarios.forEach(System.out::println);
        System.out.println("---");

        System.out.println("==== Funcionários ordenados por nome =====");
        funcionarios
            .stream()
            .sorted(Comparator.comparing(Funcionario::getNome))
            .forEach(System.out::println);
        System.out.println("---");

        System.out.println("==== Total Gasto com Salários=====");
        double totalSalarios = funcionarios
            .stream()
            .mapToDouble(Funcionario::getSalario)
            .reduce(0.0, Double::sum);
        System.out.printf("R$ %.2f\n", totalSalarios);

        System.out.println("==== Média Salarial por Departamento====");
        funcionarios
            .stream()
            .collect(
                Collectors.groupingBy(
                    Funcionario::getDepartamento,
                    Collectors.averagingDouble(Funcionario::getSalario)
                )
            )
            .forEach((depto, sal) ->
                System.out.printf("%s: R$%.2f\n", depto, sal)
            );
    }
}
