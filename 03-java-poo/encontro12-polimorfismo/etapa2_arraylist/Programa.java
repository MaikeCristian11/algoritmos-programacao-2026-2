// ============================================================
//  ETAPA 2 - ArrayList e o laco que nao tem if
// ============================================================
//
//  As mesmas quatro classes da etapa 1. O que muda e aqui:
//  os tres objetos entram numa lista so, e um for sozinho
//  imprime os tres blocos certos.

import java.util.ArrayList;
import java.util.Locale;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        // Uma lista do tipo da classe de cima. Cabem os tres
        // tipos aqui dentro, porque todo ColaboradorPadrao
        // tambem e um Colaborador, e o mesmo vale para os
        // outros dois.
        ArrayList<Colaborador> colaboradores = new ArrayList<>();

        colaboradores.add(new ColaboradorPadrao("001", "Ana Souza"));
        colaboradores.add(new ColaboradorComissionado("234", "Maria", 10000, 4));
        colaboradores.add(new ColaboradorProducao("555", "Carla Dias", 120, 3.50));

        System.out.println("=== A FOLHA INTEIRA, COM UM FOR SO ===");

        // Nenhum if de tipo aqui dentro. Cada objeto ja sabe
        // qual versao de exibirDados e a dele.
        for (Colaborador c : colaboradores) {
            System.out.println();
            c.exibirDados();
        }

        // -----------------------------------------------------
        //  Acumulador: o mesmo padrao dos vetores
        // -----------------------------------------------------
        double total = 0;
        for (Colaborador c : colaboradores) {
            total = total + c.calcularSalarioFinal();
        }

        System.out.println();
        System.out.printf("Colaboradores: %d%n", colaboradores.size());
        System.out.printf("Total da folha: R$ %,.2f%n", total);

        // -----------------------------------------------------
        //  A lista cresce e encolhe sozinha
        // -----------------------------------------------------
        System.out.println();
        System.out.println("=== A LISTA SE VIRA SOZINHA ===");
        System.out.println("Agora sao " + colaboradores.size() + " colaboradores.");

        colaboradores.add(new ColaboradorPadrao("002", "Bruno Lima"));
        System.out.println("Depois de um add, sao " + colaboradores.size() + ".");

        colaboradores.remove(0);
        System.out.println("Depois de um remove, sao " + colaboradores.size() + ".");

        System.out.println();
        System.out.println("Com vetor, o add exigiria um contador a mais,");
        System.out.println("e o remove exigiria empurrar todo mundo uma");
        System.out.println("posicao para tras, na mao.");
    }
}
