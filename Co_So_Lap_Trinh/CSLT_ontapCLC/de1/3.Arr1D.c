#include <stdio.h>
#include <math.h>

/*
  Logic
    - Tim gia tri lon nhat trong mang
        Merge Sort --> Arr1D[n_Array1D - 1]
    - Dem SNT Doi xung
        (ArrSNT[i - 1] + ArrSNT[i + 1])/ 2 == ArrSNT[i]
*/

// Nhap xuat Arr1D
void InputArr1D(int Arr1D[], int *n_Arr1D);
void OutputArr1D(int Arr1D[], int n_Arr1D);
// Tim gia tri lon nhat trong Mang
void Merge(int Arr1D[], int l, int m, int r);
void MergeSort(int Arr1D[], int l, int r);
// Dem SNT doi xung
int is_SNT(int num);
int Left(int num);
int Right(int num);
int DemSNT_DoiXung(int Arr1D[], int n_Arr1D);

int main(void)
{
    int Arr1D[100], n_Arr1D;
    int l, r;

    InputArr1D(Arr1D, &n_Arr1D);
    OutputArr1D(Arr1D, n_Arr1D);

    // MergeSort(Arr1D, 0, n_Arr1D - 1);
    // printf("\nGia tri lon nhat cua mang: %d", Arr1D[n_Arr1D - 1]);
    // OutputArr1D(Arr1D, n_Arr1D);

    printf("\nTrong mang co %d so nguyen to doi xung", DemSNT_DoiXung(Arr1D, n_Arr1D));

    return 0;
}

void InputArr1D(int Arr1D[], int *n_Arr1D)
{
    printf("Nhap so luong phan tu cua mang: ");
    scanf("%d", &*n_Arr1D);

    for (int i = 0; i < *n_Arr1D; i++){
        printf("\nArr1D[%d] = ", i);
        scanf("%d", &Arr1D[i]);
    }
}

void OutputArr1D(int Arr1D[], int n_Arr1D)
{
    printf("\nCac phan tu co trong mang hien tai:");
    for (int i = 0; i < n_Arr1D; i++){
        printf(" %d", Arr1D[i]);
    }
}

void Merge(int Arr1D[], int l, int m, int r)
{
    int TmpArr[100];
    int i = l;
    int j = m + 1;
    int k = 0;

    while ((i <= m) && (j <= r)){
        if (Arr1D[i] <= Arr1D[j]){
            TmpArr[k] = Arr1D[i];
            i++;
        }
        else{
            TmpArr[k] = Arr1D[j];
            j++;
        }
        k++;
    }
    while (i <= m){
        TmpArr[k] = Arr1D[i];
        i++;
        k++;
    }
    while (j <= r){
        TmpArr[k] = Arr1D[j];
        j++;
        k++;
    }
    for (i = l, k = 0; i <= r; i++, k++){
        Arr1D[i] = TmpArr[k];
    }
}

void MergeSort(int Arr1D[], int l, int r)
{
    if (l < r){
        int m = (l + r)/ 2;
        MergeSort(Arr1D, l, m);
        MergeSort(Arr1D, m + 1, r);
        Merge(Arr1D, l, m, r);
    }
}

int is_SNT(int num)
{
    if (num < 2)
        return 0;
    for (int i = 2; i <= sqrt(num); i++){
        if (!(num % i))
            return 0;
    }
    return 1;
}

int Left(int num)
{
    if ((num < 2) || (num % 2))
        return 1;
    if (is_SNT(num))
        return num;
    return Left(num - 2);
}

int Right(int num)
{
    if ((num < 2) || (num % 2))
        return 1;
    if (is_SNT(num))
        return num;
    return Right(num + 2);
}

int DemSNT_DoiXung(int Arr1D[], int n_Arr1D)
{
    int count = 0;
    for (int i = 0; i < n_Arr1D; i++){
        if ((is_SNT(Arr1D[i])) && (Arr1D[i] > 2))
            if (Arr1D[i] == ((Left(Arr1D[i] - 2) + Right(Arr1D[i] + 2))/ 2))
                count++;
    }
    return count;
}

