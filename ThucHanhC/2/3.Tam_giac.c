#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chuong trinh xet dieu kien tam giac\n");
    unsigned a, b, c;

    printf("Nhap vao so do 3 canh: ");
    scanf("%d%d%d", &a, &b, &c);

    if ((a + b > c) && (a + c > b) && (b + c > a))
    {
        if ((a == b) && (b == c) && (c == a))
        {
            printf("Tam giac deu");
        }
        else if ((a == b  || a == c || b == c))
        {
            printf("Tam giac can");
        }
        else if (pow(a, 2) == pow(b, 2) + pow(c, 2) || pow(b, 2) == pow(c, 2) + pow(c, 2) || pow(c, 2) == pow(b, 2) + pow(a, 2))
        {
            printf("Tam giac vuong");
        }
        else
        {
            printf("Tam giac thuong");
        }
    }
    else
    {
        printf("Khong phai la hinh tam giac");
    }

    return 0;
}