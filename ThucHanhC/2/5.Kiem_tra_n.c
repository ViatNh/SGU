#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chuong trinh kiem tra so nguyen duong n\n");
    unsigned int n;

    printf("Nhap so nguyen duong n: ");
    scanf("%d", &n);

    // a) Kiem tra so nguyen to
    int is_SNT = 1;
    if (n < 2) is_SNT = 0;
    for (int i = 2; i <= sqrt(n); i++)
    {
        if (n % i == 0)
        {
            is_SNT = 0;
            break;
        }
    }
    if (is_SNT)
        printf("a) %d la so nguyen to\n", n);
    else
        printf("a) %d khong phai la so nguyen to\n", n);

    // b) Kiem tra so hoan chinh

    return 0;
}