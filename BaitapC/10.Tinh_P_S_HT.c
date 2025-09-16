#include <stdio.h>

int main(void)
{
    printf("Chương trình tính chu vi, diện tích hình tròn.\n");
    const float PI = 3.14;
    float r;

    printf("Nhập bán kính r: ");
    scanf("%f", &r);

    printf("Chu vi hình tròn: %.2f", 2*PI*r);
    printf("Diện tích hình tròn: %.2f", PI*r*r);

    return 0;
}