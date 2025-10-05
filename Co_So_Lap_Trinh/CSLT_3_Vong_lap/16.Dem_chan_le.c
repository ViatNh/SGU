#include <stdio.h>

void Chan(int n)
{
    if (n != 0)
    {
        int temp = n;
        temp %= 10;
        Chan(n / 10);
        if (temp % 2 == 0)
            printf(" %d", temp);
    }
}

int Dem_Chan(int n)
{
    int dem_chan = 0;
    for (; n > 0; n /= 10)
    {
        int temp = n % 10;
        if (temp % 2 == 0)
        {
            dem_chan += 1;
        }
    }
    return dem_chan;
}

void Le(int n)
{
    if (n != 0)
    {
        int temp = n;
        temp %= 10;
        Le(n / 10);
        if (temp % 2 != 0)
            printf(" %d", temp);
    }
}

int Dem_Le(int n)
{
    int dem_le = 0;
    for (; n > 0; n /= 10)
    {
        int temp = n % 10;
        if (temp % 2 == 0)
        {
            dem_le += 1;
        }
    }
    return dem_le;
}

int main(void)
{
    printf("Chuong trinh dem so luong chu so le/ chan cua so nguyen duong n\n");
    int n;

    printf("Nhap vao so nguyen duong n: ");
    scanf("%d", &n);

    printf("%d co %d chu so chan la", n, Dem_Chan(n));
    Chan(n);
    printf("\n%d co %d chu so le la", n, Dem_Le(n));
    Le(n);

    return 0;
}