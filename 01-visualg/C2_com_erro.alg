// Exercicio C2 - algoritmo com erro de ordem, proposital.
// Roda sem acusar erro e entrega um resultado errado.
algoritmo "c2_com_erro"
var
   nota1, nota2, media: real
inicio
   media <- (nota1 + nota2) / 2

   escreva("Nota 1: ")
   leia(nota1)
   escreva("Nota 2: ")
   leia(nota2)

   escreval("Media: ", media:5:2)
fimalgoritmo
