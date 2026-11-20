// ============================================================
//  Classe base (superclasse)
// ============================================================
//
//  Tudo que todo colaborador tem, independente do vinculo:
//  matricula, nome e salario base.
//
//  Os atributos sao PRIVADOS. Ninguem de fora mexe neles
//  direto. Quem quiser ler usa um get, quem quiser escrever
//  usa um set, e o set e quem decide se aceita o valor.

public class Colaborador {

    // O salario base e o mesmo para todos, entao e constante.
    // final significa que ninguem muda depois.
    public static final double SALARIO_BASE = 2000.00;

    private String matricula;
    private String nome;
    private double salarioBase;

    public Colaborador(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = SALARIO_BASE;
    }

    // ---------- metodos de acesso ----------

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            System.out.println("Matricula nao pode ficar em branco. Valor mantido.");
            return;
        }
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Nome nao pode ficar em branco. Valor mantido.");
            return;
        }
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("Salario base nao pode ser negativo. Valor mantido.");
            return;
        }
        this.salarioBase = salarioBase;
    }

    // ---------- comportamento ----------

    // Cada subclasse responde o seu nome. Serve para a linha
    // "Tipo:" da folha sair certa sem nenhum if no Principal.
    public String getTipo() {
        return "Colaborador";
    }

    // Na classe base, o salario final e so o salario base.
    // As subclasses que tiverem algo a somar sobrescrevem.
    public double calcularSalarioFinal() {
        return salarioBase;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Matricula: " + matricula);
        System.out.printf("Salario Base: R$ %,.2f%n", salarioBase);
        System.out.printf("Salario Final: R$ %,.2f%n", calcularSalarioFinal());
    }
}
