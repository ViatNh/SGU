#include <stdio.h>

int UCLN(int a, int b)
{
    int min = a < b ? a : b;

    for (int i = min; i > 0; i--)
    {
        if (a % i == 0 && b % i == 0)
        {
            int UCLN = i;
            return UCLN;
            break;
        }
    }
}

int main(void)
{
    char chose;
    do
    {
        printf("Vui long chon cau (a hoac b hoac c): ");
        scanf("%c", &chose);

        switch (chose)
        {
            case 'a':
                printf("a) Chuong trinh tim UCLN va BCNN cua 2 so nguyen duong\n");
                int m, n;

                printf("Nhap vao 2 so nguyen duong m va n: ");
                scanf("%d%d", &m, &n);

                printf("UCLN cua %d va %d la: %d\n", m, n, UCLN(m, n));
                printf("BCNN cua %d va %d la: %d", m, n, m * n / UCLN(m, n));
                break;
                
            case 'b':
                printf("b) Chuong trinh rut gon mot phan so\n");
                int chia, bi_chia;

                printf("Nhap mot phan so (3/2 -> 3 2): ");
                scanf("%d%d", &chia, &bi_chia);

                int y = UCLN(chia, bi_chia);
                printf("%d%d = %d/%d", chia, bi_chia, chia / y, bi_chia / y);
                break;

            case 'c':
                printf("c) Chuong trinh tinh va in ra phan so tong o dang phan so toi gian\n");
                int a, b, c, d;

                printf("Nhap 2 phan so theo thu tu (a/b -> a b) va (c/d -> c d): ");
                scanf("%d%d%d%d", &a, &b, &c, &d);

                int tu = (a * d) + (c * b);
                int mau = b * d;
                int z = UCLN(tu, mau);

                printf("%d/%d + %d/%d = %d/%d", a, b, c, d, tu / z, mau / z);
                break;
                
            default:
                chose = 'd';
        }
    } while (chose == 'd');

    return 0;
}