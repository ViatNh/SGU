#include <stdio.h>

// Prototype
int is_NamNhuan(int);
int tinhThang(int, int, int);
int tinhNam(int, int);
void tinhNgay(int, int, int);

int main(void)
{
    printf("Chuong trinh tinh so ngay ke tu ngay 1/1/1.");
    int d, m, y;

    printf("\nNhap vao ngay thang nam: ");
    scanf("%d%d%d", &d, &m, &y);

    tinhNgay(d, m, y);

    return 0;
}

int is_NamNhuan(int y)
{
    if (!(y % 400) || (!(y % 4) && (y % 100))) // (Chia het cho 400) hoac (chia het cho 4 va khong chia het cho 100)
        return 1;
    else
        return 0;
}

int tinhThang(int tmp, int m, int y)
{
    if (tmp >= m)
        return 0;
    switch (tmp){
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            return 31 + tinhThang(tmp + 1, m, y);
        case 4: case 6: case 9: case 11:
            return 30 + tinhThang(tmp + 1, m, y);
        case 2:
            return (is_NamNhuan(y) ? 29 : 28) + tinhThang(tmp + 1, m, y);
    }
}

int tinhNam(int tmp, int y)
{
    if (tmp >= y)
        return 0;
    return (is_NamNhuan(tmp) ? 366 : 365) + tinhNam(tmp + 1, y);
}

void tinhNgay(int d, int m, int y)
{
    int tmp = 1;
    printf("%d ngay", d + tinhThang(tmp, m, y) + tinhNam(tmp, y));
}