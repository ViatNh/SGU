package OOP2.TH1;
import java.util.Scanner;

/* Viết chương trình nhập vào giá trị ngày/tháng/năm của một ngày trong một năm bất kỳ. Cho biết ngày đó thứ mấy.
Biết rằng công thức tính thứ của một ngày/tháng/năm như sau:
Nếu tháng < 3: tháng = tháng + 12; năm = năm – 1
Nếu tháng >= 3: n = (ngày + 2tháng + (3(tháng + 1)) / 5 + năm + (năm / 4)) % 7
Với n là kết quả thứ theo thứ tự:

0 là Chủ nhật
1 là Thứ 2
...
6 là Thứ 7 */

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--CHƯƠNG TRÌNH TÌM THỨ CỦA MỘT NGÀY BẤT KỲ--");
        System.out.print("Nhập vào một giá trị ngày/tháng/năm: ");
        String inp = sc.nextLine();
        String[] tmp = inp.split("/");
        int day = Integer.parseInt(tmp[0].trim());
        int month = Integer.parseInt(tmp[1].trim());
        int year = Integer.parseInt(tmp[2].trim());

        if (month < 3) {
            month += 12;
            year--;
        }
        else {
            month = month * 2 + ((month + 1) * 3) / 5;
            year += year / 4;
        }

        int n = (day + month + year) % 7;

        switch (n) {
            case 0 -> System.out.printf("%s là ngày Chủ nhật", inp);
            case 1 -> System.out.printf("%s là ngày Thứ 2", inp);
            case 2 -> System.out.printf("%s là ngày Thứ 3", inp);
            case 3 -> System.out.printf("%s là ngày Thứ 4", inp);
            case 4 -> System.out.printf("%s là ngày Thứ 5", inp);
            case 5 -> System.out.printf("%s là ngày Thứ 6", inp);
            case 6 -> System.out.printf("%s là ngày Thứ 7", inp);
        }

        sc.close();
    }
}
