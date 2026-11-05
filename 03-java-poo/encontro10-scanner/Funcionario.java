// Mesma classe do encontro 9, sem nenhuma mudanca.
// Ela nao precisa saber de onde os dados vieram: do teclado ou escritos no codigo.

public class Funcionario {

    String nome;
    String matricula;
    String setor;
    double salarioBase;

    Funcionario(String nome, String matricula, String setor, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
        this.salarioBase = salario;
    }

    double calcularSalario() {
        return salarioBase;
    }

    void exibirDados() {
        System.out.println(nome + " (" + matricula + ")  " + setor + "  R$ " + calcularSalario());
    }
}
