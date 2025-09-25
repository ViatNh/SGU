#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chuong trinh tinh tong S(x,n) tu so nguyen duong n va so thuc x\n");
    unsigned int n, temp8, temp9, temp10b;
    float x, S8, S9, S10a, S10b;
    S8 = S9 = S10a = S10b = 0;
    temp8 = temp10b = 0;
    temp9 = 1;

    printf("Vui long nhap vao so nguyen duong n va so thuc x: ");
    scanf("%d %f", &n, &x);

    for (int i = 1; i <= n; i++)
    {
        temp8 += i;
        S8 += pow(x, i) / temp8;

        temp9 *= i;
        S9 += pow(-1, i) * pow(x, i) / temp9;

        S10a += i * (i + 1) * (i + 2);

        temp10b += 2 * i;
        S10b += temp10b;
    }

    printf("8. S(x,n) = %.2f\n", S8);
    printf("9. S(x,n) = %.2f\n", S9);
    printf("10a. S = %.2f\n", S10a);
    printf("10b. S = %.2f", S10b);

    return 0;
}