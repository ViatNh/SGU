#include <stdio.h>

int main(void)
{
    printf("Chuong trinh dem chan le cua so nguyen duong n\n");
    unsigned int n, dem_le, dem_chan;
    int Le = []

    printf("Vui long nhap vao so nguyen duong n: ");
    scanf("%d", &n);

    for (int i = 0; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            dem_chan += 1;
            Chan[i] = i;
        }
        else
        {
            dem_le += 1;
            Le[i] = i;
        }
    }

    printf("%d co %d chu so le: ", n, dem_le, Le);
    for ()
    printf("%d co %d chu so chan: %d", n, dem_chan, Chan);

    return 0;
}