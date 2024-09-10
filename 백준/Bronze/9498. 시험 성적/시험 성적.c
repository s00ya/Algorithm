#include <stdio.h>
int main() {
    int jumsu;
    scanf("%d", &jumsu);

    if (jumsu >= 90)
        printf("A");
    else if(jumsu >= 80) 
        printf("B");
    else if(jumsu >= 70) 
        printf("C");
    else if(jumsu >= 60)
        printf("D");
    else
        printf("F");
   
    return 0;
}