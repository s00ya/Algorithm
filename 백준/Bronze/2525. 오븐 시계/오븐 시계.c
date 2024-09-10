#include <stdio.h>
int main() {
    int A, B, C;
    scanf("%d %d\n", &A, &B);
    scanf("%d", &C);

    if ((B + C) >= 60) {
        A = A + ((B+C) / 60);
        B = (B+C) % 60;
        if (A >= 24)
        {
            A = A % 24;
        } 
    }
    else {
        B = B + C;
    }
    printf("%d %d", A, B);

    return 0;
    
}