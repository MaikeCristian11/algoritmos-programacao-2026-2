# Encontro 11 — herança e encapsulamento

Código da aula de 12/11, em três etapas. Rode na ordem. Cada pasta é independente e compila sozinha.

A ideia é ver o problema antes do remédio. Se você pular direto para a etapa 3, vai ver uma solução sem ter visto a pergunta.

## etapa1_o_problema

É o código de quinta passada, com os nomes que a A3 pede: `Colaborador` em vez de `Funcionario`, `tipo` em vez de `setor`.

```bash
javac *.java
java Programa
```

A folha sai certa, e depois o programa faz três coisas que não deveriam ser possíveis: escreve salário negativo, escreve 900% de comissão e troca o tipo por um que não existe. Java aceita as três.

Olhe o Bruno com 900%: ele vira o funcionário mais caro da folha, R$ 92.000,00, com uma linha.

O terceiro é o pior. A Carla vira "Gerente", o `if` de `calcularSalarioFinal` não conhece esse tipo, cai no `return` do fim e devolve o salário base. Nenhum erro, nenhum aviso, número errado.

## etapa2_encapsulamento

O que mudou: `private` nos atributos, `get` para ler, `set` para escrever, e a validação dentro do `set`.

```bash
javac *.java
java Programa
```

As mesmas tentativas da etapa 1, agora recusadas uma por uma. A folha fica intacta.

No fim do `Programa.java` tem uma linha comentada:

```java
// ana.salarioBase = -500;
```

Descomente e compile para ver o erro:

```
error: salarioBase has private access in Colaborador
```

Vale mostrar esse erro na projeção. Erro de compilação é melhor que número errado na folha.

O `if` por tipo continua aqui, intacto. Encapsulamento não resolve isso, e nem era a função dele.

## etapa3_heranca

O estado final da aula. Duas classes:

- `Colaborador.java` — o que todo colaborador tem
- `ColaboradorPadrao.java` — oito linhas, nenhum cálculo, e funciona

```bash
javac *.java
java Programa
```

O `if` por tipo desapareceu. Ninguém apagou: ele não tem mais o que decidir, porque cada tipo virou uma classe.

O `Programa.java` também tem uma linha comentada, para mostrar que `private` vale para a subclasse também:

```java
// System.out.println(ana.salarioBase);
```

Essas duas classes são exatamente os dois primeiros arquivos da A3. Não é exercício paralelo: é o projeto começando.

## O que fica para 19/11

`ColaboradorComissionado` e `ColaboradorProducao`, que têm cálculo próprio e precisam sobrescrever `calcularSalarioFinal`. Mais `ArrayList`, que aposenta o vetor de 50 posições com contador.
