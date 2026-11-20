// ============================================================
//  ETAPA 2 - a classe que se defende
// ============================================================
//
//  O que mudou da etapa 1:
//
//    1. Os atributos ganharam a palavra private.
//    2. Apareceram os metodos get, para ler.
//    3. Apareceram os metodos set, para escrever, e e dentro
//       deles que a classe decide se aceita o valor.
//
//  O if de calcularSalarioFinal continua aqui, feio como
//  estava. Ele e o assunto da segunda metade da aula.

public class Colaborador {

    // O salario base e igual para todos, entao e constante.
    // final quer dizer que ninguem muda depois.
    public static final double SALARIO_BASE = 2000.00;

    private String matricula;
    private String nome;
    private String tipo;
    private double salarioBase;

    private double valorVendas;
    private double percentualComissao;
    private int quantidadePecas;
    private double valorPorPeca;

    public Colaborador(String matricula, String nome, String tipo) {
        this.matricula = matricula;
        this.nome = nome;
        this.tipo = tipo;
        this.salarioBase = SALARIO_BASE;
    }

    // ---------- ler: get ----------

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    // ---------- escrever: set ----------
    //
    //  Cada set e um porteiro. Ele olha o valor antes de
    //  deixar entrar, e recusa o que nao faz sentido.

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("Salario base nao pode ser negativo. Valor mantido.");
            return;
        }
        this.salarioBase = salarioBase;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0) {
            System.out.println("Valor de vendas nao pode ser negativo. Valor mantido.");
            return;
        }
        this.valorVendas = valorVendas;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao < 0 || percentualComissao > 100) {
            System.out.println("Percentual deve ficar entre 0 e 100. Valor mantido.");
            return;
        }
        this.percentualComissao = percentualComissao;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        if (quantidadePecas < 0) {
            System.out.println("Quantidade de pecas nao pode ser negativa. Valor mantido.");
            return;
        }
        this.quantidadePecas = quantidadePecas;
    }

    public void setValorPorPeca(double valorPorPeca) {
        if (valorPorPeca < 0) {
            System.out.println("Valor por peca nao pode ser negativo. Valor mantido.");
            return;
        }
        this.valorPorPeca = valorPorPeca;
    }

    // ---------- comportamento ----------

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
