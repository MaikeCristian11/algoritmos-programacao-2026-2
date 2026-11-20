// ============================================================
//  Programa principal
// ============================================================
//
//  O menu, o laco e a leitura do teclado ja estao montados,
//  para voces gastarem o tempo nas classes e nao brigando com
//  Scanner. O que falta sao os cinco metodos marcados abaixo.
//
//  Rode assim que abrir, antes de escrever qualquer linha. O
//  menu tem que aparecer e a opcao 4 tem que imprimir TODO 16.
//  Se isso acontecer, o ambiente esta certo e daqui em diante
//  todo erro e do codigo de voces.

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static Scanner teclado = new Scanner(System.in);

    // Uma lista so, do tipo da classe base. Cabem os tres tipos
    // aqui dentro, porque todo ColaboradorPadrao tambem e um
    // Colaborador, e o mesmo vale para os outros dois.
    static ArrayList<Colaborador> colaboradores = new ArrayList<>();

    public static void main(String[] args) {

        // Faz os valores sairem no formato brasileiro,
        // 2.000,00 em vez de 2,000.00.
        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        int opcao = -1;

        while (opcao != 0) {
            System.out.println();
            System.out.println("=== FOLHA DE PAGAMENTO ===");
            System.out.println("1 - Cadastrar Colaborador Padrao");
            System.out.println("2 - Cadastrar Colaborador Comissionado");
            System.out.println("3 - Cadastrar Colaborador Producao");
            System.out.println("4 - Gerar Folha de Pagamento");
            System.out.println("5 - Exibir Resumo da Folha");
            System.out.println("0 - Sair do Programa");
            System.out.print("Opcao: ");

            opcao = lerInteiro();

            if (opcao == 1) {
                cadastrarPadrao();
            } else if (opcao == 2) {
                cadastrarComissionado();
            } else if (opcao == 3) {
                cadastrarProducao();
            } else if (opcao == 4) {
                gerarFolha();
            } else if (opcao == 5) {
                exibirResumo();
            } else if (opcao != 0) {
                System.out.println("Opcao invalida.");
            }
        }

        System.out.println("Ate logo.");
        teclado.close();
    }

    // ---------------------------------------------------------
    //  TODO 13: cadastrarPadrao
    //
    //  Pergunte matricula e nome, crie um ColaboradorPadrao com
    //  new e adicione na lista com colaboradores.add(...).
    //
    //  Para a matricula, use lerMatriculaNova(), que ja recusa
    //  branco e repetida. Ela devolve null quando recusa, entao
    //  teste isso e saia do metodo com return.
    //
    //  Este e o mais simples dos tres. Faca ele primeiro e rode
    //  antes de partir para os outros dois.
    // ---------------------------------------------------------
    static void cadastrarPadrao() {
        System.out.println("TODO 13");
    }

    // ---------------------------------------------------------
    //  TODO 14: cadastrarComissionado
    //
    //  Igual ao de cima, com duas perguntas a mais: valor de
    //  vendas e percentual de comissao.
    //
    //  Use lerDoubleNaoNegativo e lerPercentual, que ja estao
    //  prontos la embaixo. Eles recusam negativo e recusam
    //  letra, que e o que a especificacao pede na validacao.
    // ---------------------------------------------------------
    static void cadastrarComissionado() {
        System.out.println("TODO 14");
    }

    // ---------------------------------------------------------
    //  TODO 15: cadastrarProducao
    //
    //  Quantidade de pecas e valor por peca.
    //
    //  A quantidade de pecas e int, e lerDoubleNaoNegativo
    //  devolve double. Converta com (int) na frente da chamada.
    // ---------------------------------------------------------
    static void cadastrarProducao() {
        System.out.println("TODO 15");
    }

    // ---------------------------------------------------------
    //  TODO 16: gerarFolha
    //
    //  Percorra a lista e chame exibirDados em cada um.
    //
    //  Nao escreva if para descobrir o tipo. Cada objeto ja
    //  sabe qual versao de exibirDados e a dele. Se voce sentir
    //  vontade de testar o tipo aqui, e sinal de que falta um
    //  @Override em alguma subclasse.
    //
    //  Trate a lista vazia antes do laco.
    // ---------------------------------------------------------
    static void gerarFolha() {
        System.out.println("TODO 16");
    }

    // ---------------------------------------------------------
    //  TODO 17: exibirResumo
    //
    //  Um apanhado da folha inteira, em vez de colaborador por
    //  colaborador. Sugestao do que mostrar:
    //
    //    - quantos colaboradores de cada tipo
    //    - quantos no total
    //    - o total da folha
    //    - a media por colaborador
    //
    //  O total e um acumulador somando calcularSalarioFinal()
    //  de cada um, o mesmo padrao de soma que voces fizeram
    //  com vetores.
    //
    //  Para contar por tipo, use o getTipo que cada subclasse
    //  ja responde:
    //      if (c.getTipo().equals("Comissionado")) { ... }
    //  Com equals, e nunca com ==, porque e texto.
    //
    //  Divisao por zero: a media so faz sentido com a lista
    //  cheia. Trate a lista vazia antes.
    // ---------------------------------------------------------
    static void exibirResumo() {
        System.out.println("TODO 17");
    }

    // =========================================================
    //  Daqui para baixo esta pronto. Nao precisa mexer.
    // =========================================================

    // Devolve null quando a matricula e invalida ou ja existe,
    // para o metodo que chamou poder cancelar o cadastro.
    static String lerMatriculaNova() {
        System.out.print("Matricula: ");
        String matricula = teclado.nextLine().trim();

        if (matricula.isEmpty()) {
            System.out.println("Matricula nao pode ficar em branco. Cadastro cancelado.");
            return null;
        }

        for (Colaborador c : colaboradores) {
            if (c.getMatricula().equals(matricula)) {
                System.out.println("Ja existe colaborador com essa matricula. Cadastro cancelado.");
                return null;
            }
        }

        return matricula;
    }

    static int lerInteiro() {
        while (true) {
            String linha = teclado.nextLine();
            try {
                return Integer.parseInt(linha.trim());
            } catch (NumberFormatException e) {
                System.out.print("Digite um numero inteiro: ");
            }
        }
    }

    static double lerDoubleNaoNegativo(String rotulo) {
        while (true) {
            System.out.print(rotulo);
            String linha = teclado.nextLine().trim().replace(",", ".");
            try {
                double valor = Double.parseDouble(linha);
                if (valor < 0) {
                    System.out.println("Valor negativo nao e aceito.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Digite um numero.");
            }
        }
    }

    static double lerPercentual(String rotulo) {
        while (true) {
            double valor = lerDoubleNaoNegativo(rotulo);
            if (valor > 100) {
                System.out.println("Percentual nao pode passar de 100.");
                continue;
            }
            return valor;
        }
    }
}
