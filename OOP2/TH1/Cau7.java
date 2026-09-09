package OOP2.TH1;
import java.util.Scanner;

// Nhập vào 1 ngày tháng năm. Cho biết ngày trước đó và ngày hôm sau là ngày nào.

public class Cau7 {
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
    public static int isValidMonth(int month) {
        if (month < 1) return 1;
        else if (month > 12) return 12;
        return month;
    }
    public static int isValidDay(int day, int month, int year) {
        int maxDay = getMaxDay(month, year);
        if (day < 1) return 1;
        else if (day > maxDay) return maxDay;
        return day;
    }

    public static int getMaxDay(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> -1;
        };
    }
    public static String getPreviousDay(int day, int month, int year) {
        if (day <= 1) {
            if (month == 1) {
                day = getMaxDay(month = 12, --year);
            } else {
                day = getMaxDay(--month, year);
            }
        } else day--;

        return "%02d/%02d/%04d"
        .formatted(day, month, year);
    }
    public static String getNextDay(int day, int month, int year) {
        if (day >= getMaxDay(month, year)) {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        } else day++;

        return "%02d/%02d/%04d"
        .formatted(day, month, year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--CHƯƠNG TRÌNH TÌM NGÀY LIỀN KỀ TRƯỚC VÀ SAU CỦA MỘT NGÀY BẤT KỲ--");

        System.out.print("Nhập vào một giá trị ngày/tháng/năm: ");
        String inp = sc.nextLine();
        String[] tmp = inp.split("/");
        int day = Integer.parseInt(tmp[0]);
        int month = Integer.parseInt(tmp[1]);
        int year = Integer.parseInt(tmp[2]);
        
        month = isValidMonth(month);
        day = isValidDay(day, month, year);

        System.out.printf("Ngày trước: %s\n", getPreviousDay(day, month, year));
        System.out.printf("Ngày sau: %s\n", getNextDay(day, month, year));

        sc.close();
    }
}
