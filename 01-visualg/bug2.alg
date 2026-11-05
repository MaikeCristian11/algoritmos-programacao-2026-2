// Este algoritmo deveria calcular o perimetro de um terreno retangular.
// Com base 10 e altura 4, o perimetro deveria ser 28.
// Rode, veja o que aparece, e corrija.
algoritmo "bug2"
var
   base, altura, perimetro: real
inicio
   escreva("Base (m): ")
   leia(base)
   escreva("Altura (m): ")
   leia(altura)

   perimetro <- 2 * base + altura

   escreval("Perimetro: ", perimetro:6:2, " m")
fimalgoritmo
