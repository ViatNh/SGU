#include <iostream>
using namespace std;

void InputArr(int *&a, int &n);
void OutputArr(int *a, int n);

int main(void)
{
    int *A;
    int n = 0;
    InputArr(A, n);
    OutputArr(A, n);

    delete[] A;
    return 0;
}

void InputArr(int *&a, int &n)
{
    int tmp;
    cin >> tmp;
    if (tmp == -1){
        n--;
        return;
    }
    if (n < 1)
        a = new int [++n];
    else
        a = (int *)realloc(a, n * sizeof(int));
    *(a + (n - 1)) = tmp;
    InputArr(a, ++n);
}

void OutputArr(int *a, int n)
{
    for (int i = 0; i < n; i++){
        cout << *(a + i) << " ";
    }
    cout << endl;
}