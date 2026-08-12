package OOP.C1;
import java.util.Scanner;

// Viết chương trình nhập và 
// in mảng 1 chiều gồm n phần tử các số nguyên. 
// In ra tổng các phần tử có giá trị chẵn của mảng.

public class ArrExample {
    public static int[] inputArr(Scanner sc, int n) {
        int[] a = new int[n];
        System.out.print("Nhap gia tri cho mang: ");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        return a;
    }

    public static void outputArr(int[] a) {
        for (int x : a)
            System.out.printf("%d ", x);
        System.out.print("\n\n");
    }

    public static int sumEven(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++)
            if (a[i] % 2 == 0)
                s += a[i];
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Elements: ");
        int n = sc.nextInt();
        int[] integerArr = inputArr(sc, n);

        System.out.print("\nMang: ");
        outputArr(integerArr);

        System.out.print("Tong cac so chan trong mang: " + sumEven(integerArr));
    }
}
