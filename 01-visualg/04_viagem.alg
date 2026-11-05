algoritmo "viagem"
var
   distancia, consumo: real
   precoLitro, litros, gasto: real
inicio
   escreva("Distancia (km): ")
   leia(distancia)
   escreva("Consumo do carro (km/l): ")
   leia(consumo)
   escreva("Preco do litro: ")
   leia(precoLitro)

   litros <- distancia / consumo
   gasto <- litros * precoLitro

   escreval("Litros gastos: ", litros:6:2)
   escreval("Gasto total: R$ ", gasto:6:2)
fimalgoritmo
