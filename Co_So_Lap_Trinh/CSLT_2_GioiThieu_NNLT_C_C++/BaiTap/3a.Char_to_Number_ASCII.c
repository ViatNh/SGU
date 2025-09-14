#include <stdio.h>

int main(void)
{
    printf("Chương trình nhập vào một kí tự và in ra mã ASCII tương ứng với kí tự đó.\n");
    char ky_tu;

    printf("Nhập ký tự cần chuyển đổi: ");
    scanf("%c", &ky_tu);

    printf("%d", ky_tu);

    return 0;
}