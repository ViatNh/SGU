#include <stdio.h>

int main(void)
{
    int number, donvi, chuc, tram, nghin;
    int Chu_so_hang[4] = {}; 
    printf("Chương trình cho biết chữ số hàng nghìn, hàng trăm, hàng chục, hàng đơn vị của một số có 04 chữ số.\n");

    printf("Nhập một số có 4 chữ số: ");
    scanf("%d", &number);

    for (int i=0; i<4; i++)
    {
        Chu_so_hang[i] = number % 10;
        number /= 10;
    }

    /*donvi = number % 10;
    number /= 10;
    chuc = number % 10;
    number /= 10;
    tram = number % 10;
    number /= 10;
    nghin = number % 10;*/

    printf("Chữ số hàng nghìn: %d\n", Chu_so_hang[3]);
    printf("Chữ số hàng trăm: %d\n", Chu_so_hang[2]);
    printf("Chữ số hàng chục: %d\n", Chu_so_hang[1]);
    printf("Chữ số hàng đơn vị: %d", Chu_so_hang[0]);

    return 0;
}