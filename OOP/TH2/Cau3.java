package OOP.TH2;
import java.util.StringTokenizer;

// Viết hàm tách chuỗi gốc thành chuỗi khác (dùng StringTokenizer).
// VD: chuỗi gốc S = “Bai Tap Mon Lap Trinh Java”, chuỗi sau khi tách là
// “Bai
// Tap
// Mon
// Lap
// Trinh
// Java”

public class Cau3 {
    public static void main(String[] args) {
        String s = "Bai Tap Mon Lap Trinh Java";

        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}