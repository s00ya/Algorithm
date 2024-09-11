#include <stdio.h>
int main() {
    int x, y, z;
    int point;
    scanf("%d %d %d", &x, &y, &z);

    if (x == y && y == z)
    {
        point = 10000 + (x * 1000);

    } else if(x == y || y == z ) {
        point = 1000 + (y * 100);
    }
    else if(z == x) {
            point = 1000 + (z * 100);
        }
     else {
        if(x > y && x > z) {
            point = x * 100;
        } else if(y > x && y > z) {
            point = y * 100;
        } else {point = z * 100;}
    }

    printf("%d", point);
    return 0;
}