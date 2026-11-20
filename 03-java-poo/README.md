# Java — orientação a objetos

Código das aulas de outubro e novembro, na ordem em que foi construído no projetor.

| Pasta | Aula | Assunto |
|---|---|---|
| `encontro09-primeira-classe/` | 29/10 | Classes, objetos, construtor, vetor de objetos |
| `encontro10-scanner/` | 05/11 | Leitura do teclado com Scanner |
| `encontro11-heranca/` | 12/11 | Encapsulamento e herança |
| `encontro12-polimorfismo/` | 19/11 | Polimorfismo e ArrayList |

Cada pasta tem um README próprio. As dos encontros 11 e 12 estão divididas em etapas numeradas: **rode na ordem**, porque a primeira etapa existe para você sentir o problema que a seguinte resolve. Pular direto para a última é ver a resposta sem ter visto a pergunta.

## Como compilar e rodar

Entre na pasta da etapa e:

```bash
javac *.java
java Programa
```

No encontro 9 e no 10 os nomes são outros. O README de cada pasta diz qual.

Precisa do JDK instalado. Baixe em [adoptium.net](https://adoptium.net). Para conferir:

```bash
javac -version
```

Se aparecer um número de versão, está pronto. Se aparecer "comando não encontrado", o Java instalou mas não entrou no PATH, e aí me procure que resolvemos em dois minutos.

## Os erros mais comuns

**`class X is public, should be declared in a file named X.java`** — o nome do arquivo tem que ser igual ao nome da classe, com a mesma letra maiúscula.

**`cannot find symbol: class Colaborador`** — os arquivos não estão na mesma pasta. Todas as classes de uma etapa compilam juntas.

**`salarioBase has private access in Colaborador`** — você tentou ler o atributo direto. Dentro de uma subclasse, use `getSalarioBase()`.

**`constructor Colaborador in class Colaborador cannot be applied to given types`** — faltou o `super(...)` na primeira linha do construtor da subclasse.
