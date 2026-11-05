// Etapa 3: a folha inteira.
// Um vetor de objetos, percorrido com o mesmo for do semestre,
// somando com o mesmo acumulador de sempre.

public class Empresa {

    public static void main(String[] args) {

        Funcionario[] folha = new Funcionario[3];

        folha[0] = new Funcionario("Ana Souza", "ADM001", "Administrativo", 3200.00);
        folha[1] = new Funcionario("Bruno Lima", "PRD002", "Producao", 2800.00);
        folha[2] = new Funcionario("Carla Dias", "VND003", "Vendas", 4100.00);

        double total = 0;

        for (int i = 0; i < folha.length; i++) {
            folha[i].exibirDados();
            total = total + folha[i].calcularSalario();
        }

        System.out.println("Total: R$ " + total);
    }
}
