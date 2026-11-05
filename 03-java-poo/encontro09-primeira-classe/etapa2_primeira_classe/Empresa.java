// Etapa 2: criando objetos a partir da classe.
// Cada new Funcionario() constroi uma casa nova, com o estado dela.

public class Empresa {

    public static void main(String[] args) {

        Funcionario ana = new Funcionario();
        ana.nome = "Ana Souza";
        ana.matricula = "ADM001";
        ana.salarioBase = 3200.00;

        Funcionario bruno = new Funcionario();
        bruno.nome = "Bruno Lima";
        bruno.matricula = "PRD002";
        bruno.salarioBase = 2800.00;

        ana.exibirDados();
        bruno.exibirDados();

        // Mexer numa casa nao mexe na outra.
        ana.salarioBase = 3500.00;

        System.out.println("Depois do aumento da Ana:");
        ana.exibirDados();
        bruno.exibirDados();
    }
}
