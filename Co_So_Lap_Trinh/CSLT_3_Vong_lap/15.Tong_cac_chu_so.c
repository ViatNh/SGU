#include <stdio.h>

int main(void)
{
    printf("Chuong trinh tinh tong cac chu so\n");
    unsigned int n, S = 0;

    printf("Vui long nhap so nguyen duong n: ");
    scanf("%d", &n);
    unsigned int m = n;

    for (; n > 0; n /= 10)
    {
        S += n % 10;
    }

    printf("Tong cac chu so cua %d la: %d", m, S);

    return 0;
}