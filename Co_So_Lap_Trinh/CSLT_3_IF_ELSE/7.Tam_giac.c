#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình kiểm tra hình tam giác\n");
    float a, b, c; // 3 cạnh
    int is_Triangle; // Xác minh có phải tam giác không

    printf("Nhập vào số đo 3 cạnh: ");
    scanf("%f%f%f", &a, &b, &c);

    is_Triangle = (a+b>c) && (a+c>b) && (b+c>a) ?1:0;

    if (is_Triangle)
    {
        // Dạng tam giác
        if (a==b && b==c)
        {
            printf("Tam giác đều");
        }
        else if ((a==b || b==c || c==a) && ((pow(a,2)==pow(b,2)+pow(c,2)) || (pow(b,2)==pow(a,2)+pow(c,2)) || (pow(c,2)==pow(a,2)+pow(b,2))))
        {
            printf("Tam giác vuông cân");
        }
        else if (a==b || b==c || c==a)
        {
            printf("Tam giác cân");
        }
        else if ((pow(a,2)==pow(b,2)+pow(c,2)) || (pow(b,2)==pow(a,2)+pow(c,2)) || (pow(c,2)==pow(a,2)+pow(b,2)))
        {
            printf("Tam giác vuông");
        }
        else
        {
            printf("Tam giác thường");
        }
    }
    else
    {
        printf("Không phải tam giác");
    }

    return 0;
}