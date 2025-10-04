#include <stdio.h>
#include <math.h>

int main(void)
{
    int chose, n;
    float x;
    do
    {
        printf("1. Tinh giai thua n\n");
        printf("2. Tinh tong n*(n+1)*(2n)\n");
        printf("3. Tinh tong S(x, n)\n");
        printf("Vui long chon: ");
        scanf("%d", &chose);

        if (chose >= 1 && chose <=2)
        {
            printf("Nhap vao so nguyen n: ");
            scanf("%d", &n);
        }
        else if (chose == 3)
        {
            printf("Nhap vao so nguyen n (n>=1) va so thuc x: ");
            scanf("%d%f", &n, &x);
        }

        switch (chose)
        {
            case 1:
                int temp = 1;
                int S1 = 0, S2 = 0;
                for (int i = 1; i <= n; i++)
                {
                    temp *= i;
                    S1 += temp;
                    S2 += 
                }
        }


    } while (chose > 0);

    return 0;
}