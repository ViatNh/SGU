package OOP.C1;
import java.util.Scanner;

public class Condition {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.printf("%d chia het cho 5", num);
        }
        else {
            System.out.printf("%d khong chia het cho 5", num);
        }
    }
}
