#include <stdio.h>
#include <math.h>

int main(void)
{
    printf("Chương trình tìm toạ độ trọng tâm, diện tích đường tròn nội tiếp, diện tích đường tròn ngoại tiếp của tam giác ABC.\n");
    const float PI = 3.14;
    float a, b, c, p, G[2], S, S_noi, S_ngoai;
    int A[2], B[2], C[2];

    // Toạ độ 3 điểm
    printf("Nhập toạ độ điểm A(x,y): ");
    scanf("%d%d", &A[0], &A[1]);
    printf("Nhập toạ độ điểm B(x,y): ");
    scanf("%d%d", &B[0], &B[1]);
    printf("Nhập toạ độ điểm C(x,y): ");
    scanf("%d%d", &C[0], &C[1]);

    // Tính cạnh a, b, c
    a = sqrt(pow(B[0]-C[0],2) + pow(B[1]-C[1],2));
    b = sqrt(pow(A[0]-C[0],2) + pow(A[1]-C[1],2));
    c = sqrt(pow(B[0]-A[0],2) + pow(B[1]-A[1],2));

    // Tính toạ độ trọng tâm
    p = (a+b+c)/2;
    G[0] = (a*A[0] + b*B[0] + c*C[0])/(2*p);
    G[1] = (a*A[1] + b*B[1] + c*C[1])/(2*p);
    printf("Toạ độ trọng tâm: G(%.2f,%.2f)\n", G[0], G[1]);

    // Diện tích tam giác - dùng Heron
    S = sqrt(p*(p-a)*(p-b)*(p-c));

    // Diện tích nội tiếp
    S_noi = PI*pow(S/p,2);
    printf("Diện tích đường tròn nội tiếp: %.2f\n", S_noi);

    // Diện tích ngoại tiếp
    S_ngoai = PI*pow((a*b*c)/(4*S),2);
    printf("Diện tích đường tròn ngoại tiếp: %.2f", S_ngoai);

    return 0;
}