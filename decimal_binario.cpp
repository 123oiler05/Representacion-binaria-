#include <stdio.h>

void convertirabinario(int n) {
    if (n == 0) {
        printf("0");
        return;
    }

    int binario[32];
    int indice = 0;

    while (n > 0)
        {
        binario[indice] = n % 2;
        n = n / 2;
        indice++;
        }


    for (int j = indice - 1; j >= 0; j--)
        {
        printf("%d", binario[j]);
    }

}

int main() {
    int numero = 8;
    printf("El binario de %d es: ", numero);
    convertirabinario(numero);

    return 0;
}
