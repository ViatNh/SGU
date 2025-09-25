#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình nhập vào số nguyên dương n và tính các tổng\n");
    unsigned int n, giai_thua;
    float S[6] = {0,0,0,0,0,1};

    printf("Nhập vào số nguyên dương n: ");
    scanf("%d", &n);

    for (int i=1; i<=n; i++)
    {
        S[0] += pow(i,3);
        S[1] += pow(i,2);
        S[2] += 1.0/i;
        S[3] += 1.0/(i*(i+1));
        giai_thua = 1;
        for (int j=i; j>0; j--)
        {
            giai_thua *= j;
        }
        S[4] += giai_thua;
        S[5] += pow(2,i);
    }

    printf("S1 = %.2f\nS2 = %.2f\nS3 = %.2f\nS4 = %.2f\nS5 = %.2f\nS6 = %.2f", S[0], S[1], S[2], S[3], S[4], S[5]);

    return 0;
}