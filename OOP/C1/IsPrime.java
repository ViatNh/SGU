package OOP.C1;
import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int num = sc.nextInt();
        System.out.println("So nguyen to nho hon n: ");
        for (int i = 2; i < num; i++)
            if (isPrime(i))
                System.out.printf("%d ", i);
    }
}
