package OOP2.TH1;
import java.util.Scanner;

public class Cau14 {
    public static int sumN(int n) {
        int tong = 0;
        for (; n > 0 ; n -= 2)
            tong += n;
        return tong;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập n: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n <= 0);

        System.out.printf("S(%d) = %d\n", n, sumN(n));

        sc.close();
    }
}
