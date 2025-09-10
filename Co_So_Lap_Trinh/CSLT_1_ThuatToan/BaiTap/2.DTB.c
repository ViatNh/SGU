#include <stdio.h>

int main(void)
{
    printf("Chương trình tính điểm trung bình của học sinh gồm các môn Toán, Lý, Hoá\n");
    float toan, ly, hoa, dtb;

    printf("Điểm Toán, Lý, Hoá lần lượt của bạn là: ");
    scanf("%f%f%f", &toan, &ly, &hoa);
    dtb = (toan + ly + hoa) / 3;
    printf("Điểm trung bình của bạn là: %f", dtb);

    return 0;
}