# Java — orientação a objetos

Código das aulas de outubro e novembro, na ordem em que foi construído no projetor.

## encontro09-primeira-classe

A mesma folha de pagamento escrita de três jeitos, uma versão em cima da outra.

| Pasta | O que mostra |
|---|---|
| `etapa1_sem_objetos/` | Vetores paralelos, um para cada campo. Funciona, e começa a doer quando o quarto campo aparece |
| `etapa2_primeira_classe/` | A classe `Funcionario`. Os quatro vetores viram um só |
| `etapa3_folha_completa/` | Vetor de objetos, cálculo por setor e relatório |

Leia na ordem. A etapa 1 existe para você sentir o problema que a etapa 2 resolve. Pular direto para a 2 é ver a resposta sem ter visto a pergunta.

## encontro10-scanner

A folha lendo do teclado em vez de ter os dados escritos no código. A classe `Funcionario` não mudou nenhuma linha nessa passagem, e isso é o ponto da aula.

## Como compilar e rodar

Entre na pasta da etapa e:

```bash
javac *.java
java Empresa
```

Na etapa 1 o arquivo tem outro nome:

```bash
javac FolhaSemObjetos.java
java FolhaSemObjetos
```

Precisa do JDK instalado. Baixe em [adoptium.net](https://adoptium.net). Para conferir se deu certo:

```bash
javac -version
```

Se aparecer um número de versão, está pronto. Se aparecer "comando não encontrado", o Java instalou mas não entrou no PATH, e aí me procure que resolvemos em dois minutos.

## Erro mais comum

```
error: class Empresa is public, should be declared in a file named Empresa.java
```

Em Java o nome do arquivo tem que ser igual ao nome da classe, com a mesma letra maiúscula. Renomeou o arquivo e esqueceu a classe lá dentro, ou o contrário, dá isso.
