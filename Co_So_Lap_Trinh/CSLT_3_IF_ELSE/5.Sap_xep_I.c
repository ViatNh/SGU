#include <stdio.h>

int main(void)
{
    printf("Chương trình sắp xếp 4 số nguyên tăng dần\n");
    int numbers[4], i, j, temp;

    printf("Nhập vào 4 số nguyên: ");
    scanf("%d%d%d%d", &numbers[0], &numbers[1], &numbers[2], &numbers[3]);

    for (i=3; i>=0; i--)
    {
        for (j=1; j<=i; j++)
        {
            if (numbers[j-1] > numbers[j])
            {
                temp = numbers[j-1];
                numbers[j-1] = numbers[j];
                numbers[j] = temp;
            }
        }
    }

    printf("Dãy sau khi sắp xếp: %d %d %d %d", numbers[0], numbers[1], numbers[2], numbers[3]);

    return 0;
}