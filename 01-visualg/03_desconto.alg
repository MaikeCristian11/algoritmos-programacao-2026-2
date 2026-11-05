algoritmo "desconto"
var
   preco, percentual: real
   desconto, final: real
inicio
   escreva("Preco do produto: ")
   leia(preco)
   escreva("Desconto (%): ")
   leia(percentual)

   desconto <- preco * (percentual / 100)
   final <- preco - desconto

   escreval("Desconto: R$ ", desconto:6:2)
   escreval("Total:    R$ ", final:6:2)
fimalgoritmo
