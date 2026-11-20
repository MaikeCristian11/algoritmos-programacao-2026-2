// ============================================================
//  ETAPA 2 - a classe recusando o absurdo
// ============================================================

public class Programa {

    public static void main(String[] args) {

        Colaborador ana = new Colaborador("001", "Ana", "Padrao");

        Colaborador bruno = new Colaborador("002", "Bruno", "Comissionado");
        bruno.setValorVendas(10000);
        bruno.setPercentualComissao(4);

        Colaborador carla = new Colaborador("003", "Carla", "Producao");
        carla.setQuantidadePecas(120);
        carla.setValorPorPeca(3.50);

        System.out.println("=== A FOLHA CONTINUA IGUAL ===");
        ana.exibirDados();
        bruno.exibirDados();
        carla.exibirDados();

        // -----------------------------------------------------
        //  Agora a classe se defende.
        // -----------------------------------------------------
        System.out.println();
        System.out.println("=== TENTANDO O ABSURDO DE NOVO ===");

        ana.setSalarioBase(-500);
        bruno.setPercentualComissao(900);
        carla.setQuantidadePecas(-10);

        System.out.println();
        System.out.println("=== A FOLHA DEPOIS DAS TENTATIVAS ===");
        ana.exibirDados();
        bruno.exibirDados();
        carla.exibirDados();

        System.out.println();
        System.out.println("Nenhum valor passou. E repare que esta linha,");
        System.out.println("que funcionava na etapa 1, agora nem compila:");
        System.out.println("    ana.salarioBase = -500;");

        // Descomente a linha abaixo para ver o erro em sala.
        // ana.salarioBase = -500;
    }
}
