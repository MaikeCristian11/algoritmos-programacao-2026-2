// Este algoritmo deveria calcular a media de duas notas.
// Ele roda, nao acusa erro nenhum, e mostra zero.
// Encontre o problema e corrija.
algoritmo "bug1"
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
