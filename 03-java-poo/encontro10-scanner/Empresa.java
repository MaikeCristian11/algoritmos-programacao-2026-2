// A mesma folha do encontro 9, agora lendo do teclado.
// A unica novidade e o Scanner. A classe Funcionario nao mudou nem uma letra.

import java.util.Scanner;          // 1. avisar que vamos usar o Scanner

public class Empresa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);   // 2. criar o leitor

        System.out.print("Quantos funcionarios? ");
        int quantos = teclado.nextInt();
        teclado.nextLine();         // 3. limpar o resto da linha, senao o proximo nextLine vem vazio

        Funcionario[] folha = new Funcionario[quantos];

        for (int i = 0; i < quantos; i++) {
            System.out.println();
            System.out.println("Funcionario " + (i + 1));

            System.out.print("  Nome: ");
            String nome = teclado.nextLine();

            System.out.print("  Matricula: ");
            String matricula = teclado.nextLine();

            System.out.print("  Setor: ");
            String setor = teclado.nextLine();

            System.out.print("  Salario base: ");
            double salario = teclado.nextDouble();
            teclado.nextLine();     // mesma limpeza de novo

            folha[i] = new Funcionario(nome, matricula, setor, salario);
        }

        System.out.println();
        System.out.println("FOLHA DE PAGAMENTO");

        double total = 0;
        for (int i = 0; i < folha.length; i++) {
            folha[i].exibirDados();
            total = total + folha[i].calcularSalario();
        }

        System.out.println("Total: R$ " + total);

        teclado.close();
    }
}
