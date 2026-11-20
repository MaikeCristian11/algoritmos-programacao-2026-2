# Encontro 12 — polimorfismo e ArrayList

Código da aula de 19/11, a última de conteúdo. Duas etapas, cada uma independente.

## etapa1_subclasses

As quatro classes prontas: `Colaborador`, `ColaboradorPadrao`, `ColaboradorComissionado` e `ColaboradorProducao`. O `Programa.java` cria um de cada tipo e chama `exibirDados` em cada um, uma chamada por vez.

```bash
javac *.java
java Programa
```

Repare que as três saídas são diferentes e nenhuma linha do `Programa.java` decide isso. Quem decide é a classe de cada objeto.

No fim ele imprime as três contas separadas, para conferir na mão:

```
Ana:   2000 + nada                = R$ 2.000,00
Maria: 2000 + 10000 x 4 / 100     = R$ 2.400,00
Carla: 2000 + 120 x 3,50          = R$ 2.420,00
```

## etapa2_arraylist

As mesmas quatro classes. O que muda é o `Programa.java`: os três objetos entram numa lista só e um `for` de três linhas imprime os três blocos.

```bash
javac *.java
java Programa
```

O total fecha em **R$ 6.820,00**, que é o número de conferência do projeto.

A última parte do programa mostra a lista crescendo e encolhendo com `add` e `remove`, sem contador e sem empurrar ninguém na mão. É o argumento prático contra o vetor de 50 posições.

## O que vem depois

O esqueleto da A3 vai separado, em `A3_Colaboradores_Esqueleto.zip`. Ele traz `Colaborador` e `ColaboradorPadrao` completas como modelo, o menu pronto, os métodos de leitura validada, e 17 TODOs.

Ordem sugerida para terminar:

| Passo | O quê | Como sabe que acabou |
|---|---|---|
| 1 | `ColaboradorComissionado` inteira | A Maria fecha em 2.400,00 |
| 2 | `ColaboradorProducao` inteira | A Carla fecha em 2.420,00 |
| 3 | Cadastro padrão e gerar folha | Dá para cadastrar e ver a folha |
| 4 | Os outros dois cadastros | Os três tipos aparecem na folha |
| 5 | O resumo | Total bate em 6.820,00 |

Faça um passo por vez e rode entre cada um.
