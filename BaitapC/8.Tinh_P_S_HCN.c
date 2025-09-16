#include <stdio.h>

int main(void)
{
    printf("Chương trình tính chu vi, diện tích hình chữ nhật.\n");
    float a, b;

    printf("Nhập chiều dài và chiều rộng: ");
    scanf("%f%f", &a, &b);

    printf("Chu vi hình chữ nhật: %.2f", (a+b)*2);
    printf("Diện tích hình chữ nhật: %.2f", a*b);

    return 0;
}