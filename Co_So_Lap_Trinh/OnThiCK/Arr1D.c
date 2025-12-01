#include <stdio.h>

void InputArr1D(int Arr1D[], int *n); // Nhap mang mot chieu
void OutputArr1D(int Arr1D[], int n); // Xuat mang mot chieu

// Merge Sort
int Merge(int Arr1D[], int l, int m, int r); 
int MergeSort(int Arr1D[], int l, int r);
// Sort xong tim duoc Min/Max o index 0 va n - 1
// Co the Sort tang dan va giam dan (tuy vao de bai yeu cau)

void XoaTrung(int Arr1D[], int *n); // Xoa phan tu trung trong mang
void XoaPT(int Arr1D[], int n, int idx); // Xoa phan tu index

float OddAverage(int Arr1D[], int n);

int main(void)
{
    int Arr1D[100], n;

    InputArr1D(Arr1D, &n);
    printf("\nPhan tu ban dau cua mang:");
    OutputArr1D(Arr1D, n);

    MergeSort(Arr1D, 0, n - 1);
    printf("\n\nPhan tu cua mang sau khi sap xep:");
    OutputArr1D(Arr1D, n);
    printf("\nMax = %d, Min = %d", Arr1D[n - 1], Arr1D[0]);

    XoaTrung(Arr1D, &n);
    printf("\n\nPhan tu cua mang sau khi xoa trung:");
    OutputArr1D(Arr1D, n);

    printf("\nTrung binh cong so le: %.2f", OddAverage(Arr1D, n));

    return 0;
}

void InputArr1D(int Arr1D[], int *n)
{
    printf("Nhap vao so luong phan tu cua mang: ");
    scanf("%d", &*n);

    for (int i = 0; i < *n; i++){
        printf("Arr1D[%d] = ", i);
        scanf("%d", &Arr1D[i]);
    }
}

void OutputArr1D(int Arr1D[], int n)
{
    for (int i = 0; i < n; i++){
        printf(" %d", Arr1D[i]);
    }
}

int Merge(int Arr1D[], int l, int m, int r)
{
    int TmpArr[100];
    int i = l;
    int j = m + 1;
    int k = 0;

    while ((i <=  m) && (j <= r)){
        if (Arr1D[i] <= Arr1D[j]){ // ESC (<=) -- DESC (>=)
            TmpArr[k++] = Arr1D[i++];
        }
        else
            TmpArr[k++] = Arr1D[j++];
    }
    while (i <= m)
        TmpArr[k++] = Arr1D[i++];
    while (j <= r)
        TmpArr[k++] = Arr1D[j++];

    for (i = l, k = 0; i <= r; i++, k++){
        Arr1D[i] = TmpArr[k];
    }
}

int MergeSort(int Arr1D[], int l, int r)
{
    if (l < r){
        int m = (l + r)/ 2;
        MergeSort(Arr1D, l , m);
        MergeSort(Arr1D, m + 1, r);
        Merge(Arr1D, l, m, r);
    }
}

void XoaTrung(int Arr1D[], int *n)
{
    for (int i = 1; i < *n; i++){
        if (Arr1D[i] == Arr1D[i - 1]){
            XoaPT(Arr1D, *n, i);
            *n -= 1;
            i--;
        }
    }
}

void XoaPT(int Arr1D[], int n, int idx)
{
    for (int i = idx; i < n; i++){
        Arr1D[i] = Arr1D[i + 1];
    }
}

float OddAverage(int Arr1D[], int n)
{
    int sum, countOdd;
    sum = countOdd = 0;
    for (int i = 0; i < n; i++){
        if (Arr1D[i] % 2){
            sum += Arr1D[i];
            countOdd++;
        }
    }
    return (1.0 * sum / countOdd);
}