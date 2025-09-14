#include <stdio.h>

int main(void)
{
    int y, is_Nam_nhuan;

    printf("Nhập năm cần tính nhuận: ");
    scanf("%d", &y);
    is_Nam_nhuan = (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)) ? 1 : 0;
    if (is_Nam_nhuan)
    {
        printf("%d là năm nhuận", y);
    }
    else
    {
        printf("%d là năm không nhuận", y);
    }

    return 0;
}