# Exemplos de condicionais em Python
# Algoritmos e Programacao - encontro de 03/09
#
# Rode no Google Colab ou em qualquer editor Python.
# Para testar sem digitar nada, os valores ja vem preenchidos.
# Troque por input() quando quiser pedir ao usuario.

print("=== 1. Decisao com dois caminhos ===")

media = 8

if media >= 7:
    print("Aprovado")
else:
    print("Reprovado")


print()
print("=== 2. Decisao com um caminho so ===")

compra = 250
frete = 25

if compra >= 200:
    frete = 0

print("Frete:", frete)


print()
print("=== 3. Varios caminhos ===")

nota = 6

if nota >= 7:
    print("Aprovado")
elif nota >= 5:
    print("Recuperacao")
else:
    print("Reprovado")


print()
print("=== 4. Duas condicoes ao mesmo tempo ===")

media = 9
faltas = 20

if media >= 7 and faltas <= 15:
    print("Aprovado")
else:
    print("Reprovado")


print()
print("=== 5. Exemplo completo: media de duas notas ===")

# versao com teclado:
# nota1 = float(input("Nota 1: "))
# nota2 = float(input("Nota 2: "))
nota1 = 8
nota2 = 6

media = (nota1 + nota2) / 2

if media >= 7:
    print(f"Media {media:.2f} - Aprovado")
else:
    print(f"Media {media:.2f} - Reprovado")


print()
print("=== 6. Exemplo completo: frete por faixa ===")

# compra = float(input("Valor da compra: "))
compra = 150

if compra >= 200:
    frete = 0
elif compra >= 100:
    frete = 15
else:
    frete = 25

total = compra + frete
print(f"Frete: R$ {frete:.2f}")
print(f"Total: R$ {total:.2f}")


print()
print("=== 7. Exemplo completo: emprestimo ===")

# renda = float(input("Renda mensal: "))
# restricao = input("Tem restricao? sim ou nao: ")
renda = 3500
restricao = "nao"

if renda >= 3000 and restricao == "nao":
    print("Emprestimo aprovado")
else:
    print("Emprestimo negado")
