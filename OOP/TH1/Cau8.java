package OOP.TH1;

// Câu 8. Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng lặp for hoặc while)

public class Cau8 {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        while (count < 10) {
            System.out.printf("%d ", i);
            count++;
            i += 2;
        }
    }
}
