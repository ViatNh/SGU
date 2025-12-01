#include <stdio.h>

int main(void)
{
    printf("Chương trình phân biệt chẵn lẻ\n");
    int number;

    printf("Nhập vào một số: ");
    scanf("%d", &number);

    if (number%2==0) {printf("%d là số chẵn", number);}
    else {printf("%d là số lẻ", number);}

    return 0;
}