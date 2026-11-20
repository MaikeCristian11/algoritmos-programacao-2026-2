# A3 — sistema de folha de pagamento

O ponto de partida do projeto. Cinco arquivos, dos quais dois já vêm completos como modelo. O que falta está marcado com `TODO`, dezessete no total.

Apresentação em **26/11**. Entrega do código em **05/12**. Os requisitos da apresentação estão em [APRESENTACAO_26-11.md](APRESENTACAO_26-11.md).

## Antes de mexer em qualquer coisa

Compile e rode sem alterar nada:

```bash
javac *.java
java Principal
```

O menu abre e a opção 4 imprime `TODO 16`. Se isso aconteceu, o ambiente está certo e daqui em diante todo erro é do código de vocês. Se não compilou agora, não vai ser depois de três horas de alteração que a causa vai ficar mais fácil de achar.

## O que tem em cada arquivo

| Arquivo | Situação |
|---|---|
| `Colaborador.java` | Completo. É o molde que vocês copiam nos outros |
| `ColaboradorPadrao.java` | Completo. Oito linhas, nenhum cálculo, e funciona |
| `ColaboradorComissionado.java` | Atributos e construtor prontos. TODO 1 a 5 |
| `ColaboradorProducao.java` | Quase vazia. TODO 6 a 12 |
| `Principal.java` | Menu e leitura validada prontos. TODO 13 a 17 |

## As regras de cálculo

```
Padrão         salarioFinal  = salarioBase
Comissionado   comissao      = valorVendas × percentualComissao ÷ 100
               salarioFinal  = salarioBase + comissao
Produção       produtividade = quantidadePecas × valorPorPeca
               salarioFinal  = salarioBase + produtividade
```

Salário base de R$ 2.000,00 para todos, já declarado como constante em `Colaborador.java`.

## Em que ordem fazer

Faça um passo por vez e rode entre cada um. Quem escreve tudo de uma vez e só então compila recebe trinta erros juntos, e aí não dá para saber qual causou qual.

| Passo | O quê | Como sabe que acabou |
|---|---|---|
| 1 | `ColaboradorComissionado` inteira | No `Programa` do encontro 12, Maria dá 2.400,00 |
| 2 | `ColaboradorProducao` inteira | No mesmo `Programa`, Carla dá 2.420,00 |
| 3 | Cadastro padrão e gerar folha | Dá para cadastrar e ver a folha |
| 4 | Os outros dois cadastros | Os três tipos aparecem na folha |
| 5 | O resumo | Total bate em 6.820,00 |

Os passos 1 e 2 dá para testar sem ter menu nenhum: use o `Programa.java` de `03-java-poo/encontro12-polimorfismo/etapa1_subclasses`, que cria um colaborador de cada tipo e imprime os três.

## Conferência

Cadastre estes três e gere a folha:

| Tipo | Matrícula | Nome | Dados | Salário final |
|---|---|---|---|---|
| Padrão | 001 | Ana | — | 2.000,00 |
| Comissionado | 234 | Maria | vendas 10000, 4% | 2.400,00 |
| Produção | 555 | Carla | 120 peças, R$ 3,50 | 2.420,00 |

Total da folha: **6.820,00**. Se bater, os três cálculos estão certos. Se não bater, o erro está em um dos três `calcularSalarioFinal`, e dá para descobrir qual conferindo um por um na mão.

## Cinco erros que vão aparecer

| A mensagem, ou o sintoma | A causa |
|---|---|
| `salarioBase has private access` | Usou o atributo direto. Na subclasse, chame `getSalarioBase()` |
| `constructor Colaborador cannot be applied` | Faltou `super(...)` na primeira linha do construtor |
| A folha sai com 2.000,00 para todo mundo | O `@Override` do `calcularSalarioFinal` não pegou |
| O tipo sai como `Colaborador` | Falta o `getTipo` na subclasse, ou o nome está trocado |
| A média do resumo sai `NaN` | Pediu o resumo sem ninguém cadastrado |

As duas primeiras o compilador acusa, e são as baratas. As três de baixo não: o programa roda e entrega resultado errado em silêncio. É por isso que os números de conferência existem.

## Trabalhem com commits

Se vocês clonaram este repositório, não trabalhem dentro dele. Copiem a pasta `projeto-folha` para outro lugar e criem o repositório de vocês lá, senão o próximo `git pull` vai brigar com as alterações.

Commit a cada TODO que funcionar, em vez de um commit gigante no fim. Quando vocês quebrarem alguma coisa que estava funcionando, e isso vai acontecer, o commit anterior é o caminho de volta.
