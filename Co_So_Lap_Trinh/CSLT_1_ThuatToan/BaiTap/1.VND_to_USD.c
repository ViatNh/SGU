#include <stdio.h>

int main()
{
    float HANG_SO_QUY_DOI = 26000; //Hằng số quy đổi 1 USD = 26000 VND
    float so_tien_VND;
    float so_tien_USD;

    printf("Vui lòng nhập số tiền (VND): ");
    scanf("%f", &so_tien_VND);
    so_tien_USD = (so_tien_VND / HANG_SO_QUY_DOI);
    printf("Số tiền (USD) sau khi quy đổi là: %f", so_tien_USD);

    return 0;
}