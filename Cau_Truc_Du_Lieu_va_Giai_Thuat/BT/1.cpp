#include <iostream>
using namespace std;

// 8 nodes 11 5 7 4 3 6 2 7

// 1 2 5 3 4
// tb: 15/5=3
// kq: 3

struct node
{
    int val;
    node *next;
};
struct list
{
    node *head, *tail;
};
list l;

node *getNode(int x);
void listProcess(list l);
void insertHead(list &l, node *p);
void insertTail(list &l, node *p);
void ListInsertHead(list &l);
void ListInsertTail(list &l);
int search(list l, int x);
void swap(int &a, int &b);
void ListInterchangeSort(list l);


int main(void)
{
    ListInsertTail(l);    
    ListInterchangeSort(l);
    listProcess(l);

    return 0;
}

node *getNode(int x)
{
    node *p = new node;
    if (p == NULL)
        exit(1);
    p->val = x;
    p->next = NULL;
    return p;
}

void insertHead(list &l, node *p)
{
    if (l.head == NULL)
    {
        l.head = p;
        l.tail = p;
    }
    else
    {
        p->next = l.head;
        l.head = p;
    }
}

void insertTail(list &l, node *p)
{
    if (l.head == NULL)
    {
        l.head = p;
        l.tail = p;
    }
    else
    {
        l.tail->next = p;
        l.tail = p;
    }
}

void ListInsertHead(list &l)
{
    int x, n;
    cout << "Enter amount node: ";
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cin >> x;
        insertHead(l, getNode(x));
    }
}

void ListInsertTail(list &l)
{
    int x, n;
    cout << "Enter amount node: ";
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cin >> x;
        insertTail(l, getNode(x));
    }
}

void listProcess(list l)
{
    for (node *p = l.head; p != NULL; p = p->next)
        cout << p->val << " ";
}

int search(list l, int x)
{
    for (node *p = l.head; p != NULL; p = p->next)
        if (p->val == x)
            return 1;
    return 0;
}

void swap(int &a, int &b)
{
    a = a + b;
    b = a - b;
    a = a - b;
}

void ListInterchangeSort(list l)
{
    for (node *p = l.head; p->next != NULL; p = p->next)
        for (node *q = p->next; q != NULL; q = q->next)
            if (p->val < q->val)
                swap(p->val, q->val);
}