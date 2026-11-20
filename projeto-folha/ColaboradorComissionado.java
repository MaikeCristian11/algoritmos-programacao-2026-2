// ============================================================
//  Subclasse: colaborador comissionado
// ============================================================
//
//  Ganha o salario base mais uma comissao sobre o que vendeu.
//
//  Regra:  comissao     = valorVendas x percentualComissao / 100
//          salarioFinal = salarioBase + comissao
//
//  Esta classe esta pela metade de proposito. Os atributos e o
//  construtor estao prontos para voces verem o formato. O resto
//  segue o mesmo padrao de Colaborador.java, que esta completa.

public class ColaboradorComissionado extends Colaborador {

    private double valorVendas;
    private double percentualComissao;

    public ColaboradorComissionado(String matricula, String nome,
                                   double valorVendas, double percentualComissao) {
        // super chama o construtor da classe de cima, que ja
        // grava matricula, nome e salario base.
        super(matricula, nome);

        // Estas duas linhas gravam direto, sem passar por set
        // nenhum, so para a classe compilar hoje. Depois que
        // voces escreverem os sets do TODO 1, troquem por:
        //     setValorVendas(valorVendas);
        //     setPercentualComissao(percentualComissao);
        // Enquanto estiver assim, o construtor aceita valor
        // negativo sem reclamar.
        this.valorVendas = valorVendas;
        this.percentualComissao = percentualComissao;
    }

    // ---------------------------------------------------------
    //  TODO 1: os metodos de acesso dos dois atributos acima.
    //
    //  Quatro metodos: getValorVendas, setValorVendas,
    //  getPercentualComissao e setPercentualComissao.
    //
    //  Nos sets, recuse valor invalido em vez de gravar:
    //    - vendas nao pode ser negativa
    //    - percentual tem que ficar entre 0 e 100
    //
    //  Olhe setSalarioBase em Colaborador.java. E o mesmo molde.
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 2: getTipo, com @Override
    //
    //  Devolve o texto "Comissionado". E o que aparece na linha
    //  "Tipo:" quando a folha for gerada.
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 3: calcularComissao
    //
    //  Devolve valorVendas x percentualComissao / 100.
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 4: calcularSalarioFinal, com @Override
    //
    //  Devolve o salario base mais a comissao.
    //
    //  Esse metodo ja existe la em cima, em Colaborador. Aqui
    //  voces escrevem uma versao propria, que substitui a de
    //  cima quando o objeto for um comissionado. O @Override na
    //  linha anterior faz o compilador avisar se voce errar o
    //  nome do metodo, em vez de deixar passar.
    //
    //  Atencao: salarioBase e private na classe de cima, entao
    //  nem a subclasse le direto. Use getSalarioBase().
    // ---------------------------------------------------------


    // ---------------------------------------------------------
    //  TODO 5: exibirDados, com @Override
    //
    //  A folha deste tipo tem seis linhas, e a da comissao fica
    //  no meio:
    //
    //      Nome: Maria
    //      Tipo: Comissionado
    //      Matricula: 234
    //      Salario Base: R$ 2.000,00
    //      Comissao: R$ 400,00
    //      Salario Final: R$ 2.400,00
    //
    //  Copie o exibirDados de Colaborador.java e encaixe a
    //  linha da comissao entre o salario base e o final. Troque
    //  os atributos pelos gets, porque daqui voce nao enxerga
    //  os privados da classe de cima.
    // ---------------------------------------------------------
}
