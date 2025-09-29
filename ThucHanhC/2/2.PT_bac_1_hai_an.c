#include <stdio.h>

int main(void)
{
    printf("Chuong trinh giai he phuong trinh bac nhat hai an\n");
    int a1, a2, b1, b2, c1, c2;
    float  D, Dx, Dy, x, y;

    printf("Nhap vao cac he so nguyen a1, b1, c1, a2, b2, c2: ");
    scanf("%d%d%d%d%d%d", &a1, &b1, &c1, &a2, &b2, &c2);

    D = (a1 * b2) - (a2 * b1);
    Dx = (c1 * b2) - (c2 * b1);
    Dy = (a1 * c2) - (a2 * c1);

    if (D == 0)
    {
        if (Dx == 0 && Dy == 0)
        {
            printf("Phuong trinh co vo so nghiem");
        }
        else
        {
            printf("Phuong trinh vo nghiem");
        }
    }
    else
    {
        x = Dx / D;
        y = Dy / D;
        printf("Phuong trinh co:\nx = %.2f\ny = %.2f", x, y);
    }

    return 0;
}