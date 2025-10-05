#include <stdio.h>

int is_SHC(int n)
{
    int s = 0;
    for (int i = 1; i < n; i++)
    {
        if (n % i == 0)
        {
            s += i;
        }
    }
    if (s == n) return 1;
    else return 0;
}

int main(void)
{
    printf("Chuong trinh kiem tra so hoan chinh\n");
    int n;

    printf("Nhap vao mot so nguyen duong: ");
    scanf("%d", &n);

    if (is_SHC(n) == 1)
        printf("%d la so hoan chinh", n);
    else
        printf("%d khong phai la so hoan chinh", n);

    return 0;
}