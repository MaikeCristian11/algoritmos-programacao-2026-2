// ============================================================
//  Subclasse: colaborador padrao
// ============================================================
//
//  Repare no tamanho desta classe. Ela nao tem atributo novo
//  nem conta nova, porque o salario final dela e exatamente o
//  salario base, que a classe Colaborador ja sabe calcular.
//
//  O extends e a classe inteira. Tudo que Colaborador tem,
//  ColaboradorPadrao ja tem, sem precisar copiar uma linha.

public class ColaboradorPadrao extends Colaborador {

    public ColaboradorPadrao(String matricula, String nome) {
        // super chama o construtor da classe de cima.
        super(matricula, nome);
    }

    // A unica coisa que muda e o nome que aparece na folha.
    @Override
    public String getTipo() {
        return "Padrao";
    }

    // calcularSalarioFinal e exibirDados vieram prontos de
    // Colaborador e ja fazem o certo. Nada a sobrescrever.
}
