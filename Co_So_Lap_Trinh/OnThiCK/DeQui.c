#include <stdio.h>

int GiaiThua(int num);
int Fibonacci(int num);

int main(void)
{
    int num;
    printf("Nhap vao mot so nguyen: ");
    scanf("%d", &num);

    printf("%d! = %d", num, GiaiThua(num));

    printf("\nDay so Fibonacci cua %d = %d", num, Fibonacci(num));

    return 0;
}

int GiaiThua(int num)
{
    if (num > 0)
        return num * GiaiThua(num - 1);
    return 1;
}

int Fibonacci(int num)
{
    if (num == 1)
        return 1;
    else if (num >= 2)
        return (Fibonacci(num - 1) + Fibonacci(num - 2));
    return 0;
}