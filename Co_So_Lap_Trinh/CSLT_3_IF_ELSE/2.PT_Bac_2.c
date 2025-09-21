#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình giải Phương trình bậc 2 (x^2 + bx + c = 0)\n");
    float a, b, c, delta, x1, x2;

    printf("Nhập a, b, c: ");
    scanf("%f%f%f", &a, &b, &c);

    delta = pow(b,2) - 4*a*c;

    if (delta<0) {printf("Phương trình vô nghiệm");}
    else if (delta>0)
    {
        x1 = (-b - sqrt(delta))/ 2*a;
        x2 = (-b + sqrt(delta))/ 2*a;
        printf("Phương trình có 2 nghiệm phân biệt:\n x1 = %f\n x2 = %f", x1, x2);
    }
    else {printf("Phương trình có 1 nghiệm duy nhất: x = %f", -b/(2*a));}

    return 0;
}