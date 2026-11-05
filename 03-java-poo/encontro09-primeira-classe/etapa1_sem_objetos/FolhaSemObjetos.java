// Etapa 1: a folha de pagamento feita do jeito que a gente sabe hoje,
// com um vetor para cada informacao. Funciona, e e justamente ai que mora o problema.

public class FolhaSemObjetos {

    public static void main(String[] args) {

        String[] nomes = {"Ana Souza", "Bruno Lima", "Carla Dias"};
        String[] matriculas = {"ADM001", "PRD002", "VND003"};
        double[] salarios = {3200.00, 2800.00, 4100.00};

        double total = 0;

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " (" + matriculas[i] + ")  R$ " + salarios[i]);
            total = total + salarios[i];
        }

        System.out.println("Total da folha: R$ " + total);
    }
}

// Tres vetores para tres pessoas. Agora pense:
//   1. Para guardar o setor de cada um, quantos vetores passam a ser?
//   2. Se alguem ordenar so o vetor de salarios, o que acontece com os nomes?
//   3. Se a empresa contrata o quarto funcionario, quantos lugares voce mexe?
