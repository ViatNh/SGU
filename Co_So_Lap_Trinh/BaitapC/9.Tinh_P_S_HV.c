#include <stdio.h>

int main(void)
{
    printf("Chương trình tính chu vi, diện tích hình vuông.\n");
    float a;

    printf("Nhập cạnh: ");
    scanf("%f", &a);

    printf("Chu vi hình vuông: %.2f", a*4);
    printf("Diện tích hình vuông: %.2f", a*a);

    return 0;
}