// ============================================================
//  ETAPA 1 - as quatro classes, uma de cada
// ============================================================
//
//  Aqui ainda nao tem ArrayList. Cada colaborador e uma
//  variavel separada, e cada exibirDados e uma chamada
//  escrita a mao.
//
//  Repare que as tres saidas sao diferentes, e nenhuma linha
//  deste arquivo decide isso. Quem decide e a classe de cada
//  objeto.

import java.util.Locale;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        ColaboradorPadrao ana =
                new ColaboradorPadrao("001", "Ana Souza");

        ColaboradorComissionado maria =
                new ColaboradorComissionado("234", "Maria", 10000, 4);

        ColaboradorProducao carla =
                new ColaboradorProducao("555", "Carla Dias", 120, 3.50);

        System.out.println("=== UM DE CADA TIPO ===");

        System.out.println();
        ana.exibirDados();

        System.out.println();
        maria.exibirDados();

        System.out.println();
        carla.exibirDados();

        // -----------------------------------------------------
        //  A conta, para conferir na mao
        // -----------------------------------------------------
        System.out.println();
        System.out.println("=== CONFERINDO ===");
        System.out.printf("Ana:   2000 + nada                = R$ %,.2f%n",
                ana.calcularSalarioFinal());
        System.out.printf("Maria: 2000 + 10000 x 4 / 100     = R$ %,.2f%n",
                maria.calcularSalarioFinal());
        System.out.printf("Carla: 2000 + 120 x 3,50          = R$ %,.2f%n",
                carla.calcularSalarioFinal());
    }
}
