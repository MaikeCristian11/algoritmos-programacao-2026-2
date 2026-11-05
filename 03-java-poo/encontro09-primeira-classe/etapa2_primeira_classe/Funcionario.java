// Etapa 2: a primeira classe.
// A classe e a planta da casa. Ela descreve o que todo funcionario tem e o que ele faz.
// Ninguem recebe salario da planta: quem recebe sao as casas construidas a partir dela.

public class Funcionario {

    // atributos: o que o funcionario TEM
    String nome;
    String matricula;
    double salarioBase;

    // metodos: o que o funcionario FAZ

    double calcularSalario() {
        return salarioBase;
    }

    void exibirDados() {
        System.out.println(nome + " (" + matricula + ")  R$ " + calcularSalario());
    }
}
