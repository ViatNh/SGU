#include <stdio.h>
#include <math.h>

int is_Prime(int num); // Kiem tra so nguyen to
void is_SoHH(int num); // Kiem tra so hoan hao
void is_SoDX(int num); // Kiem tra so doi xung

int TongChuso(int num); // Tinh tong cac chu so
int DemUoc(int num); // Dem so uoc cua mot so

int main(void)
{
    int num;
    printf("Nhap vao gia tri so nguyen bat ky: ");
    scanf("%d", &num);

    if (is_Prime(num))
        printf("So %d la so nguyen to", num);
    else
        printf("So %d khong phai la so nguyen to", num);

    printf("\n"); // Xuong dong

    is_SoHH(num);

    printf("\n"); // Xuong dong

    is_SoDX(num);

    printf("\nTong cac chu so cua %d la: %d", num, TongChuso(num));

    printf("\nSo %d co tat ca %d uoc", num, DemUoc(num));

    return 0;
}

int is_Prime(int num)
{
    if (num < 2)
        return 0;
    for (int i = 2; i <= sqrt(num); i++){
        if (!(num % i))
            return 0;
    }
    return 1;
}

void is_SoHH(int num)
{
    int tongUoc = 0;

    for (int i = 1; i < num; i++){
        if (num % i)
            tongUoc += i;
    }
    
    if (tongUoc == num)
        printf("So %d la so hoan hao", num);
    else
        printf("So %d khong phai la so hoan hao", num);
}

void is_SoDX(int num)
{
    int tmp = num;
    int dx = 0;

    for  (; tmp > 0; tmp /= 10){
        dx = (dx * 10) + (tmp % 10);
    }

    if (dx == num)
        printf("So %d la so doi xung", num);
    else
        printf("So %d khong phai la so doi xung", num);
}

int TongChuso(int num)
{
    if (num > 0)
        return (num % 10) + TongChuso(num / 10);
}

int DemUoc(int num)
{
    int count = 0;
    for (int i = 1; i <= num; i++){
        if (!(num % i))
            count++;
    }
    return count;
}