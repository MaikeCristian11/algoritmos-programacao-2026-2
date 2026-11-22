// ============================================================
//  Programa principal
// ============================================================
//
//  Guarda todos os colaboradores em um unico ArrayList, do
//  tipo da classe base. Cabem os tres tipos na mesma lista,
//  porque todo ColaboradorPadrao, todo ColaboradorComissionado
//  e todo ColaboradorProducao tambem e um Colaborador.

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    static Scanner teclado = new Scanner(System.in);
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
    //  Opcao 1
    // ---------------------------------------------------------
    static void cadastrarPadrao() {
        String matricula = lerMatriculaNova();
        if (matricula == null) {
            return;
        }

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        colaboradores.add(new ColaboradorPadrao(matricula, nome));
        System.out.println("Colaborador padrao cadastrado.");
    }

    // ---------------------------------------------------------
    //  Opcao 2
    // ---------------------------------------------------------
    static void cadastrarComissionado() {
        String matricula = lerMatriculaNova();
        if (matricula == null) {
            return;
        }

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        double vendas = lerDoubleNaoNegativo("Valor de vendas: ");
        double percentual = lerPercentual("Percentual de comissao (0 a 100): ");

        colaboradores.add(new ColaboradorComissionado(matricula, nome, vendas, percentual));
        System.out.println("Colaborador comissionado cadastrado.");
    }

    // ---------------------------------------------------------
    //  Opcao 3
    // ---------------------------------------------------------
    static void cadastrarProducao() {
        String matricula = lerMatriculaNova();
        if (matricula == null) {
            return;
        }

        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        int pecas = (int) lerDoubleNaoNegativo("Quantidade de pecas: ");
        double valorPeca = lerDoubleNaoNegativo("Valor por peca: ");

        colaboradores.add(new ColaboradorProducao(matricula, nome, pecas, valorPeca));
        System.out.println("Colaborador de producao cadastrado.");
    }

    // ---------------------------------------------------------
    //  Opcao 4
    // ---------------------------------------------------------
    static void gerarFolha() {
        System.out.println();

        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        System.out.println("===== FOLHA DE PAGAMENTO =====");

        // A lista e de Colaborador, mas cada objeto roda a sua
        // propria versao de exibirDados. Nenhum if de tipo aqui.
        for (Colaborador c : colaboradores) {
            System.out.println();
            c.exibirDados();
        }
    }

    // ---------------------------------------------------------
    //  Opcao 5
    // ---------------------------------------------------------
    static void exibirResumo() {
        System.out.println();

        if (colaboradores.isEmpty()) {
            System.out.println("Nenhum colaborador cadastrado.");
            return;
        }

        int padrao = 0;
        int comissionados = 0;
        int producao = 0;
        double total = 0;

        for (Colaborador c : colaboradores) {
            total = total + c.calcularSalarioFinal();

            // Cada objeto ja sabe dizer o proprio tipo, entao
            // da para contar sem perguntar de que classe ele e.
            if (c.getTipo().equals("Comissionado")) {
                comissionados = comissionados + 1;
            } else if (c.getTipo().equals("Producao")) {
                producao = producao + 1;
            } else {
                padrao = padrao + 1;
            }
        }

        System.out.println("===== RESUMO DA FOLHA =====");
        System.out.println("Colaboradores padrao: " + padrao);
        System.out.println("Colaboradores comissionados: " + comissionados);
        System.out.println("Colaboradores de producao: " + producao);
        System.out.println("Total de colaboradores: " + colaboradores.size());
        System.out.printf("Total da folha: R$ %,.2f%n", total);
        System.out.printf("Media por colaborador: R$ %,.2f%n", total / colaboradores.size());
    }

    // =========================================================
    //  Leitura validada
    // =========================================================

    // Devolve null quando a matricula ja existe, para o metodo
    // que chamou poder cancelar o cadastro.
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
