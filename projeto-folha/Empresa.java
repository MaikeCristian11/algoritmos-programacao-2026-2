// ============================================================
//  Sistema de folha de pagamento
//  Esqueleto da aula de 05/11. Complete os TODO.
// ============================================================
//
//  O menu e a leitura do teclado ja estao prontos, porque sao
//  encanamento de Java. O raciocinio esta nos TODO.

import java.util.Scanner;

public class Empresa {

    static Scanner teclado = new Scanner(System.in);

    static Funcionario[] folha = new Funcionario[50];
    static int quantos = 0;     // quantos funcionarios ja foram cadastrados

    public static void main(String[] args) {

        int opcao = -1;

        while (opcao != 0) {
            System.out.println();
            System.out.println("=== FOLHA DE PAGAMENTO ===");
            System.out.println("1 - Cadastrar funcionario");
            System.out.println("2 - Mostrar a folha do mes");
            System.out.println("3 - Total por setor");
            System.out.println("4 - Maior salario");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");

            opcao = teclado.nextInt();
            teclado.nextLine();

            if (opcao == 1) {
                cadastrar();
            } else if (opcao == 2) {
                mostrarFolha();
            } else if (opcao == 3) {
                totalPorSetor();
            } else if (opcao == 4) {
                maiorSalario();
            } else if (opcao != 0) {
                System.out.println("Opcao invalida.");
            }
        }

        System.out.println("Ate logo.");
        teclado.close();
    }

    // ---------------------------------------------------------
    // Pronto: le um funcionario e guarda no vetor.
    // ---------------------------------------------------------
    static void cadastrar() {
        System.out.print("Nome: ");
        String nome = teclado.nextLine();

        System.out.print("Matricula: ");
        String matricula = teclado.nextLine();

        System.out.print("Setor (Administrativo, Producao, Vendas): ");
        String setor = teclado.nextLine();

        System.out.print("Salario base: ");
        double salario = teclado.nextDouble();
        teclado.nextLine();

        Funcionario f = new Funcionario(nome, matricula, setor, salario);

        if (setor.equals("Producao")) {
            System.out.print("Horas extras no mes: ");
            f.horasExtras = teclado.nextDouble();
            teclado.nextLine();
        } else if (setor.equals("Vendas")) {
            System.out.print("Vendas do mes: ");
            f.vendasDoMes = teclado.nextDouble();
            teclado.nextLine();
        }

        folha[quantos] = f;
        quantos = quantos + 1;

        System.out.println("Cadastrado. Agora sao " + quantos + " funcionarios.");
    }

    // ---------------------------------------------------------
    // TODO 2: percorrer a folha, chamar exibirDados em cada um
    //         e mostrar o total no fim.
    //
    //   Cuidado: o vetor tem 50 posicoes, mas so as primeiras
    //   "quantos" estao preenchidas. Percorra ate quantos, e nao
    //   ate folha.length, senao voce bate em posicao vazia.
    // ---------------------------------------------------------
    static void mostrarFolha() {
        System.out.println("TODO 2");
    }

    // ---------------------------------------------------------
    // TODO 3: mostrar quanto a empresa paga em cada um dos tres
    //         setores.
    //
    //   Sao tres acumuladores, ou um laco por setor. Os dois
    //   caminhos valem.
    // ---------------------------------------------------------
    static void totalPorSetor() {
        System.out.println("TODO 3");
    }

    // ---------------------------------------------------------
    // TODO 4: mostrar o funcionario de maior salario.
    //
    //   E o mesmo padrao do maior que voces fizeram com vetores,
    //   so que comparando calcularSalario() de cada um.
    //   Pense no caso da folha vazia.
    // ---------------------------------------------------------
    static void maiorSalario() {
        System.out.println("TODO 4");
    }
}
