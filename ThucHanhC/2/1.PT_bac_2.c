#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chuong trinh giai phuong trinh bac 2 ax^2 + bx + c = 0\n");
    float a, b, c, x1, x2, delta=0;

    printf("Nhap vao cac he so a, b, c: ");
    scanf("%f%f%f", &a, &b, &c);

    delta = (b * b) - (4 * a * c);
    
    if (delta < 0)
    {
        printf("Phuong trinh vo nghiem");
    }
    else if (delta == 0)
    {
        printf("Phuong trinh co 1 nghiem duy nhat: x = %.2f", -b / (2 * a));
    }
    else
    {
        x1 = (-b + sqrt(delta)) / (2 * a);
        x2 = (-b - sqrt(delta)) / (2 * a);

        printf("Phuong trinh co 2 nghiem phan biet:\nx1 = %.2f\nx2 = %.2f", x1, x2);
    }

    return 0;
}