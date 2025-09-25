#include <stdio.h>

int main(void)
{
    printf("Chuong trinh tinh giai thua tu N\n");
    unsigned int N, giai_thua = 1;

    printf("Nhap vao N: ");
    scanf("%d", &N);

    for (int i = 1; i <= N; i++)
    {
        giai_thua *= i;
    }

    printf("%d! = %d", N, giai_thua);

    return 0;
}