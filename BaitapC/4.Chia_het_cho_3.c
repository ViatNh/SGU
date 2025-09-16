#include <stdio.h>

int main(void)
{
    printf("Chương trình nhập số nguyên chia hết cho 3\n");
    int number;

    printf("Nhập vào một số nguyên: ");
    scanf("%d", &number);

    if (number%3==0) {printf("%d chia hết cho 3", number);}
    else {printf("%d không chia hết cho 3", number);}

    return 0;
}