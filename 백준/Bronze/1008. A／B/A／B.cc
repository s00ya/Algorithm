#include <stdio.h>

int main() {
    int A, B;
    scanf("%d", &A);
    scanf("%d", &B);

    printf("%.9lf", (double)A / B);
    return 0;
}