package OOP.TH1;
import java.util.Scanner;

// Câu 16. Viết chương trình nhập vào số nguyên n và 
// thực hiện in ra màn hình n số Fibonaxi đầu tiên, biết:
//Fibo(n) = {                         1 nếu n ≤ 2
//            Fibo(n − 1) + Fibo(n − 2) nếu n > 2

public class Cau16 {
    public static long[] Fib(int n) {
        long[] dp = new long[n];

        if (n >= 1) dp[0] = 0;
        if (n >= 2) dp[1] = 1;

        if (n <= 2) return dp;

        for (int i = 2; i < n; ++i)
            dp[i] = dp[i - 1] + dp[i- 2];
        
        return dp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap vao so nguyen N: ");
            n = sc.nextInt();
        } while (n <= 0);
        
        long[] fib = Fib(n);
        for (long x : fib)
            System.out.printf("%d ", x);
    }
}