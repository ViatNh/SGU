#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình nhập vào bán kính hình cầu, tính và in ra diện tích, thể tích của hình cầu đó.\n");
    const float PI = 3.14;
    float R, S, V;

    printf("Nhập bán kính hình cầu: ");
    scanf("%f", &R);

    S = 4*PI*pow(R,2);
    V = 4*PI*pow(R,3)/3;
    printf("Diện tích hình cầu: %.2f\n", S);
    printf("Thể tích hình cầu: %.2f", V);

    return 0;
}