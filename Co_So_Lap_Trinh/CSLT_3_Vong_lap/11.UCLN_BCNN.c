#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chuong trinh tim UCLN va BCNN\n");
    unsigned int a, b, min, ucln, bcnn;

    printf("Nhap vao 2 so nguyen duong a va b: ");
    scanf("%d%d", &a, &b);

    min = a < b ? a : b;

    for (int i = min; i > 0; i--)
    {
        if ((a % i == 0) && (b % i == 0))
        {
            printf("Uoc chung lon nhat cua a va b: %d\n", i);
            printf("Boi chung nho nhat cua a va b: %d", a * b / i);
            break;
        }
    }

    return 0;
}