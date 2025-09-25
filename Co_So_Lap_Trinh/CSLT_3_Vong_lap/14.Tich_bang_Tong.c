#include <stdio.h>

int main(void)
{
    printf("Chuong trinh hien thi tat ca cac so co 3 chu so sao cho tong cac chu so do bang tich cua chung\n");

    for (int tram = 1; tram < 10; tram++)
    {
        for (int chuc = 0; chuc < 10; chuc++)
        {
            for (int donvi = 0; donvi < 10; donvi++)
            {
                if ((tram + chuc + donvi) == (tram * chuc * donvi))
                {
                    printf("%d + %d + %d = %d * %d * %d = %d\n", tram, chuc, donvi, tram, chuc, donvi, tram + chuc + donvi);
                }
            }
        }
    }

    return 0;
}