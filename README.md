# Stream/Lambda Instruções

**Due:** September 14, 2026 11:59 PM - Multiple submissions allowed  
**Orientador:** ALESSANDRO FERREIRA PAZ LIMA

## Tarefa 1: Manipulação de Produtos


**A. Definição da Classe Produto:**
A classe contém os atributos `nome`, `categoria` e `preco`, além dos getters e do método `toString` para facilitar a impressão dos objetos.

**B. População da Lista:**
Uma lista de produtos é criada e populada com exemplos de diferentes categorias, como "Eletronicos", "Livros" e "Roupas".

**C. Filtragem (Filter):**
Utilizamos o método `filter` para selecionar apenas os produtos da categoria "Eletronicos".

**D. Transformação (Map) e Ordenação (Sorted):**

- **Map:** Aplica um desconto de 10% em cada produto eletrônico, criando novos objetos com o preço ajustado.
- **Sorted:** Ordena os produtos com desconto pelo preço, em ordem crescente.

**E. Redução (Reduce):**
Calcula o total gasto em produtos da categoria "Roupas" somando os preços filtrados.

**F. Agrupamento (GroupingBy):** _(Nota: listado originalmente como item 6)_
Agrupa os produtos por categoria e, para cada grupo, calcula a média de preço utilizando o coletor `averagingDouble`.

---

## Tarefa 2: Manipulação de Dados de Funcionários com Streams e Lambdas

**Contexto:** Você faz parte da equipe de desenvolvimento de uma empresa e recebeu uma lista de funcionários. Cada funcionário possui os seguintes atributos: `nome`, `departamento`, `salário` e `anos de serviço`.

**Objetivo:** Implementar um programa em Java que utilize a API de Streams e Expressões Lambda para realizar diversas operações de manipulação e processamento dessa lista de funcionários.

### Passos da Tarefa:

**1. Criação da Classe Funcionario:**

- Defina uma classe `Funcionario` com os atributos:
- `nome` (String)
- `departamento` (String)
- `salario` (double)
- `anosDeServico` (int)

- Implemente os métodos getters e sobrescreva o método `toString` para facilitar a visualização dos dados.

**2. População da Lista:**

- Crie uma lista (por exemplo, um `ArrayList`) contendo pelo menos **8 objetos** `Funcionario`, distribuídos em pelo menos **3 departamentos diferentes**.
- Atribua valores variados aos atributos, garantindo cenários distintos para aplicar os filtros e transformações.

**3. Operações com Streams e Lambdas:**
Utilize a API de Streams para implementar as seguintes operações:

- **Filtragem:** Selecione os funcionários que possuem salário superior a um valor definido (por exemplo, R$ 3000).
- **Mapeamento (Map):** Aplique um aumento de 5% no salário para os funcionários que possuem mais de 10 anos de serviço. Crie novos objetos ou atualize os existentes conforme sua abordagem.
- **Ordenação (Sorted):** Ordene os funcionários pelo nome em ordem alfabética.
- **Redução (Reduce):** Calcule o total gasto com salários, somando os salários de todos os funcionários.
- **Agrupamento (GroupingBy):** Agrupe os funcionários por departamento e, para cada grupo, calcule a média dos salários.

**4. Exibição dos Resultados:**

- Utilize o método `forEach` para imprimir a lista resultante das operações, como os funcionários filtrados e ordenados.
- Exiba separadamente o total calculado e as médias salariais por departamento.
