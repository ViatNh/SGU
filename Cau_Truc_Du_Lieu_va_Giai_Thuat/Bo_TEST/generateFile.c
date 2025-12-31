#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

FILE *f; // Kieu du lieu tuong tac voi file

int m = 100; // So luong file
/*
So luong data trong moi file
datFile val khong lon hon 500
*/
int datFile[] = {100, 500};
int n = 2;

/*
- Tao 100 file 100_[1->100].txt
  + Tao ten file
  + Lap de ghi vao file tuong ung
Moi file chua datFile[i] so random
*/

long randomData();

int main(void)
{
    srand(time(NULL)); // Generate Real Random

    for (int i = 0; i < n; i++){ /* So luong du lieu cua file */
        int arg_1 = datFile[i];
        for (int j = 0; j < m; j++){ /* So luong file */
            int arg_2 = j + 1;

            /* Tao ten file tu 2 bien int */
            char name[20];
            sprintf(name, "%d_%d.txt", arg_1, arg_2);
            f = fopen(name, "w");
            if (!f){ // Xu ly sau khi mo
                    printf("Can't open a file\n");
                    exit(0);
            }

            for (int k = 0; k < datFile[i]; k++){ /* So luong random */
                fprintf(f, "%ld ", randomData() % 10000000);
            }

            fclose(f); // Dong f sau khi mo
        }
    }

    return 0;
}

long randomData()
{
    long a = 0;
    while (!a)
        a = (long)rand() * sqrt(rand()) * (rand() % 2 == 0 ? 1 : -1);
    return a;
}