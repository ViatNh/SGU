#include <stdio.h>
#include <math.h>
#define MAXM 100
#define MAXN 100

void InputArr2D(int Arr2D[MAXM][MAXN], int *m, int *n);
void OutputArr2D(int Arr2D[MAXM][MAXN], int m, int n);

int TongCheoChinh(int Arr2D[MAXM][MAXN], int n);
int TongCheoPhu(int Arr2D[MAXM][MAXN], int n);
void TongRow(int Arr2D[MAXM][MAXN], int m, int n);
void TongCol(int Arr2D[MAXM][MAXN], int m, int n);

int Max(int Arr2D[MAXM][MAXN], int m, int n);

int main (void)
{
    int Arr2D[MAXM][MAXN];
    int m, n;

    InputArr2D(Arr2D, &m, &n);
    OutputArr2D(Arr2D, m, n);

    printf("\nTong cheo chinh: %d", TongCheoChinh(Arr2D, n));
    printf("\nTong cheo phu: %d", TongCheoPhu(Arr2D, n));

    TongRow(Arr2D, m, n);
    TongCol(Arr2D, m, n);

    printf("\nMax = %d", Max(Arr2D, m, n));

    return 0;
}

void InputArr2D(int Arr2D[MAXM][MAXN], int *m, int *n)
{
    printf("Nhap vao so dong, so cot: ");
    scanf("%d%d", &*m, &*n);

    for (int i = 0; i < *m; i++){
        for (int j = 0; j < *n; j++){
            printf("Arr2D[%d][%d] = ", i, j);
            scanf("%d", &Arr2D[i][j]);
        }
        printf("\n");
    }
}

void OutputArr2D(int Arr2D[MAXM][MAXN], int m, int n)
{
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            printf(" %d", Arr2D[i][j]);
        }
        printf("\n");
    }
}

int TongCheoChinh(int Arr2D[MAXM][MAXN], int n)
{
    int sum = 0;
    for (int i = 0; i < n; i++){
        sum += Arr2D[i][i];
    }
    return sum;
}

int TongCheoPhu(int Arr2D[MAXM][MAXN], int n)
{
    int sum = 0;
    for (int i = n - 1, j = 0; i >= 0; i--, j++){
        sum += Arr2D[i][j];
    }
    return sum;
}

void TongRow(int Arr2D[MAXM][MAXN], int m, int n)
{
    for (int i = 0; i < m; i++){
        int sum = 0;
        for (int j = 0; j < n; j++){
            sum += Arr2D[i][j];
        }
        printf("\nTong hang thu %d: %d", i + 1, sum);
    }
}

void TongCol(int Arr2D[MAXM][MAXN], int m, int n)
{
    for (int j = 0; j < m; j++){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += Arr2D[i][j];
        }
        printf("\nTong cot thu %d: %d", j + 1, sum);
    }
}

int Max(int Arr2D[MAXM][MAXN], int m, int n)
{
    int max = Arr2D[0][0];
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            max = max < Arr2D[i][j] ? Arr2D[i][j] : max;
        }
    }
    return max;
}