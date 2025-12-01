#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chuong trinh tinh tong theo cong thuc dua theo x va n\n");
    int n;
    float x, S1, S2, S3, temp1, temp2;
    S1 = S2 = S3 = 0;
    temp1 = 0;
    temp2 = 1;

    printf("Nhap vao n va x: ");
    scanf("%d", &n);
    scanf("%f", &x);

    for (float i = 1, j = 0; i <= n; i++, j++)
    {
        temp1 += 1 / i;
        S1 += pow(-1, i - 1) * pow(x, i) / temp1;

        temp2 *= i;
        S2 += pow(-1, i) * pow(x, i) / temp2;

        S3 += pow(-1, j) * pow(x, j) / (j + (j + 1));
    }

    printf("a. S(n, x) = %.2f\n", S1);
    printf("b. S(x, n) = %.2f\n", S2);
    printf("c. S(x, n) = %.2f", S3);

    return 0;
}