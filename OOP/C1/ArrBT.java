package OOP.C1;
import java.util.Scanner;
import java.util.ArrayList;

// Viết chương trình nhập số tự nhiên N, nhập N phần tử của mảng a, xuất kết quả :
//  Các phần tử của mảng a và tổng của chúng
//  Các phần tử chẵn của mảng a và tổng của chúng
//  Các phần tử lẻ của mảng a và tổng của chúng
//  Các phần tử là số nguyên tố của mảng a và tổng của chúng
//  Thêm 1 phần tử mới vào mảng
//  Xoá phần tử thứ k của mảng a
//  nhập 1 số x, kiểm tra x có trong mảng a không, nếu có thì trả về vị trí của x trong mảng a

public class ArrBT {
    // Check
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    // Compute
    public static void sum(ArrayList<Integer> a) {
        int sum = 0;
        System.out.println("Các phần tử của mảng a:");
        for (int x : a) {
            System.out.printf("%d ", x);
            sum += x;
        }
        System.out.println("| Tong: " + sum);
    }
    public static void sumEven(ArrayList<Integer> a) {
        int sum = 0;
        System.out.println("Các phần tử chẵn của mảng a:");
        for (int x : a)
            if (x % 2 == 0) {
                System.out.printf("%d ", x);
                sum += x;
            }
        System.out.println("| Tong: " + sum);
    }
    public static void sumOdd(ArrayList<Integer> a) {
        int sum = 0;
        System.out.println("Các phần tử lẻ của mảng a:");
        for (int x : a)
            if (x % 2 != 0) {
                System.out.printf("%d ", x);
                sum += x;
            }
        System.out.println("| Tong: " + sum);
    }
    public static void sumPrime(ArrayList<Integer> a) {
        int sum = 0;
        System.out.println("Các phần tử số nguyên tố của mảng a:");
        for (int x : a)
            if (isPrime(x)) {
                System.out.printf("%d ", x);
                sum += x;
            }
        System.out.println("| Tong: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so tu nhien N: ");
            n = sc.nextInt();
        } while (n < 0);

        ArrayList<Integer> a = new ArrayList<>();
        System.out.print("Nhập giá trị các phần tử: ");
        for (int i = 0; i < n; i++)
            a.add(sc.nextInt());

        int opt;
        do {
            System.out.print("\n");
            System.out.println(a);
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Them phan tu");
            System.out.println("2. Xoa phan tu");
            System.out.println("3. Các phần tử của mảng a và tổng của chúng");
            System.out.println("4. Các phần tử chẵn của mảng a và tổng của chúng");
            System.out.println("5. Các phần tử lẻ của mảng a và tổng của chúng");
            System.out.println("6. Các phần tử nguyên tố của mảng a và tổng của chúng");
            System.out.println("7. Kiểm tra giá trị (nếu có trả về index)");
            System.out.print("Nhap vao lua chon: ");
            opt = sc.nextInt();

            switch (opt) {
                case 0 -> System.out.println("Da thoat chuong trinh");
                case 1 -> {
                    System.out.print("Nhap gia tri can them: ");
                    a.add(sc.nextInt());
                }
                case 2 -> {
                    if (a.isEmpty())
                        System.out.println("Trong mang khong con phan tu de xoa");
                    else {
                        System.out.print("Nhap index can xoa: ");
                        int tmp = sc.nextInt();
                        if (tmp >= 0 && tmp < a.size())
                            a.remove(tmp);
                        else System.out.println("Index không hợp lệ!");
                    }
                }
                case 3 -> sum(a);
                case 4 -> sumEven(a);
                case 5 -> sumOdd(a);
                case 6 -> sumPrime(a);
                case 7 -> {
                    System.out.print("Nhap giá trị cần tìm: ");
                    int tmp = sc.nextInt();
                    int idx = a.indexOf(tmp);
                    if (idx != -1) 
                        System.out.printf("%d ở index %d\n", tmp, idx);
                    else
                        System.out.printf("%d không tồn tại trong mảng\n", tmp);
                }
                default -> System.out.println("Option không hợp lệ!");
            }
        } while (opt != 0);

        sc.close();
    }
}
