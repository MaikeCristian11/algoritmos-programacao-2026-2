// ============================================================
//  ETAPA 3 - o estado final da aula de hoje
// ============================================================
//
//  Duas classes:
//
//    Colaborador ......... o que todo colaborador tem
//    ColaboradorPadrao ... oito linhas, e ja funciona
//
//  O if por tipo desapareceu. Ninguem precisou apagar ele:
//  ele simplesmente nao tem mais o que fazer.

import java.util.Locale;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.forLanguageTag("pt-BR"));

        // A classe de cima, usada direto.
        Colaborador generico = new Colaborador("000", "Colaborador generico");

        // A subclasse, que nao escreveu nem um calculo.
        ColaboradorPadrao ana = new ColaboradorPadrao("001", "Ana Souza");

        System.out.println("=== A CLASSE DE CIMA ===");
        generico.exibirDados();

        System.out.println();
        System.out.println("=== A SUBCLASSE ===");
        ana.exibirDados();

        System.out.println();
        System.out.println("Os dois numeros sao iguais, e a ColaboradorPadrao");
        System.out.println("nao tem uma linha de calculo. Ela herdou.");
        System.out.println("A unica coisa que ela escreveu foi o getTipo,");
        System.out.println("e e por isso que a linha Tipo saiu diferente.");

        // -----------------------------------------------------
        //  A porta que o private fechou
        // -----------------------------------------------------
        System.out.println();
        System.out.println("=== O QUE AINDA NAO DA PARA FAZER ===");
        System.out.println("Nem aqui, nem dentro da subclasse, da para");
        System.out.println("escrever ana.salarioBase. O atributo e private");
        System.out.println("na classe de cima, e private vale para todo");
        System.out.println("mundo de fora, inclusive para a filha.");
        System.out.printf("Para ler, usamos o get: R$ %,.2f%n", ana.getSalarioBase());

        // Descomente para ver o erro de compilacao em sala.
        // System.out.println(ana.salarioBase);

        System.out.println();
        System.out.println("Na proxima aula: ColaboradorComissionado e");
        System.out.println("ColaboradorProducao, as duas que tem conta");
        System.out.println("propria e precisam sobrescrever o calculo.");
    }
}
