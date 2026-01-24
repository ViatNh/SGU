#include <iostream>
using namespace std;

struct Diem
{
    float coban;
    float cn1;
    float cn2;
};

struct ThiSinh
{
    string MSSV;
    string HoTen;
    Diem diem;
};

void Nhap(ThiSinh ts[], int &n);

int main(void)
{
    ThiSinh ts[100];
    int n;
    Nhap(ts, n);

    return 0;
}

void Nhap(ThiSinh ts[], int &n)
{
    cout << "So luong thi sinh can nhap: ";
    cin >> n;
    for (int i = 0; i < n; i++){
        cout << "Thi sinh thu " << i + 1 << endl;
        cout << "Ma so sinh vien: ";
        cin >> ts[i].MSSV;
        cout << "Ho va Ten: ";
        fflush(stdin);
        gets(ts[i].HoTen);
    }
}

