def decimal_a_binario(n):
    if n == 0:
        return "0"

    binario = ""
    while n > 0:
        binario = str(n % 2) + binario
        n = n // 2

    return binario


numero = 8
print(f"El binario de {numero} es {decimal_a_binario(numero)}")

#corroboramos con la funcion nativa de python
print(f"comprobacion: El binario de {numero} es {bin(numero)[2:]}")