// ============================================================
//  ETAPA 1 - os dois problemas, na tela
// ============================================================

public class Programa {

    public static void main(String[] args) {

        Colaborador ana = new Colaborador("001", "Ana", "Padrao");

        Colaborador bruno = new Colaborador("002", "Bruno", "Comissionado");
        bruno.valorVendas = 10000;
        bruno.percentualComissao = 4;

        Colaborador carla = new Colaborador("003", "Carla", "Producao");
        carla.quantidadePecas = 120;
        carla.valorPorPeca = 3.50;

        System.out.println("=== A FOLHA FUNCIONA ===");
        ana.exibirDados();
        bruno.exibirDados();
        carla.exibirDados();

        // -----------------------------------------------------
        //  PROBLEMA 1: ninguem protege os dados do objeto.
        // -----------------------------------------------------
        System.out.println();
        System.out.println("=== PROBLEMA 1 ===");

        ana.salarioBase = -500;
        System.out.println("Escrevi -500 no salario da Ana. Java aceitou.");
        ana.exibirDados();

        bruno.percentualComissao = 900;
        System.out.println("Escrevi 900% de comissao no Bruno. Java aceitou.");
        bruno.exibirDados();

        carla.tipo = "Gerente";
        System.out.println("Escrevi um tipo que nao existe na Carla.");
        carla.exibirDados();

        // -----------------------------------------------------
        //  PROBLEMA 2: cada tipo novo mexe no mesmo metodo.
        // -----------------------------------------------------
        System.out.println();
        System.out.println("=== PROBLEMA 2 ===");
        System.out.println("A Carla virou Gerente e o salario nao mudou,");
        System.out.println("porque o if de calcularSalarioFinal nao conhece");
        System.out.println("esse tipo e caiu no return do fim.");
        System.out.println();
        System.out.println("Para o Gerente existir de verdade eu preciso:");
        System.out.println("  - um if novo em calcularSalarioFinal");
        System.out.println("  - dois atributos novos na classe");
        System.out.println("  - e lembrar de nao esquecer nenhum dos dois");
    }
}
