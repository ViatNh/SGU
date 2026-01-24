#include <iostream>
#include <cmath>
using namespace std;

int InputDT(int *&x, int &n);

int main(void)
{
    int *x;
    int n = 0;

    int x0 = InputDT(x, n);
    int kq = 0;
    
    for (int i = 0; i < n; i++)
    {
        int heso = x[2 * i];
        int luythua = x[2 * i + 1];

        kq += heso * pow(x0, luythua);
    }

    cout << "x = " << x0 << " = " << kq << endl;

    delete x;

    return 0;
}

int InputDT(int *&x, int &n)
{
    cout << "Nhap so luong don thuc: ";
    cin >> n;

    x = new int [2 * n];
    for (int i = 0; i < n; i++){
        cout << "Nhap don thuc thu " << (i + 1) << ": ";
        cin >> x[2 * i] >> x[2 * i + 1];
    }

    int x0;
    cout << "Nhap gia tri x0 can tinh: ";
    cin >> x0;

    return x0;
}