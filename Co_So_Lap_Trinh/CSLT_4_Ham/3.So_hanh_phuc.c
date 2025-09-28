#include <stdio.h>
#include <math.h>

int is_SHP(int N)
{
    N = pow(N, 2);
    while(N > 9)
    {
        int temp = N;
        N = 0;
        for (; temp > 0; temp /= 10)
        {
            N += pow(temp % 10, 2);
        }
    }
    return N == 1 ? 1 : 0;
}

int main(void)
{
    printf("Chuong trinh kiem tra so hanh phuc cua so nguyen duong N\n");
    int N;

    do
    {
        printf("Nhap vao so nguyen duong N: ");
        scanf("%d", &N);
    } while (N < 1);

    if (is_SHP(N) == 1)
    {
        printf("%d la so hanh phuc", N);
    }
    else
    {
        printf("%d khong phai la so hanh phuc", N);
    }

    return 0;
}