#include <iostream>
using namespace std;
#include <math.h>

void Nhap(int *&a, int &n);
void Xuat(int *a, int n);
void XoaPT(int *&a, int &n, int k);
void ChenPT(int *&a, int &n);
int is_prime(int a);
void XoaSNT(int *&a, int &n);

int main(void)
{
    int *a, n;
    Nhap(a, n);
    Xuat(a, n);
    // XoaPT(a, n, 0);
    // Xuat(a, n);
    // ChenPT(a, n);
    // Xuat(a, n);
    // XoaSNT(a, n);
    // Xuat(a, n);

    return 0;
}

void Nhap(int *&a, int &n)
{
    cout << "Nhap vao so luong phan tu cua mang: ";
    cin >> n;
    a = new int [n];
    for (int i = 0; i < n; i++){
        cin >> *(a + i);
    }
}

void Xuat(int *a, int n)
{
    for (int i = 0; i < n; i++){
        cout << *(a + i) << " ";
    }
    cout << endl;
}

void XoaPT(int *&a, int &n, int k)
{
    for (int i = k; i < n; i++){
        *(a + i) = *(a + i + 1);
    }
    n--;
}

void ChenPT(int *&a, int &n)
{
    int x, k;
    cout << "Nhap so nguyen x va vi tri k: ";
    cin >> x >> k;
    n++;
    for (int i = n; i >= k; i--){
        *(a + i + 1) = *(a + i);
    }
    *(a + k) = x;
}

int is_prime(int a)
{
    if (a < 2) return 0;
    for (int i = 2; i <= sqrt(a); i++){
        if (a % i == 0)
            return 0;
    }
    return 1;
}

void XoaSNT(int *&a, int &n)
{
    for (int i = 0; i < n; i++){
        if (is_prime(*(a + i))){
            XoaPT(a, n, i);
            i--;
        }
    }
}