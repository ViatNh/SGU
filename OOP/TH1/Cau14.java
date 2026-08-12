package OOP.TH1;

// Câu 14. Viết chương trình in ra bội số của 3 từ 300 đến 3.

public class Cau14 {
    public static void main(String[] args) {
        System.out.println("Cac boi so cua 3 tu 300 den 3: ");
        for (int i = 300; i >= 3; i -= 3)
            System.out.printf("%d ", i);
    }
}
