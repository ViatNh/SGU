#include <stdio.h>

int Decimal_to_Binary (int n)
{
    int binary = 1;
    int temp = n;
    
    for (; temp > 0; temp /= 2)
    {
        int a = temp % 2;
        binary = binary * 10 + a;
    }
    int d = binary;
    binary = 0;
    for (; d > 0; d /= 10)
    {
        int b = d % 10;
        binary = binary * 10 + b;
    }
    binary /= 10;
    return binary;
}

void Binary (int n)
{
    if (n != 0)
    {
        Binary(n / 2);
        printf("%d", n % 2);
    }
   
}

int main (void)
{
    printf("Chuong trinh doi mot so he 10 sang he nhi phan\n");
    int n;

    printf("Nhap mot so he 10: ");
    scanf("%d", &n);

    // Dung for
    int binary = Decimal_to_Binary(n);
    printf("%d (10) = %d (2)\n", n, binary);

    // Dung de quy
    printf("(10) %d = (2) ", n);
    Binary(n);

    return 0;
}