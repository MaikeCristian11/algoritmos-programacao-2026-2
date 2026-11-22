// ============================================================
//  Subclasse: colaborador de producao
// ============================================================
//
//  Ganha o salario base mais um valor por peca produzida.
//
//  Regra:  produtividade = quantidadePecas x valorPorPeca
//          salarioFinal  = salarioBase + produtividade

public class ColaboradorProducao extends Colaborador {

    private int quantidadePecas;
    private double valorPorPeca;

    public ColaboradorProducao(String matricula, String nome,
                               int quantidadePecas, double valorPorPeca) {
        super(matricula, nome);
        setQuantidadePecas(quantidadePecas);
        setValorPorPeca(valorPorPeca);
    }

    // ---------- metodos de acesso ----------

    public int getQuantidadePecas() {
        return quantidadePecas;
    }

    public void setQuantidadePecas(int quantidadePecas) {
        if (quantidadePecas < 0) {
            System.out.println("Quantidade de pecas nao pode ser negativa. Gravado zero.");
            this.quantidadePecas = 0;
            return;
        }
        this.quantidadePecas = quantidadePecas;
    }

    public double getValorPorPeca() {
        return valorPorPeca;
    }

    public void setValorPorPeca(double valorPorPeca) {
        if (valorPorPeca < 0) {
            System.out.println("Valor por peca nao pode ser negativo. Gravado zero.");
            this.valorPorPeca = 0;
            return;
        }
        this.valorPorPeca = valorPorPeca;
    }

    // ---------- comportamento ----------

    @Override
    public String getTipo() {
        return "Producao";
    }

    public double calcularProdutividade() {
        return quantidadePecas * valorPorPeca;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + calcularProdutividade();
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Matricula: " + getMatricula());
        System.out.printf("Salario Base: R$ %,.2f%n", getSalarioBase());
        System.out.printf("Produtividade: R$ %,.2f%n", calcularProdutividade());
        System.out.printf("Salario Final: R$ %,.2f%n", calcularSalarioFinal());
    }
}
