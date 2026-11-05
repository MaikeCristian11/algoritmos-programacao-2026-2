// Calcula o valor da conta de luz do mes.
// Este e o algoritmo que voce vai modificar no exercicio A.
algoritmo "conta_de_luz"
var
   leituraAnterior, leituraAtual: real
   precoKwh, consumo, valor: real
inicio
   escreva("Leitura anterior: ")
   leia(leituraAnterior)
   escreva("Leitura atual: ")
   leia(leituraAtual)
   escreva("Preco do kWh: ")
   leia(precoKwh)

   consumo <- leituraAtual - leituraAnterior
   valor <- consumo * precoKwh

   escreval("Consumo: ", consumo:6:2, " kWh")
   escreval("Valor: R$ ", valor:8:2)
fimalgoritmo
