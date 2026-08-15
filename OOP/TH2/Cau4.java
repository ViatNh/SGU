package OOP.TH2;

// Viết chương trình in ra số lần kí tự ‘a’ xuất hiện trong một chuỗi.

public class Cau4 {
    public static void main(String[] args) {
        String s = "Bai Tap Mon Lap Trinh Java";

        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == 'a') count++;
        System.out.println("Số lần kí tự ‘a’ xuất hiện trong một chuỗi: " + count);
    }
}
