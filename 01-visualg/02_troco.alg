algoritmo "troco"
var
   compra, pago, troco: real
inicio
   escreva("Valor da compra: ")
   leia(compra)
   escreva("Valor pago: ")
   leia(pago)

   troco <- pago - compra

   escreval("Troco: R$ ", troco:6:2)
fimalgoritmo
