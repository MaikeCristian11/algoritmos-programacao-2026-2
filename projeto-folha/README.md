# Sistema de folha de pagamento — esqueleto

O ponto de partida do projeto. O menu e o cadastro já vêm prontos, porque são encanamento de Java e não o raciocínio que a disciplina quer exercitar. O que falta está marcado com `TODO`.

## Antes de mexer em qualquer coisa

Compile e rode sem alterar nada:

```bash
javac *.java
java Empresa
```

Cadastre um funcionário na opção 1 e escolha a opção 2. Vai aparecer a palavra `TODO 2` na tela. É assim que você separa problema de ambiente de problema de código. Se não compilou agora, não vai ser depois de três horas de alteração que a causa vai ficar mais fácil de achar.

## O que falta

| Onde | O que fazer |
|---|---|
| `Funcionario.java` | **TODO 1** — o cálculo do salário, por setor |
| `Empresa.java` | **TODO 2** — mostrar a folha do mês e o total |
| `Empresa.java` | **TODO 3** — total pago em cada setor |
| `Empresa.java` | **TODO 4** — o funcionário de maior salário |

As regras de cada setor estão escritas em comentário, dentro do TODO 1.

## Como conferir se está certo

Cadastre estes três e rode a opção 2:

| Nome | Setor | Salário base | Extra |
|---|---|---|---|
| Ana | Administrativo | 3200,00 | — |
| Bruno | Producao | 2600,00 | 20 horas extras |
| Carla | Vendas | 4000,00 | 20000,00 em vendas |

O total tem que fechar em **11620,00**. Se fechar, o TODO 1 e o TODO 2 estão certos. Se não fechar, o erro está no cálculo de um dos três, e dá para descobrir qual conferindo um por um na mão.

Dependendo da configuração de idioma da sua máquina, os valores podem sair com vírgula (`3520,00`) em vez de ponto. Não é erro.

## Duas armadilhas que pegam quase todo mundo

**Comparar texto com `==`.** Em Java isso compila, roda e dá falso para sempre. Use `equals`:

```java
if (setor.equals("Producao")) { ... }
```

**Percorrer o vetor inteiro.** `folha` tem 50 posições, mas só as primeiras `quantos` foram preenchidas. Vá até `quantos`, e não até `folha.length`, senão você bate em posição vazia e o programa quebra.

## Trabalhe com commits

Se você clonou o repositório, não trabalhe dentro dele. Copie a pasta `projeto-folha` para outro lugar e crie o seu próprio repositório lá, senão o próximo `git pull` vai brigar com as suas alterações.

Commit a cada TODO que funcionar, em vez de um commit gigante no fim. Quando você quebrar alguma coisa que estava funcionando, e isso vai acontecer, o commit anterior é o caminho de volta.
