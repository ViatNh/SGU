#include <stdio.h>

int main(void)
{
    printf("Chương trình đổi từ Độ sang Radian hoặc từ Radian sang Độ\n");
    const float PI = 3.14;
    int chose, degree;
    float radian;

    printf("Vui lòng chọn\n1: Độ sang Radian\n2: Radian sang Độ \n");
    scanf("%d", &chose);
    switch (chose)
    {
        case 1:
            printf("Vui lòng nhập số Độ: ");
            scanf("%d", &degree);
            radian = degree * PI / 180;
            printf("Kết quả: %d Độ = %.2f Radian", degree, radian);
            break;
        case 2:
            printf("Vui lòng nhập số Radian: ");
            scanf("%f", &radian);
            degree = radian * 180 / PI;
            printf("Kết quả: %.2f Radian = %d Độ", radian, degree);
            break;
        default:
            printf("Vui lòng chỉ chọn 1 hoặc 2");
    }

    return 0;
}