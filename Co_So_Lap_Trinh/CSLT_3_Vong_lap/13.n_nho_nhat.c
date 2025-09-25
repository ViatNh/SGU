#include <stdio.h>

int main(void)
{
    printf("Chuong trinh tim n nho nhat sao cho S theo cong thuc > M\n");
    int M, S = 0;

    printf("Nhap vao M: ");
    scanf("%d", &M);

    for (int n = 0; n >= 0; n++)
    {
        S += 2 * n + 1;
        if (S > M)
        {
            printf("Gia tri n nho nhat: %d", n);
            break;
        }
    }

    return 0;
}