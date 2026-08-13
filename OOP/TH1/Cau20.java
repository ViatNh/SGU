package OOP.TH1;
import java.util.Scanner;

// Viết chương trình nhập vào giá ngày/tháng/năm của một ngày trong một năm
// bất kỳ. Cho biết ngày đó thứ mấy. Biết rằng công thức tính thứ của một ngày/tháng/năm
// như sau:
// Tháng < 3: tháng = tháng + 12; năm = năm – 1
// Tháng >= 3:
// n = (ngày+2*tháng+(3*(tháng+1))/5 + năm + (năm / 4)) %7
// với n là kết quả thứ theo thứ tự: 0 là chủ nhật, 1 là thứ 2, ..., 6 là thứ 7.

public class Cau20 {
    public static String timThu(int ngay, int thang, int nam) {
        if (thang < 3) {
            thang += 12;
            nam -= 1;
        }
        int n = (ngay + 2*thang + (3 * (thang + 1)) /5 + nam + (nam / 4)) % 7;
        switch (n) {
            case 0:
                return "Chu nhat";
            case 1:
                return "Thu 2";
            case 2:
                return "Thu 3";
            case 3:
                return "Thu 4";
            case 4:
                return "Thu 5";
            case 5:
                return "Thu 6";
            case 6:
                return "Thu 7";
        }
        return "bla bla";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inp = new String[3];

        do {
            System.out.print("Nhap ngay/thang/nam: ");
            inp = sc.nextLine().split("/");
        } while (inp.length < 3);
        int ngay = Integer.parseInt(inp[0]);
        int thang = Integer.parseInt(inp[1]);
        int nam = Integer.parseInt(inp[2]);

        System.out.println(timThu(ngay, thang, nam));
    }
}
