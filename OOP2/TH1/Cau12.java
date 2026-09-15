package OOP2.TH1;

// Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100).
// m là 7, n là bội số cần tìm 

public class Cau12 {
    public static int tongBoiSo(int from, int to, int m) {
        int tong = 0;
        while (from % m != 0) from++;
        for (; from <= to; from += m) {
            tong += from;
        }
        return tong;
    }

    public static void main(String[] args) {
        int m = 7;
        int from = 1;
        int to = 100;

        System.out.printf("Tổng các số là bội số của %d (từ %d đến %d): %d", m, from, to, tongBoiSo(from, to, m));
    }
}
