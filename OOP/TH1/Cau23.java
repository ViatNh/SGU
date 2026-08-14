package OOP.TH1;
import java.util.Scanner;

// Câu 23. Nhập vào 1 ngày tháng năm. Cho biết ngày trước đó và ngày hôm sau là ngày mấy.

public class Cau23 {
    public static boolean nhuanNam(int nam) {
        return ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) ? true : false;
    }
    public static int maxDinM(int thang, int nam) {
        return switch (thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> nhuanNam(nam) ? 29 : 28;
            default -> -1;
        };
    }
    public static boolean isValidDay(int ngay, int thang, int nam) {
        return ngay >= 1 && ngay <= maxDinM(thang, nam);
    }
    public static String findT(int ngay, int thang, int nam) {
        if (ngay == 1) {
            thang--;
            if (thang < 1) {
                nam--;
                thang = 12;
            }
            ngay = maxDinM(thang, nam);
        }
        else ngay--;
        return "%02d/%02d/%d".formatted(ngay, thang, nam);
    }
    public static String findS(int ngay, int thang, int nam) {
        if (ngay == maxDinM(thang, nam)) {
            thang++;
            if (thang > 12) {
                nam++;
                thang = 1;
            }
            ngay = 1;
        }
        else ngay++;
        return "%02d/%02d/%d".formatted(ngay, thang, nam);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inp = new String[3];
        int ngay, thang, nam;
        do {
            System.out.print("Nhap vao ngay/thang/nam: ");
            inp = sc.nextLine().split("/");
            ngay = Integer.parseInt(inp[0].trim());
            thang = Integer.parseInt(inp[1].trim());
            nam = Integer.parseInt(inp[2].trim());
        } while (!isValidDay(ngay, thang, nam));

        System.out.printf("Ngay truoc %02d/%02d/%d la %s\n", ngay, thang, nam, findT(ngay, thang, nam));
        System.out.printf("Ngay sau %02d/%02d/%d la %s", ngay, thang, nam, findS(ngay, thang, nam));
    }
}
