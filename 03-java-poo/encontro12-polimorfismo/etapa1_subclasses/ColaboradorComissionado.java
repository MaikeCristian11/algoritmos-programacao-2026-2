// ============================================================
//  Subclasse: colaborador comissionado
// ============================================================
//
//  Ganha o salario base mais uma comissao sobre o que vendeu.
//
//  Regra:  comissao     = valorVendas x percentualComissao / 100
//          salarioFinal = salarioBase + comissao

public class ColaboradorComissionado extends Colaborador {

    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(String matricula, String nome,
                                   double valorVendas, double percentualComissao) {
        super(matricula, nome);
        setValorVendas(valorVendas);
        setPercentualComissao(percentualComissao);
    }

    // ---------- metodos de acesso ----------

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0) {
            System.out.println("Valor de vendas nao pode ser negativo. Gravado zero.");
            this.valorVendas = 0;
            return;
        }
        this.valorVendas = valorVendas;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        if (percentualComissao < 0 || percentualComissao > 100) {
            System.out.println("Percentual deve ficar entre 0 e 100. Gravado zero.");
            this.percentualComissao = 0;
            return;
        }
        this.percentualComissao = percentualComissao;
    }

    // ---------- comportamento ----------

    @Override
    public String getTipo() {
        return "Comissionado";
    }

    public double calcularComissao() {
        return valorVendas * percentualComissao / 100;
    }

    // Sobrescreve o metodo da classe de cima.
    // getSalarioBase() em vez de salarioBase: o atributo e
    // privado na classe base, entao nem a subclasse le direto.
    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularComissao();
    }

    // A folha deste tipo tem uma linha a mais: a comissao, que
    // entra entre o salario base e o salario final. Por isso a
    // classe escreve o bloco inteiro em vez de chamar super.
    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Matricula: " + getMatricula());
        System.out.printf("Salario Base: R$ %,.2f%n", getSalarioBase());
        System.out.printf("Comissao: R$ %,.2f%n", calcularComissao());
        System.out.printf("Salario Final: R$ %,.2f%n", calcularSalarioFinal());
    }
}
