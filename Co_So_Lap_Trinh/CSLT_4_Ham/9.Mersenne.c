#include <stdio.h>
#include <math.h>

int is_Mersenne(int n)
{
    for (int i = 1; i <= n; i++)
    {
        if (pow(2, i) == n + 1) return 1;
    }
    return 0;
}

int main(void)
{
    printf("Chuong trinh kiem tra mot so co phai la so Mersenne\n");
    int n;

    printf("Nhap vao mot so nguyen duong: ");
    scanf("%d", &n);

    if (is_Mersenne(n) == 1)
        printf("%d la so Mersenne", n);
    else
        printf("%d khong phai la so Mersenne", n);

    return 0;
}