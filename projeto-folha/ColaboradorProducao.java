// ============================================================
//  Subclasse: colaborador de producao
// ============================================================
//
//  Ganha o salario base mais um valor por peca produzida.
//
//  Regra:  produtividade = quantidadePecas x valorPorPeca
//          salarioFinal  = salarioBase + produtividade
//
//  Esta classe esta quase vazia de proposito. Ela e gemea da
//  ColaboradorComissionado: o que muda sao os nomes dos
//  atributos e a conta. Faca a comissionada primeiro e depois
//  repita o caminho aqui.

public class ColaboradorProducao extends Colaborador {

    // ---------------------------------------------------------
    //  TODO 6: declarar os dois atributos, privados.
    //
    //    quantidadePecas .... numero inteiro de pecas
    //    valorPorPeca ....... quanto a empresa paga por peca
    // ---------------------------------------------------------


    public ColaboradorProducao(String matricula, String nome,
                               int quantidadePecas, double valorPorPeca) {
        super(matricula, nome);

        // -----------------------------------------------------
        //  TODO 7: gravar os dois valores recebidos nos
        //  atributos do TODO 6. Comece gravando direto, com
        //  this.quantidadePecas = quantidadePecas, e depois
        //  troque pelos sets quando eles existirem.
        // -----------------------------------------------------
    }

    // ---------------------------------------------------------
    //  TODO 8: os metodos de acesso dos dois atributos.
    //
    //  Nos sets, recuse negativo.
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 9: getTipo, com @Override
    //
    //  Devolve o texto "Producao".
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 10: calcularProdutividade
    //
    //  Devolve quantidadePecas x valorPorPeca.
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 11: calcularSalarioFinal, com @Override
    //
    //  Devolve getSalarioBase() mais a produtividade.
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 12: exibirDados, com @Override
    //
    //  Seis linhas, com a produtividade entre o salario base e
    //  o salario final:
    //
    //      Nome: Carla Dias
    //      Tipo: Producao
    //      Matricula: 555
    //      Salario Base: R$ 2.000,00
    //      Produtividade: R$ 420,00
    //      Salario Final: R$ 2.420,00
    // ---------------------------------------------------------
}
