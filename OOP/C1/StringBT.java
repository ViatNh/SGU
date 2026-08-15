package OOP.C1;
import java.util.Scanner;

// Viết chương trình nhập chuỗi s, xuất kết quả:
//  Độ dài của s
//  Xoá bỏ khoảng trắng thừa của s
//  Đếm số từ của s và xuất mỗi từ nằm trên 1 dòng
//  nhập số tự nhiên k, xuất k ký tự bên trái của s, k kí tự bên phải của s
//  nhập số tự nhiên k, n, xuất n kí tự của s kể từ vị trí k

public class StringBT {
    public static void bla1(Scanner sc, String s) {
        int k;
        int lenS = s.length();
        do {
            System.out.print("\nNhập một số tự nhiên: ");
            k = sc.nextInt();
        } while (k < 0 || k > lenS);
        if (k == 0) return;

        System.out.println(k + " ký tự bên trái của chuỗi: " + s.substring(0, k));
        System.out.println(k + " ký tự bên phải của chuỗi: " + s.substring(lenS - k, lenS));
    }
    public static void bla2(Scanner sc, String s) {
        int k, n;
        int lenS = s.length();
        do {
            System.out.print("\nNhập hai số tự nhiên k và n: ");
            k = sc.nextInt();
            n = sc.nextInt();
        } while (k < 0 || n < 0 || k > lenS || k + n > lenS);

        System.out.printf("%d kí tự của chuỗi kể từ vị trí %d: %s", n, k, s.substring(k, k + n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();

        System.out.println("Độ dài của chuỗi là " + s.length());

        s = s.trim().replaceAll("\\s+", " ");
        System.out.println("Đã xóa bỏ khoảng trắng thừa của chuỗi: " + s);

        String[] st = s.split(" ");
        System.out.printf("Chuỗi có %d từ\n", st.length);
        for (String x : st) System.out.println(x);

        bla1(sc, s);
        bla2(sc, s);

        sc.close();
    }
}
