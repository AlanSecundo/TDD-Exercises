# TDD-Exercises

O objetivo deste repositório é forneces atividades que devem ser implementadas utilizando a prática de Test-driven Development (TDD).

## Exercícios:

### Exercício 1 - Conversão de moeda

Requisito: Conversor de Moeda

Você deve implementar uma classe chamada CurrencyConverter que será responsável por converter valores entre diferentes moedas. A classe deve suportar conversões entre Real (BRL), Dólar Americano (USD) e Euro (EUR).

Especificações:

**Conversão de Real para Dólar:**
<br/>

- A classe deve permitir a conversão de um valor em Reais (BRL) para Dólares Americanos (USD).<br/>
- A taxa de conversão inicial será de 1 USD = 5 BRL.

**Conversão de Dólar para Real:**

- A classe deve permitir a conversão de um valor em Dólares Americanos (USD) para Reais (BRL).
- A taxa de conversão inicial será de 1 USD = 5 BRL.

**Conversão de Real para Euro:**

- A classe deve permitir a conversão de um valor em Reais (BRL) para Euros (EUR).
- A taxa de conversão inicial será de 1 EUR = 6 BRL.

**Conversão de Euro para Real:**

- A classe deve permitir a conversão de um valor em Euros (EUR) para Reais (BRL).
- A taxa de conversão inicial será de 1 EUR = 6 BRL.

**Exemplos de Uso:**

Real para Dólar (1 USD = 5 BRL):

- Converter 10 BRL para USD deve resultar em 2 USD.

Dólar para Real (1 USD = 5 BRL):

- Converter 20 USD para BRL deve resultar em 100 BRL.

Real para Euro (1 EUR = 6 BRL):

- Converter 12 BRL para EUR deve resultar em 2 EUR.

Euro para Real (1 EUR = 6 BRL):

- Converter 3 EUR para BRL deve resultar em 18 BRL.

---

## Exercício 2 - Cálculo de frete

Implemente uma classe que calcule o valor do frete com base no peso e na distância do envio.

- A regra de cálculo esperado será sempre distância _ peso _ taxa fixa de 0.1 (10%).

- Se a distância do frete for menor que 50, o valor do frete deve ser sempre 0;

- Se o peso do frete for menor que 0.5, o valor do frete deve ser 0;

---

## Exercício 3 (Desafio) - Validação de CPF

Implemente uma função que valide se um CPF é válido.

Requisitos:

- O método deve receber uma string de CPF e retornar um valor booleano indicando se o CPF é válido.
- Inclua cenários de teste como:
  - CPF válido;
  - CPF inválido;
  - CPF com formato incorreto;
  - CPF nulo ou vazio;
