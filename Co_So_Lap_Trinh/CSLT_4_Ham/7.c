#include <stdio.h>
#include <math.h>

int is_SNT(int n)
{
    if (n < 2) return 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0) return 0;
    }
    return 1;
}

int dao(int n)
{
    int d = 0;
    for (; n > 0; n /= 10)
    {
        int temp = n % 10;
        d = d * 10 + temp;
    }
    return d;
}

int is_SDX(int n)
{
    if (n == dao(n)) return 1;
    else return 0;
}

int main(void)
{
    printf("Chuong trinh liet ke tat ca cac so tu nhien k thoa man dieu kien\n");

    printf("Tat ca cac so tu nhien co 5 chu so vua la so nguyen to vua la so doi xung:");

    for (int k = 10001; k < 100000; k += 2)
    {
        if (is_SNT(k) == 1 && is_SDX(k) == 1) printf("\n%d", k);
    }

    return 0;
}