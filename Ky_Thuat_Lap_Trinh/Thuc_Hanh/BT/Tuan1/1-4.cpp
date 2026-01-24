#include <iostream>
using namespace std;

void InputArr(double *&a, int &n);
void OutputArr(double *a, int n);
double* NoiArr(double *a, int n, double *b, int m, int k);
void MergeSort(double *a, int n, int l, int r);
void Merge(double *a, int n, int l, int m, int r);
double* NoiTang(double *a, int n, double *b, int m, int k);

int main(void)
{
    double *A, *B;
    int n, m;
    cout << "Nhap Mang A" << endl; // n=5, 12 21 8 9 3
    InputArr(A, n);
    cout << "Nhap Mang B" << endl; // m=8, 1 13 8 11 12 9 -1 0
    InputArr(B, m);
    cout << endl;
    cout << "Xuat Mang A" << endl;
    OutputArr(A, n);
    cout << "Xuat Mang B" << endl;
    OutputArr(B, m);

    int k = n + m;

    cout << endl;
    cout << "Noi mang A, B thanh mang C" << endl;
    double *C = NoiArr(A, n, B, m, k);
    OutputArr(C, k);

    MergeSort(A, n, 0, n - 1);
    MergeSort(B, m, 0, m - 1);
    cout << endl;
    cout << "Sap xep A tang dan" << endl;
    OutputArr(A, n);
    cout << "Sap xep B tang dan" << endl;
    OutputArr(B, m);

    cout << endl;
    cout << "Noi mang A, B tang dan thanh mang C" << endl;
    double *D = NoiTang(A, n, B, m, k);
    OutputArr(D, k);

    delete[] A, B, C, D;
    return 0;
}

void InputArr(double *&a, int &n)
{
    cout << "So luong phan tu: ";
    cin >> n;
    a = new double [n];
    for (int i = 0; i < n; i++){
        cin >> *(a + i);
    }
}

void OutputArr(double *a, int n)
{
    for (int i = 0; i < n; i++){
        cout << *(a + i) << " ";
    }
    cout << endl;
}

double* NoiArr(double *a, int n, double *b, int m, int k)
{
    double *tmp = new double [k];
    for (int i = 0; i < k; i++){
        if (i < n)
            *(tmp + i) = *(a + i);
        else if (i < k)
            *(tmp + i) = *(b + (m - (k - i)));
    }
    return tmp;
}

void MergeSort(double *a, int n, int l, int r)
{
    if (l < r){
        int m = (l + r)/ 2;
        MergeSort(a, n, l, m);
        MergeSort(a, n, m + 1, r);
        Merge(a, n, l, m, r);
    }
}

void Merge(double *a, int n, int l, int m, int r)
{
    double *tmp = new double [n];
    int i = l;
    int j = m + 1;
    int k = 0;

    while ((i <= m) && (j <= r)){
        if (*(a + i) < *(a + j))
            *(tmp + (k++)) = *(a + (i++));
        else
            *(tmp + (k++)) = *(a + (j++));
    }
    while (i <= m)
        *(tmp + (k++)) = *(a + (i++));
    while (j <= r)
        *(tmp + (k++)) = *(a + (j++));

    for (i = l, k = 0; i <= r; i++, k++)
        *(a + i) = *(tmp + k);
}

double* NoiTang(double *a, int n, double *b, int m, int k)
{
    int i, idxA, idxB;
    i = idxA = idxB = 0;
    double *tmp = new double [k];

    while (idxA < n && idxB < m){
        if (*(a + idxA) < *(b + idxB))
            *(tmp + (i++)) = *(a + (idxA++));
        else
            *(tmp + (i++)) = *(b + (idxB++));
    }
    while (idxA >= n && idxB < m)
        *(tmp + (i++)) = *(b + (idxB++));
    while (idxB >= m && idxA < n)
        *(tmp + (i++)) = *(a + (idxA++));

    return tmp;
}