#include <iostream>
#include <string.h>
using namespace std;

struct Node
{
    int val;
    Node* next;
};

struct Stack
{
    Node* top = nullptr;

    bool isEmpty(){
        return top == nullptr;
    }

    void push(int x){
        Node* newNode = new Node();
        newNode->val = x;
        newNode->next = top;
        top = newNode;
    }

    int pop(){
        if (isEmpty()) return 0;
        int value = top->val;
        Node* tmp = top;
        top = top->next;
        delete tmp;
        return value;
    }
};

string Nhap(string dathuc);
void TachDT(Stack &num, Stack &operand, string dathuc);

int main(void)
{
    // cout << toascii('+') << endl; // 43
    // cout << toascii('-') << endl; // 45
    // cout << toascii('x') << endl; // 120
    // cout << toascii(':') << endl; // 58
    // cout << toascii('(') << endl; // 40
    // cout << toascii(')') << endl; // 41
    string dathuc;
    dathuc = Nhap(dathuc);
    // cout << dathuc << endl;
    Stack num, operand;


    return 0;
}

string Nhap(string dathuc)
{
    cout << "Nhap da thuc: ";
    fflush(stdin);
    getline(cin, dathuc);
    return dathuc;
}

void TachDT(Stack &num, Stack &operand, string dathuc)
{
    int flag = 0;
    for (int i = 0; i < dathuc.length(); i++){
        if ()
    }
}