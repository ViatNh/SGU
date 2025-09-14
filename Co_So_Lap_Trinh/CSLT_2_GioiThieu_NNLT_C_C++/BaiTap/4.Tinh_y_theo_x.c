#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình nhập vào số thực x, tính và in ra các giá trị y1\n");
    float x, y;

    printf("Nhập vào giá trị x: ");
    scanf("%f", &x);

    y = 4 * (pow(x,2) + 10*x*sqrt(x) + 3*x + 1);

    printf("y1 = %.2f", y);

    return 0;
}