#include <stdio.h>

int main(void)
{
    int a, b, m;
    printf("Chương trình nhập 2 số, đổi giá trị 2 số rồi in ra 2 số.\n");
    printf("Nhập 2 số a, b: ");
    scanf("%d%d", &a, &b);

    m = a;
    a = b;
    b = m;
    printf("a = %d, b = %d", a, b);

    return 0;
}