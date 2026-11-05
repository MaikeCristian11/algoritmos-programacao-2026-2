// ============================================================
//  Sistema de folha de pagamento
//  Esqueleto da aula de 05/11. Complete os TODO.
// ============================================================
//
//  Esta classe ja esta quase pronta: e a mesma do encontro 9,
//  com dois campos a mais que os setores precisam.
//
//  O unico TODO aqui e o calculo do salario.

public class Funcionario {

    String nome;
    String matricula;
    String setor;          // "Administrativo", "Producao" ou "Vendas"
    double salarioBase;

    double horasExtras;    // so o setor de Producao usa
    double vendasDoMes;    // so o setor de Vendas usa

    Funcionario(String nome, String matricula, String setor, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
        this.salarioBase = salarioBase;
        this.horasExtras = 0;
        this.vendasDoMes = 0;
    }

    // ---------------------------------------------------------
    // TODO 1: o calculo do salario, por setor.
    //
    //   Administrativo .... salario base mais 10% de gratificacao
    //   Producao .......... salario base mais R$ 25,00 por hora extra
    //   Vendas ............ salario base mais 5% sobre as vendas do mes
    //
    //   Dica: em Java, texto se compara com equals, e nunca com ==
    //         if (setor.equals("Administrativo")) { ... }
    // ---------------------------------------------------------
    double calcularSalario() {
        return salarioBase;   // troque esta linha
    }

    void exibirDados() {
        System.out.printf("%-14s %-8s %-15s R$ %10.2f%n",
                nome, matricula, setor, calcularSalario());
    }
}
