package OOP.TH1;

// Câu 10. Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100)

public class Cau10 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 7 == 0) s += i;
        System.out.println("Tong cac so la boi so cua 7: " + s);
    }
}
