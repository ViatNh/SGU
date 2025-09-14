#include <stdio.h>

int main(void)
{
    printf("Chương trình nhập vào số giây từ 0 đến 86399, đổi số giây nhập vào thành dạng \"gio:phut:giay\".\n");
    int seconds=0, Date[3];
    int Gia_tri_quy_doi[3] = {3600, 60, 1};

    while (seconds<=0 || seconds>86399)
    {
        printf("Nhập vào số giây (0-86399): ");
        scanf("%d", &seconds);
    }

    for (int i=0; i<3; i++)
    {
        Date[i] = seconds / Gia_tri_quy_doi[i];
        seconds -= Date[i] * Gia_tri_quy_doi[i];
    }

    printf("%d:%d:%d", Date[0], Date[1], Date[2]);

    return 0;
}