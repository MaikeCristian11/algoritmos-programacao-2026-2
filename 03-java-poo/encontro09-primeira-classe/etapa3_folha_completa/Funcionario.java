// Etapa 3: a classe com construtor.
// O construtor obriga a ficha a nascer completa: nao da para esquecer um campo.

public class Funcionario {

    // atributos: o que o funcionario TEM
    String nome;
    String matricula;
    String setor;
    double salarioBase;

    // construtor: tem o mesmo nome da classe e nao tem tipo de retorno.
    // Roda uma vez so, no momento do new.
    Funcionario(String nome, String matricula, String setor, double salario) {
        this.nome = nome;             // this.nome e o campo DESTA ficha
        this.matricula = matricula;   // nome, sem this, e o valor que chegou de fora
        this.setor = setor;
        this.salarioBase = salario;
    }

    // metodos: o que o funcionario FAZ

    double calcularSalario() {
        return salarioBase;
    }

    void exibirDados() {
        System.out.println(nome + " (" + matricula + ")  R$ " + calcularSalario());
    }

    // Exercicio C da aula: complete este metodo.
    // Ele nao devolve nada, entao comeca com void, e mexe no proprio salarioBase.
    //
    // void aumentarSalario(double percentual) {
    //     ...
    // }
}
