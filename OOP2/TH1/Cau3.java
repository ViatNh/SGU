package OOP2.TH1;
import java.util.Scanner;

// Viết chương trình nhập vào họ tên, điểm toán, điểm lý, điểm hóa, quê quán của 1 sinh viên. Xuất ra màn hình các thông tin vừa nhập và tính điểm trung bình cho sinh viên.

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Họ tên: ");
        String hoten = sc.nextLine();
        System.out.print("Điểm toán: ");
        float diemToan = Integer.parseInt(sc.nextLine());
        System.out.print("Điểm lý: ");
        float diemLy = Integer.parseInt(sc.nextLine());
        System.out.print("Điểm hóa: ");
        float diemHoa = Integer.parseInt(sc.nextLine());
        System.out.print("Quê quán: ");
        String queQuan = sc.nextLine();

        System.out.printf("%-25s %9s %9s %9s %9s %-30s\n", 
            "Họ tên", "Điểm Toán", "Điểm Lý", "Điểm Hóa", "DTB", "Quê quán"
        );
        System.out.printf("%-25s %9.2f %9.2f %9.2f %9.2f %-30s\n", 
            hoten, diemToan, diemLy, diemHoa, (diemToan + diemLy + diemHoa) /3, queQuan
        );

        sc.close();
    }
}