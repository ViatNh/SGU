package OOP2.TH1;
import java.util.Scanner;

public class bt {
    public static boolean isNamNhuan(int year) {
        return ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0);
    }

    public static int soNgay(int month, int year) {
        int soNgay = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> soNgay = 31;
            case 4, 6, 9, 11 -> soNgay = 30;
            case 2 -> {
                if (isNamNhuan(year)) soNgay = 29;
                else soNgay = 28;
            }
            default -> soNgay = -1;
        }
        return soNgay;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tháng: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập năm: ");
        int year = Integer.parseInt(sc.nextLine());

        System.out.printf("%02d/%04d có %d ngày", month, year, soNgay(month, year));

        sc.close();
    }
}
