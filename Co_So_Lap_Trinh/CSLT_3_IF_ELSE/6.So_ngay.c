#include <stdio.h>

int main(void)
{
    printf("Chương trình xác định số ngày trong tháng, năm\n");
    int month, year;

    printf("Nhập vào tháng năm: ");
    scanf("%d%d", &month, &year);

    switch (month)
    {
        case 1:case 3: case 5: case 7: case 8: case 10: case 12:
            printf("%d/%d có 31 ngày", month, year);
            break;
        case 4: case 6: case 9: case 11:
            printf("%d/%d có 30 ngày", month, year);
            break;
        case 2:
            int nhuan;
            nhuan = (year%400==0) || (year%4==0 && year%100!=0)?29:28;
            printf("%d/%d có %d ngày", month, year, nhuan);
        default:
            printf("Vui lòng nhập đúng tháng năm! (Ví dụ: 12 2025)");
    }

    return 0;
}