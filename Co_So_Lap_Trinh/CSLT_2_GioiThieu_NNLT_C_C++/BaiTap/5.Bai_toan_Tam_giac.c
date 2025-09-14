#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình tính chu vi, diện tích, đường cao của tam giác.\n");
    float a, b, c, p, C, S, h;
    int is_Triangle = 0;

    // Xác định xem có phải là tam giác không?
    while (!is_Triangle)
    {
        printf("Vui lòng nhập số đo 3 cạnh của tam giác: ");
        scanf("%f%f%f", &a, &b, &c);
        is_Triangle = (a+b>c) && (a+c>b) && (b+c>a)?1:0;
    }
    
    // Tính chu vi, diện tích, đường cao
    p = (a+b+c)/2;
    C = p*2;
    S = sqrt(p*(p-a)*(p-b)*(p-c)); // Công thức Heron
    h = 2*S/a;

    printf("Tam giác có:\n");
    printf("Chu vi: %.2f\n", C);
    printf("Diện tích: %.2f\n", S);
    printf("Đường cao: %.2f", h);

    return 0;
}