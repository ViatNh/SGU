package OOP2.TH1;

// Viết chương trình in ra bội số của 3 từ 300 đến 3.

public class Cau16 {
    public static void boiSo(int from, int to, int m) {
        while (from % m != 0) from++;
        for (; from >= to; from -= 3)
            System.out.printf(from + " ");
    }

    public static void main(String[] args) {
        int m = 3;
        int from = 300;
        int to = 3;

        System.out.printf("Bội số của %d từ %d đến %d:\n", m, from, to);
        boiSo(from, to, m);
    }
}
