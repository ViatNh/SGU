package OOP.C1;
import java.util.Scanner;

public class SwitchCase {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();

        // switch (day) {
        //     case 0:
        //         System.out.println("Chu nhat");
        //         break;
        //     case 1:
        //         System.out.println("Thu 2");
        //         break;
        //     case 2:
        //         System.out.println("Thu 3");
        //         break;
        //     case 3:
        //         System.out.println("Thu 4");
        //         break;
        //     case 4:
        //         System.out.println("Thu 5");
        //         break;
        //     case 5:
        //         System.out.println("Thu 6");
        //         break;
        //     case 6:
        //         System.out.println("Thu 7");
        //         break;
        //     default:
        //         System.out.println("Loi!");
        //}

        // Pro VIP version
        String dayName = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Loi!";
        };
        System.out.println(dayName);
    }
}
