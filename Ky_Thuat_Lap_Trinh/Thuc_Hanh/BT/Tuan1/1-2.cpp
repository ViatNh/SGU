#include <iostream>
using namespace std;

void InputArr(int *&a, int &n);
void OutputArr(int *a, int n);
void MergeSort(int *a, int n, int l, int r);
void Merge(int *a, int n, int l, int m, int r);

int main(void)
{
    int *a, n;
    InputArr(a, n);
    OutputArr(a, n);
    MergeSort(a, n, 0, n - 1);
    cout << "Gia tri lon nhat: " << *(a + (n -1)) << endl;
    cout << "Gia tri lon nhi: " << *(a + (n - 2)) << endl;
    cout << "Sap xep tang: ";
    OutputArr(a, n);

    delete[] a;
    return 0;
}

void InputArr(int *&a, int &n)
{
    cout << "So luong phan tu: ";
    cin >> n;
    a = new int [n];
    for (int i = 0; i < n; i++){
        cin >> *(a + i);
    }
}

void OutputArr(int *a, int n)
{
    for (int i = 0; i < n; i++){
        cout << *(a + i) << " ";
    }
    cout << endl;
}

void MergeSort(int *a, int n, int l, int r)
{
    if (l < r){
        int m = (l + r)/ 2;
        MergeSort(a, n, l, m);
        MergeSort(a, n, m + 1, r);
        Merge(a, n, l, m, r);
    }
}

void Merge(int *a, int n, int l, int m, int r)
{
    int *tmp = new int [n];
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