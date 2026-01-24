#include <iostream>
#include <string.h>
using namespace std;

void Nhap(string &s);
void Xuat(string s);
void DemDang(string s, int &hoa, int &thuong);
void toASCII(string s);
void Focus(string &s);
int DemTu(string s);
void demKytu(string s);
string LayDau(string s);
string LayCuoi(string s);

int main(void)
{
    string s;
    // Nhap chuoi
    Nhap(s);
    Xuat(s);
    cout << endl;

    // a) Dem so luong ky tu viet hoa, thuong
    int hoa, thuong;
    hoa = thuong = 0;
    DemDang(s, hoa, thuong);
    cout << "Co " << hoa << " ky tu hoa" << endl;
    cout << "Co " << thuong << " ky tu thuong" << endl;
    cout << endl;

    // b) Ma ASCII cua moi ky tu
    toASCII(s);
    cout << endl << endl;

    // c) Ky tu Hoa dau
    Focus(s);
    Xuat(s);
    cout << endl;

    // d) Dem so luong tu
    cout << "So luong tu trong chuoi: " << DemTu(s) << endl;
    cout << endl;

    // e) Dem ky tu trong chu
    cout << "So luong ky tu trong moi chu: ";
    demKytu(s);
    cout << endl;

    // f) Lay tu dau chuoi
    cout << "Chu dau trong chuoi: " << LayDau(s) << endl;
    cout << "Chu cuoi trong chuoi: " << LayCuoi(s) << endl;
    cout << endl;

    return 0;
}

void Nhap(string &s)
{
    getline(cin, s);
}

void Xuat(string s)
{
    for (int i = 0; i < s.length(); i++){
        cout << s[i];
    }
    cout << endl;
}

void DemDang(string s, int &hoa, int &thuong)
{
    for (int i = 0; i < s.length(); i++){
        if (s[i] >= 'a' && s[i] <= 'z')
            thuong++;
        else if (s[i] >= 'A' && s[i] <= 'Z')
            hoa++;
    }
}

void toASCII(string s)
{
    for (int i = 0; i < s.length(); i++){
        if (s[i] == ' ')
            cout << endl;
        else
            cout << s[i] << "-" << toascii(s[i]) << " ";
    }
}

void Focus(string &s)
{
    int flag = 1;
    for (int i = 0; i < s.length(); i++){
        if (flag == 1){
            s[i] = toupper(s[i]);
            flag = 0;
        }
        else
            s[i] = tolower(s[i]);

        if (s[i] == ' ')
            flag = 1;
    }
}

int DemTu(string s)
{
    int dem = 1;
    for (int i = 0; i < s.length(); i++){
        if (s[i] == ' ')
            dem++;
    }
    return dem;
}

void demKytu(string s)
{
    int dem = 0;
    for (int i = 0; i < s.length(); i++){
        if (s[i] == ' '){
            cout << dem << " ";
            dem = 0;
        }
        else
            dem++;
    }
    cout << dem << endl;
}

string LayDau(string s)
{
    string tmp;
    for (int i = 0; i < s.length(); i++){
        if (s[i] == ' ')
            return tmp;
        tmp += s[i];
    }
}

string LayCuoi(string s)
{
    string tmp;
    for (int i = s.length() - 1; i >= 0; i--){
        if (s[i] == ' '){
            for (int k = i + 1; k < s.length(); k++)
                tmp += s[k];
            return tmp;
        }
    }
}