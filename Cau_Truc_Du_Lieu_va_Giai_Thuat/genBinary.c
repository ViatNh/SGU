#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

int m = 1;
int datFile[] = {100};
int n = 1;

long DataRandom();

int main(void)
{
    srand(time(NULL));
    FILE *f;
    
    for (int i = 0; i < n; i++){
        int arg_1 = datFile[i];
        for (int j = 1; j <= m; j++){
            int arg_2 = j;
            char name[50];
            sprintf(name, "%d_%d.bin", arg_1, arg_2);

            f = fopen(name, "wb");
            if (!f){
                printf("Error!");
                exit(1);
            }

            for (int k = 0; k < datFile[i]; k++){
                long dataRand = DataRandom();
                fwrite(&dataRand, sizeof(long), datFile[i], f);
            }
            fclose(f);
            f = fopen(name, "rb");
            long q;
            for (int k = 0; k < datFile[i]; k++){
                fread(&q, sizeof(long), datFile[i], f);
                printf("%ld ", q);
            }

            fclose(f);
            
        }
    }

    return 0;
}

long DataRandom()
{
    long a = 0;
    while (!a)
        a = (long)rand() * sqrt(rand()) * (rand() % 2 == 0 ? 1 : -1);
    return a % 1000000;
}
