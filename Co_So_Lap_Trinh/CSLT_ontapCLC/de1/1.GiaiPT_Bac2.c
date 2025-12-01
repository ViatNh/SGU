#include <stdio.h>
#include <math.h>

//Prototype
void PT_Bac1(float, float);
void PT_Bac2(float, float, float);

int main(void)
{
    printf("Giai phuong trinh bac 2 voi a, b, c la so thuc.");
    float a, b, c;

    printf("\nNhap vao 3 so thuc a, b, c: ");
    scanf("%f%f%f", &a, &b, &c); // tham so

    if (a == 0)
        PT_Bac1(b, c);
    else
        PT_Bac2(a, b, c);

    return 0;
}

void PT_Bac1(float a, float b)
{
    if (a != 0)
        printf("Phuong trinh co nghiem duy nhat x = %.2f", -b/ a);
    else
        if (b != 0)
            printf("Phuong trinh vo nghiem");
        else
            printf("Phuong trinh co vo so nghiem");
}

void PT_Bac2(float a, float b, float c)
{
    float delta = pow(b, 2) - 4 * a * c; // Tinh delta

    if (delta < 0)
        printf("Phuong trinh vo nghiem");
    else if (delta == 0)
        printf("Phuong trinh co nghiem duy nhat x = %.2f", -b/ (2 * a));
    else
    {
        printf("Phuong trinh co 2 nghiem phan biet");
        printf("\nx1 = %.2f", (-b - sqrt(delta))/ (2 * a));
        printf("\nx2 = %.2f", (-b + sqrt(delta))/ (2 * a));
    }
}