#include <stdio.h>

int main(void)
{
    printf("Chương trình giải Phương trình bậc 1 (ax+b=0).\n");
    float a, b, x;

    printf("Nhập vào a, b: ");
    scanf("%f%f", &a, &b);

    if (a==0)
    {
        if (b==0) {printf("Phương trình có vô số nghiệm");}
        else {printf("Phương trình vô nghiệm");}
    }
    else
    {
        printf("Phương trình có 1 nghiệm duy nhất: x = %.2f", -b/a);
    }

    return 0;
}