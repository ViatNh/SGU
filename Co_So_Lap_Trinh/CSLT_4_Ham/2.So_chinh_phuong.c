#include <stdio.h>
#include <math.h>

int is_SCP(int i)
{
    if (sqrt(i) == (int)sqrt(i))
        return 1;
    else
        return 0;
}

int main(void)
{
    printf("Chuong trinh in tat ca cac so chinh phuong trong khoang (A, B)\n");
    int A, B;

    printf("Nhap 2 so nguyen duong A va B: ");
    scanf("%d%d", &A, &B);

    printf("Tat ca cac so chinh phuong trong khoang (%d, %d):", A, B);
    for (int i = A; i <= B; i++)
    {
        if (is_SCP(i) == 1)
        {
            printf(" %d", i);
        }
    }

    return 0;
}