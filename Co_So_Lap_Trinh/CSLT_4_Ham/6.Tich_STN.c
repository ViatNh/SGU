#include <stdio.h>
#include <math.h>

int is_SNT(int n)
{
    if (n < 2)
        return 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (i % n == 0)
            return 0;
    }
    return 1;
}

void tich(int n)
{
    if (n != 1)
    {
        for (int i = 2; i <= n; i++)
        {
            if ((is_SNT(i) == 1) && (n % i == 0))
            {
                printf("%d", i);
                tich(n / i);
                break;
            }
        }
    }
}

int main(void)
{
    printf("Chuong trinh phan tich so tu nhien thanh tich cac so nguyen to\n");
    int n;

    printf("Nhap vao so tu nhien n: ");
    scanf("%d", &n);

    tich(n);

    return 0;
}