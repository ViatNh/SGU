#include <stdio.h>

int main(void)
{
    printf("Chương trình đổi định dạng Hoa/thường cho ký tự\n");
    char c, format;

    while (!(c>=65 && c<=128))
    {
        printf("Nhập 1 ký tự: ");
        scanf("%c", &c);
    }
    

    format = (c>=65 && c<=96) ? c+32 : c-32;
    printf("%c -> %c", c, format);

    return 0;
}