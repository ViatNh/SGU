#include <stdio.h>

int main(void)
{
    int a,b,c, is_Triangle;

    printf("Nhập lần lượt a, b, c: ");
    scanf("%d%d%d", &a, &b, &c);

    is_Triangle = (a + b > c) && (a + c > b) && (b + c > a) ? 1 : 0;
    if (is_Triangle)
    {
        printf("%d %d %d là 3 cạnh của một tam giác", a, b, c);
    }
    else
    {
        printf("%d %d %d không phải là 3 cạnh của một tam giác", a, b, c);
    }

    return 0;
}