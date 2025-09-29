#include <stdio.h>

int Hieu(int x, int y)
{
    return x > y ? x - y : y - x;
}

int main(void)
{
    printf("Chuong trinh kiem tra gia tri khac nhau va tim khoang cach gan nhat giua hai trong 4 so\n");
    int a, b, c, d, sokn = 0;

    printf("Nhap vao 4 so nguyen a, b, c, d: ");
    scanf("%d%d%d%d", &a, &b, &c, &d);

    if (a != b || a != c || a != d) sokn++;
    if (b != c || b != d) sokn++;
    if (c != d) sokn+=2;
    printf("a) Co %d gia tri khac nhau\n", sokn);

    int min;
    min = Hieu(a, b) < Hieu(a, c) ? Hieu(a, b) : Hieu(a, c);
    min = min < Hieu(a, d) ? min : Hieu(a, d);
    min = min < Hieu(b, c) ? min : Hieu(b, c);
    min = min < Hieu(b, d) ? min : Hieu(b, d);
    min = min < Hieu(c, d) ? min : Hieu(c, d);
    printf("b) Khoang cach gan nhat giua hai trong bon so tren la: %d", min);

    return 0;
}