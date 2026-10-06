# Resolução exercício Beecrowd1132

## Descrição do problema
Escreva um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos números que não são múltiplos de 13 entre X e Y, incluindo ambos.

## Como Funciona
1. O programa recebe dois números inteiros através do terminal e os armazena nas variáveis `num1` e `num2`.
2. Uma estrutura condicional (`if/else`) compara os números para determinar e separar qual é o `numeromaior` e qual é o `numeromenor`. Isso garante que o laço funcione corretamente mesmo se as entradas estiverem invertidas.
3. Uma estrutura de repetição `for` inicia no `numeromenor` e avança de forma sequencial até o `numeromaior`.
4. Dentro do laço, a condicional `if (i % 13 != 0)` utiliza o operador de resto (`%`) para filtrar e acumular na variável `total` apenas os números que não são divisíveis por 13.
5. Ao término do loop, o programa imprime o valor acumulado no console.