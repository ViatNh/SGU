#include <stdio.h>
#include <stdlib.h>
#include <time.h>

FILE *f; // Kieu du lieu tuong tac voi file

int m = 100; // So luong file
int datFile[1] = {100}; // So luong data trong moi file
int n = 1;

/* Tao bo dem gan, so sanh, thoi gian */
double assign_count, condition_count, time_count;

void swap(long *a, long *b);
void interchangeSort(long a[], int n, int i, int j);

int main(void)
{
    for (int i = 0; i < n; i++){ /* So luong du lieu cua file */
        int arg_1 = datFile[i]; // Fist file name

        assign_count = condition_count = time_count = 0; // Set bo dem ve 0

        for (int j = 0; j < m; j++){ /* So luong file */
            int arg_2 = j + 1; // Last file name

            /* Tao ten file tu 2 bien int */
            char name[20];
            sprintf(name, "%d_%d.txt", arg_1, arg_2);
            f = fopen(name, "r");
            if (!f){ // Xu ly sau khi mo
                    printf("Can't open a file\n");
                    exit(0);
            }

            // Open File successfully -> Khoi tao mang A dua theo so luong phan tu
            long *A = malloc(datFile[i] * sizeof(long));
            for (int k = 0; k < datFile[i]; k++){
                fscanf(f, "%ld", &A[k]);
            }

            fclose(f); // Dong f sau khi luu data vao array A
            f = fopen(name, "w"); // Ghi de file f
            if (!f){ // Xu ly sau khi mo
                    printf("Can't open a file\n");
                    exit(0);
            }
            
            clock_t start = clock();

            interchangeSort(A, datFile[i], 0, 1);

            clock_t end = clock();
            time_count += (double)(end - start) / CLOCKS_PER_SEC; // Thoi gian sort cua moi file

            for (int k = 0; k < datFile[i]; k++){
                fprintf(f, "%ld ", A[k]);
            }

            fclose(f); // Dong f sau khi mo
            free(A);
        }
        char summary_name[20];
        sprintf(summary_name, "summary_%d.csv", arg_1);
        f = fopen(summary_name, "w");
        fprintf(f, "%f, %f, %f", assign_count, condition_count, time_count);
    }

    return 0;
}

void swap(long *a, long *b)
{
    long tmp = *a;
    assign_count++;
    *a = *b;
    assign_count++;
    *b = tmp;
    assign_count++;
}

void interchangeSort(long a[], int n, int i, int j)
{
    if (i == n - 1){
        condition_count++;
        return;
    }
    if (a[i] > a[j]){
        condition_count++;
        swap(&a[i], &a[j]);
    }
    if (j == n - 1){
        condition_count++;
        interchangeSort(a, n, i + 1, i + 2);
    }
    else
        interchangeSort(a, n, i, j + 1);
}