package OOP2.TH1;

import java.util.Scanner;

// Viết chương trình nhập số nguyên n. Kiểm tra n có phải là số nguyên tố hay không?

public class Cau10 {
    public static String isPrime(int n) {
        if (n < 2) return " không phải số nguyên tố";
        for (int i = 2; i * i <= n; i++)
            if (n % 2 == 0) return " không phải số nguyên tố";
        return " là số nguyên tố";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so nguyen n: ");
        int n = sc.nextInt();
        System.out.println(n + isPrime(n));

        sc.close();
    }
}
