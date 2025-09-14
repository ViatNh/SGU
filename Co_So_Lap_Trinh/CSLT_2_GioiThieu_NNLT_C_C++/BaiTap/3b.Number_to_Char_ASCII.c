#include <stdio.h>

int main(void)
{
    printf("Chương trình nhập vào một số nguyên (1 đến 255) và in ra kí tự có mã ASCII tương ứng.\n");
    int number;

    printf("Nhập số cần chuyển đổi: ");
    scanf("%d", &number);

    printf("%c", number);

    return 0;
}