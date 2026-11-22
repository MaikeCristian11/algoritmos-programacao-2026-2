# A3 — apresentação de 26/11

Algoritmos e Programação · Prof. Maike Cristian · Unicuritiba 2026/2

A aula de 26/11 é a apresentação do sistema de folha de pagamento. Não é prova nem defesa de TCC. O código completo está nesta pasta, e o trabalho do grupo é rodá-lo, entendê-lo por inteiro e explicar como ele funciona.

---

## Formato

| Item | Como é |
|---|---|
| Duração | 10 minutos por grupo, mais 5 de perguntas |
| Quem fala | Todo mundo do grupo, pelo menos uma parte |
| Material | O código rodando. Slide é opcional e não conta ponto |
| Ordem | Sorteada no começo da aula, então chegue pronto |

Baixe a versão completa do repositório (`git pull` ou o zip do GitHub) e leve o projeto já compilado, em pendrive e também em algum lugar na nuvem. Máquina que não abre o projeto na hora é o problema mais comum em apresentação, e ele é evitável.

---

## O que mostrar rodando

Os quatro primeiros itens são obrigatórios e devem acontecer ao vivo, não em captura de tela.

**1. Cadastrar um colaborador de cada tipo.** Um padrão, um comissionado e um de produção. Use dados que vocês já testaram, não invente na hora.

**2. Gerar a folha de pagamento.** Mostre os três blocos saindo diferentes, com a linha do benefício aparecendo só em quem tem.

**3. Exibir o resumo.** Com os totais da folha.

**4. Tentar quebrar o programa.** Digite um salário negativo, uma letra onde deveria ir número, um percentual de 300. Mostre o programa recusando em vez de aceitar. Esse é o item que mais separa um trabalho pronto de um trabalho quase pronto.

---

## O que explicar do código

Abra os arquivos no projetor e responda três perguntas. Cada uma leva uns dois minutos.

**Onde está a herança?** Aponte a linha do `extends` e explique o que a subclasse ganhou sem escrever. A `ColaboradorPadrao` é o melhor exemplo, porque não tem cálculo nenhum e mesmo assim calcula certo.

**Onde está o encapsulamento?** Mostre um atributo `private` e o `set` que recusa valor inválido. Explique por que o atributo não é público, e o que aconteceria se fosse.

**Onde está o polimorfismo?** Mostre o laço que percorre o `ArrayList` e explique por que não existe `if` de tipo dentro dele. Essa é a pergunta que mais vai render discussão, então vale ensaiar.

---

## A pergunta que eu vou fazer para todo grupo

**Se a empresa criar um quarto tipo de colaborador, o que vocês mudariam no código?**

Por exemplo, um estagiário que recebe 60% do salário base. Quero ouvir quais arquivos vocês criariam ou alterariam, qual método seria sobrescrito, e por que o laço da folha não precisaria mudar. Quem entendeu herança e polimorfismo responde isso apontando para o código. Quem só decorou o código não consegue.

---

## Conferência antes de apresentar

Rode isto na véspera, com estes números:

| Tipo | Matrícula | Nome | Dados | Salário final |
|---|---|---|---|---|
| Comissionado | 234 | Maria | vendas 10000, 4% | 2.400,00 |
| Padrão | 001 | Ana | — | 2.000,00 |
| Produção | 555 | Carla | 120 peças, R$ 3,50 | 2.420,00 |

Total da folha: **6.820,00**.

Se fechar, a parte de cálculo está certa. Se não fechar, o erro está em um dos três `calcularSalarioFinal`, e dá para descobrir qual conferindo um por um.

---

## O que costuma dar errado na apresentação

**Chegar sem compilar.** Compile na véspera e de novo antes de entrar na sala.

**Só uma pessoa conhece o código.** A pergunta pode cair para qualquer integrante. Dividam os cinco arquivos entre vocês para estudar, e depois reservem uma tarde para cada um explicar a sua parte para os outros.

**Decorar o texto.** Explicação decorada cai por terra na primeira pergunta fora do roteiro. Entenda o código e fale olhando para ele.

**Gastar os dez minutos no cadastro.** Cadastrar três colaboradores leva um minuto. O tempo é para a explicação do código, que é o que a disciplina está avaliando.

---

## Calendário

| Data | O que acontece |
|---|---|
| 19/11 | Última aula de conteúdo |
| 22/11 | Versão completa do sistema publicada no repositório |
| 26/11 | Apresentação |
| 05/12 | Entrega do código |

Entre 22/11 e 26/11 vocês têm quatro dias para rodar o sistema, estudar o código e ensaiar. É suficiente se começar agora, e não é se começar na véspera.
