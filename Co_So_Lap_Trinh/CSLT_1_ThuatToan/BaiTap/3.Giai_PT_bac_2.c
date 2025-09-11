#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình giải phương trình bậc 2 (ax^2 + bx + c = 0)\n");
    float a, b, c, delta, x, x1, x2;
    printf("Nhập lần lượt tham số a, b, c (a khác 0): ");
    scanf("%f%f%f", &a, &b, &c);

    delta = (b * b) - (4 * a * c);
    if (delta < 0)
    {
        printf("Phương trình vô nghiệm");
    }
    else if (delta > 0)
    {
        x1 = (-b + sqrt(delta)) / (2 * a);
        x2 = (-b + sqrt(delta)) / (2 * a);
        printf("Phương trình có 2 nghiệm phân biệt:\nx1 = %.2f\nx2 = %.2f", x1, x2);
    }
    else
    {
        x = -b / (2 * a);
        printf("Phương trình có 1 nghiệm duy nhất: \nx1 = x2 = %.2f", x);
    }

    return 0;
}