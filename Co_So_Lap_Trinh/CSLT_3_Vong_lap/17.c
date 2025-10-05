#include <stdio.h>
#include <math.h>

void SDX()
{
    printf("Chuong trinh kiem tra so doi xung\n");
    int n, dx = 0;
    printf("Nhap vao mot so nguyen duong: ");
    scanf("%d", &n);

    int temp = n;
    for (; temp > 0; temp /= 10)
    {
        int a = temp % 10;
        dx = dx * 10 + a;
    }

    if (n == dx)
        printf("%d la so doi xung", n);
    else
        printf("%d khong phai la so doi xung", n);
}

void SCP()
{
    printf("Chuong trinh kiem tra so chinh phuong\n");
    int n;
    printf("Nhap vao so nguyen duong n: ");
    scanf("%d", &n);

    if (sqrt(n) == (int)sqrt(n))
        printf("%d la so chinh phuong", n);
    else
        printf("%d khong phai la so chinh phuong", n);
}

void SNT()
{
    printf("Chuong trinh kiem tra so nguyen to\n");
    int n;
    printf("Nhap vao so nguyen duong n: ");
    scanf("%d", &n);

    int is_SNT = 1;
    if (n < 2)
        is_SNT = 0;
    else
    {
        for (int i = 2; i <= sqrt(n) + 1; i++)
        {
            if (n % i == 0)
            {
                is_SNT = 0;
                break;
            }
        }
    }
    if (is_SNT == 1)
        printf("%d la so nguyen to", n);
    else
        printf("%d khong phai la so nguyen to", n);
}

void Min_Max()
{
    printf("Chuong trinh tim so lon nhat va chu so nho nhat\n");
    int soLuong, min, max;

    printf("Nhap so luong: ");
    scanf("%d", &soLuong);
    min = pow(10, soLuong);
    max = 0;

    for (int i = 1; i <= soLuong; i++)
    {
        int n;
        printf("Nhap so thu %d: ", i);
        scanf("%d", &n);
        min = min < n ? min : n;
        max = max > n ? max : n;
    }

    printf("So lon nhat la: %d\n", max);
    printf("So nho nhat la: %d", min);
}

int main(void)
{
    int chose;

    do
    {
        printf("\n1. So doi xung");
        printf("\n2. So chinh phuong");
        printf("\n3. So nguyen to");
        printf("\n4. Chu so lon nhat va nho nhat");
        printf("\n0. Thoat chuong  trinh");
        printf("\nChon: ");
        scanf("%d", &chose);
        switch (chose)
        {
            case 0:
                printf("Dang thoat chuong trinh...");
                break;
            case 1:
                SDX();
                chose = -1;
                break;
            case 2:
                SCP();
                chose = -1;
                break;
            case 3:
                SNT();
                chose = -1;
                break;
            case 4:
                Min_Max();
                chose = -1;
                break;
            default:
                printf("Vui long chon dung");
                chose = -1;
        }
    } while (chose < 0);

    return 0;
}