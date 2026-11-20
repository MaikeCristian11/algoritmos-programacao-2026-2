// ============================================================
//  ETAPA 1 - o ponto de partida
// ============================================================
//
//  E o mesmo codigo de quinta passada, com os nomes que a A3
//  pede: Colaborador em vez de Funcionario, tipo em vez de
//  setor.
//
//  Funciona. Imprime a folha certa. E tem dois problemas que
//  a gente vai consertar hoje.

public class Colaborador {

    String matricula;
    String nome;
    String tipo;          // "Padrao", "Comissionado" ou "Producao"
    double salarioBase;

    double valorVendas;
    double percentualComissao;
    int quantidadePecas;
    double valorPorPeca;

    Colaborador(String matricula, String nome, String tipo) {
        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.salarioBase = 2000.00;
    }

    // Um metodo que sabe calcular os tres tipos. Repare no
    // tamanho dele, e no que acontece quando chega um quarto.
    double calcularSalarioFinal() {
        if (tipo.equals("Padrao")) {
            return salarioBase;

        } else if (tipo.equals("Comissionado")) {
            return salarioBase + valorVendas * percentualComissao / 100;

        } else if (tipo.equals("Producao")) {
            return salarioBase + quantidadePecas * valorPorPeca;
        }

        return salarioBase;
    }

    void exibirDados() {
        System.out.printf("%-8s %-14s %-14s R$ %9.2f%n",
                matricula, nome, tipo, calcularSalarioFinal());
    }
}
