# A3 — sistema de folha de pagamento

Versão completa e estável do sistema, para servir de base à apresentação. Os cinco arquivos estão prontos, compilam e passam na conferência abaixo.

Apresentação final em **26/11**. Os requisitos da apresentação estão em [APRESENTACAO_26-11.md](APRESENTACAO_26-11.md).

## Como rodar

```bash
javac *.java
java Principal
```

O menu abre com as cinco opções funcionando: três cadastros, folha de pagamento e resumo.

## O que tem em cada arquivo

| Arquivo | Papel |
|---|---|
| `Colaborador.java` | Superclasse. Atributos `private`, constante `SALARIO_BASE`, get e set com validação |
| `ColaboradorPadrao.java` | Subclasse sem atributos. Só sobrescreve `getTipo` |
| `ColaboradorComissionado.java` | `valorVendas`, `percentualComissao`, `calcularComissao` |
| `ColaboradorProducao.java` | `quantidadePecas`, `valorPorPeca`, `calcularProdutividade` |
| `Principal.java` | `ArrayList<Colaborador>`, menu, cinco opções e leitura validada |

## As regras de cálculo

```
Padrão         salarioFinal  = salarioBase
Comissionado   comissao      = valorVendas × percentualComissao ÷ 100
               salarioFinal  = salarioBase + comissao
Produção       produtividade = quantidadePecas × valorPorPeca
               salarioFinal  = salarioBase + produtividade
```

Salário base de R$ 2.000,00 para todos, já declarado como constante em `Colaborador.java`.

## Conferência

Cadastre estes três e gere a folha:

| Tipo | Matrícula | Nome | Dados | Salário final |
|---|---|---|---|---|
| Padrão | 001 | Ana | — | 2.000,00 |
| Comissionado | 234 | Maria | vendas 10000, 4% | 2.400,00 |
| Produção | 555 | Carla | 120 peças, R$ 3,50 | 2.420,00 |

Total da folha: **6.820,00**. Se bater, os três cálculos estão certos. Se não bater, o erro está em um dos três `calcularSalarioFinal`, e dá para descobrir qual conferindo um por um na mão.

## Cinco erros comuns

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
