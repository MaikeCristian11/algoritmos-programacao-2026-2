// Faca o teste de mesa deste algoritmo antes de executar.
// Use a = 1200, b = 1450 e c = 0.80
algoritmo "misterio"
var
   a, b, c: real
   r: real
inicio
   leia(a)
   leia(b)
   leia(c)

   r <- b - a
   r <- r * c

   escreval(r:8:2)
fimalgoritmo
