#include <stdio.h>

int main(void)
{
    printf("Chương trình nhập một số nguyên chia hết cho 5\n");
    int number;

    printf("Nhập một số nguyên: ");
    scanf("%d", &number);

    if (number%5==0) {printf("%d chia hết cho 5", number);}
    else {printf("%d không chia hết cho 5", number);}

    return 0;
}