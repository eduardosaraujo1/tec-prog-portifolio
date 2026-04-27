package br.edu.fatecpg.polimorfismo.ex4.view;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World(4)");
    }
}

/*
 * 4. Sobrescrita de métodos em uma classe de pagamento
 * 
 * Enunciado:
 * Crie uma classe base chamada Pagamento com um método processarPagamento(),
 * que apenas imprime "Processando pagamento genérico". Em seguida, crie duas
 * subclasses: PagamentoCartao e PagamentoBoleto.
 * ● A classe PagamentoCartao deve sobrescrever o método processarPagamento()
 * para imprimir "Processando pagamento via cartão de crédito".
 * ● A classe PagamentoBoleto deve sobrescrever o método processarPagamento()
 * para imprimir "Processando pagamento via boleto bancário".
 * ● Instancie objetos de ambas as classes e demonstre o polimorfismo chamando o
 * método processarPagamento() em cada um deles.
 * 
 * Pergunta:
 * Como o polimorfismo por sobrescrita facilita a implementação de diferentes
 * formas de pagamento dentro de um sistema sem alterar o código da classe base?
 */