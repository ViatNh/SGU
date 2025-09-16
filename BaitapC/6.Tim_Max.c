#include <stdio.h>

int main(void)
{
    printf("Chương trình tìm Max từ 4 số nguyên\n");
    int numbers[4];

    printf("Nhập 4 số nguyên: ");
    scanf("%d%d%d%d", &numbers[0], &numbers[1], &numbers[2], &numbers[3]);
    int max = numbers[0];

    for (int i=0; i<4; i++)
    {
        max = numbers[i]>max ? numbers[i] : max;
    }

    printf("Max = %d", max);

    return 0;
}