algoritmo "c1_teste_de_mesa"
var
   preco, percentual: real
   desconto, final: real
inicio
   escreva("Preco: ")
   leia(preco)
   escreva("Desconto (%): ")
   leia(percentual)

   desconto <- preco * (percentual / 100)
   final <- preco - desconto

   escreval("Total: R$ ", final:6:2)
fimalgoritmo
