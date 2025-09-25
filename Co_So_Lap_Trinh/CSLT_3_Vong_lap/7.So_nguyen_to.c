#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình tìm số nguyên tố nhỏ hơn n\n");
    unsigned int n;
    int is_SNT;

    do
    {
        printf("Nhập số nguyên dương n: ");
        scanf("%d", &n);
    }
    while (n <= 2);
    
    for (int i = 2; i < n; i++)
    {
        is_SNT = 1;
        for (int j = 2; j <= sqrt(i); j++)
        {
            if (i % j == 0)
            {
                is_SNT = 0;
            }
        }
        if (is_SNT == 1)
        {
            printf("%d ", i);
        }
    }

    return 0;
}