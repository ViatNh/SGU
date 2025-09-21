#include <stdio.h>

int main(void)
{
    printf("Chương trình tìm Min Max của 4 số nguyên\n");
    int numbers[4], min, max;

    printf("Nhập 4 số nguyên: ");
    scanf("%d%d%d%d", &numbers[0], &numbers[1], &numbers[2], &numbers[3]);
    min = max = numbers[0];

    for (int i=0; i<4; i++)
    {
        min = numbers[i]<min ? numbers[i] : min;
        max = numbers[i]>max ? numbers[i] : max;
    }

    printf("Min = %d\nMax = %d", min, max);

    return 0;
}