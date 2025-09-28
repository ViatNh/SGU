#include <stdio.h>
#include <math.h>

int is_SNT(int M)
{
    for (int i = 2; i <= sqrt(M); i++)
    {
        if (M % i == 0)
        {
            return 0;
        }
    }
    return 1;
}

int main(void)
{
    printf("Chuong trinh in ra tat ca so nguyen to nho hon so nguyen duong M.\n");
    int M;

    do
    {
        printf("Nhap so nguyen duong M > 2: ");
        scanf("%d", &M);
    } while (M <= 2);

    printf("Tat ca so nguyen to nho hon %d:", M);
    for (int i = 2; i < M; i++)
    {
        if (is_SNT(i) == 1)
        {
            printf(" %d", i);
        }
    }

    return 0;
}