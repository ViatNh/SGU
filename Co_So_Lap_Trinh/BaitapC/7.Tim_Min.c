#include <stdio.h>

int main(void)
{
    printf("Chương trình tìm Min từ 4 sô nguyên\n");
    int numbers[4];

    printf("Nhập 4 số nguyên: ");
    scanf("%d%d%d%d", &numbers[0], &numbers[1], &numbers[2], &numbers[3]);
    int min = numbers[0];

    for (int i=0; i<4; i++)
    {
        min = numbers[i]<min ? numbers[i] : min;
    }

    printf("Min = %d", min);

    return 0;
}