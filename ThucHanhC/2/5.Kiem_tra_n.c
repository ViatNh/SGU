#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
    printf("Chuong trinh kiem tra so nguyen duong n\n");
    unsigned int n;
    int chose;

    do
    {
        printf("\n\n-----\n");
        printf("1. Kiem tra so nguyen to\n");
        printf("2. Kiem tra so hoan chinh\n");
        printf("3. Kiem tra so can xung\n");
        printf("4. Tim so dao nguoc\n");
        printf("5. Kiem tra so Armstrong\n");
        printf("6. Dem xuc xac\n");
        printf("Vui long chon: ");
        scanf("%d", &chose);

        if (chose >= 1 && chose <= 6)
        {
            printf("Nhap so nguyen duong n: ");
            scanf("%d", &n);
        }

        printf("\n\n");
        switch (chose)
        {
            case 1:
                int is_SNT = 1;
                if (n < 2) is_SNT = 0;
                for (int i = 2; i <= sqrt(n); i++)
                {
                    if (n % i == 0)
                    {
                        is_SNT = 0;
                        break;
                    }
                }
                if (is_SNT)
                    printf("a) %d la so nguyen to", n);
                else
                    printf("a) %d khong phai la so nguyen to", n);
                n = 0;
                break;
        
            case 2:
                int s = 0;
                for (int i = 1; i < n; i++)
                {
                    if (n % i == 0)
                        s += i;
                }
                if (s == n)
                    printf("b) %d la so hoan chinh", n);
                else
                    printf("b) %d khong phai la so hoan chinh", n);
                n = 0;
                break;

            case 3:
                int cx = 0;
                int temp = n;
                for (; temp > 0; temp /= 10)
                {
                    int a = temp % 10;
                    cx = cx * 10 + a;
                }
                if (cx == n)
                    printf("%d la so can xung", n);
                else
                    printf("%d khong phai la so can xung", n);
                n = 0;
                break;

            case 4:
                int d = 0;
                int temp4 = n;
                for (; temp4 > 0; temp4 /= 10)
                {
                    int a = temp4 % 10;
                    d = d * 10 + a;
                }
                printf("So dao nguoc cua %d la %d", n, d);
                n = 0;
                break;
            
            case 5:
                int i, sum = 0;
                int temp2, temp3;
                temp2 = temp3 = n;
                for (i = 0; temp2 > 0; temp2 /= 10, i++);
                for (; temp3 > 0; temp3 /= 10)
                {
                    sum += pow(temp3 % 10, i);
                }
                if (sum == n)
                    printf("%d la so Armstrong", n);
                else
                    printf("%d khong phai la so Armstrong", n);
                n = 0;
                break;

            case 6:
                int dem1, dem2, dem3, dem4, dem5, dem6;
                dem1 = dem2 = dem3 = dem4 = dem5 = dem6 = 0;
                for (int i = 1; i <= n; i++)
                {
                    int xucxac = 1 + rand() % (6);
                    printf("Xuc xac lan %d: %d\n", i, xucxac);
                    switch (xucxac)
                    {
                        case 1:
                            dem1++;
                            break;
                        case 2:
                            dem2++;
                            break;
                        case 3:
                            dem3++;
                            break;
                        case 4:
                            dem4++;
                            break;
                        case 5:
                            dem5++;
                            break;
                        case 6:
                            dem6++;
                            break;
                    }
                }
                printf("So lan xuat hien nut: \n");
                printf("1: %d\n", dem1);
                printf("2: %d\n", dem2);
                printf("3: %d\n", dem3);
                printf("4: %d\n", dem4);
                printf("5: %d\n", dem5);
                printf("6: %d", dem6);
                n = 0;
                break;

            default:
                n = 100;
                printf("Lua chon khong hop le va dang thoat chuong trinh");
        }
    } while (n <= 0);

    

    return 0;
}