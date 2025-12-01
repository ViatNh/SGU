#include <stdio.h>
#include <math.h>
#define maxm 100
#define maxn 100

// a)
void input_array(int a[maxm][maxn], int *m, int *n);
void output_array(int a[maxm][maxn], int m, int n);

// c)
int is_prime(int num);
void count_prime_row(int a[maxm][maxn], int m, int n);

int main(void)
{
    int a[maxm][maxn];
    int m, n;

    input_array(a, &m, &n);
    output_array(a, m, n);

    count_prime_row(a, m, n);

    return 0;
}

void input_array(int a[maxm][maxn], int *m, int *n)
{
    printf("Nhap vao so hang, so cot: ");
    scanf("%d%d", &*m, &*n);

    for (int i = 0; i < *m; i++){
        for (int j = 0; j < *n; j++){
            printf("a[%d][%d] = ", i, j);
            scanf("%d", &a[i][j]);
        }
        printf("\n");
    }
}

void output_array(int a[maxm][maxn], int m, int n)
{
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            printf(" %d", a[i][j]);
        }
        printf("\n");
    }
}

int is_prime(int num)
{
    if (num < 2)
        return 0;
    for (int i = 2; i <= sqrt(num); i++){
        if (!(num % i))
            return 0;
    }
    return 1;
}

void count_prime_row(int a[maxm][maxn], int m, int n)
{
    for (int i = 0; i < m; i++){
        int count = 0;
        for (int j = 0; j < n; j++){
            if (is_prime(a[i][j]))
                count++;
        }
        printf("\nDong %d co %d so nguyen to", i, count);
    }
}