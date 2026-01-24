#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

// Random (long) Num
long randNum();
// Tim UCLN cua 2 so nguyen duong
long UCLN(long a, long b);
// Doi he co so thap phan sang he co so B
double Decimal_to_B(double b, int B[]);

int main(void)
{
    // a)
    srand(time(NULL));
    long a = randNum();
    long b = randNum();
    printf("%ld %ld\n", a, b);
    printf("%ld", UCLN(a, b));

    // b)
    int B[] = {2, 8, 10, 16}; // He co so



    return 0;
}

long randNum()
{
    long tmp = 0;
    while (!tmp)
        tmp = (long)rand() * sqrt(rand());
    return tmp % 1000000 + 1;
}

long UCLN(long a, long b)
{
    if (a % b == 0)
        return b;
    return UCLN(b, a % b);
}

void Decimal_to_B()
{
    int tmp = 0;
    do{
        printf("\n(2) Nhi phan");
        printf("\n(8)Bat phan");
        printf("\n(16)Thap luc phan");
        printf("\nDoi (10)Thap phan sang ");
        scanf("%d", &tmp);
    } while (!tmp);
    
    switch (tmp){
        case 2:
        {
            int idx = 0;
            
        }
    }
    
}