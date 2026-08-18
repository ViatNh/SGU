package OOP.TH3;
import java.util.Scanner;
import java.util.List;

// Viết chương trình OOP quản lý sinh viên đơn giản: Nhập, xuất thông tin, tính điểm TB.
// - Viết lớp Sinh viên như sau:
// + Attributes (private):
//  Mã sinh viên là số nguyên.
//  Họ tên: chuỗi ký tự.
//  Điểm LT, điểm TH: float
// + Constructor:
//  Constructor mặc định (để khởi tạo đối tượng với các thông tin kiểu số là 0, kiểu chuỗi là chuỗi rỗng).
//  Constructor thứ hai nhận đầy đủ thông tin để khởi tạo giá trị cho tất cả các biến instance.
// + Methods:
//  Các getter và setter cho mỗi thuộc tính.
//  Tính điểm trung bình.
//  Phương thức toString để diễn tả đối tượng ở dạng chuỗi.
// - Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
// + sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím).
// + sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin biết rồi khỏi nhập từ bàn phím).
// + sv3 tạo bằng constructor mặc định. Nhập các thông tin cho sv3 từ bàn phím rồi sau đó dùng các setter để gán vào cho các thuộc tính tương ứng.
// + In bảng danh sách sinh viên gồm 4 cột là MSSV, họ tên, điểm LT”, điểm TH, điểm TB (bảng có 3 dòng cho 3 sinh viên).

class SinhVien {
    // Attrbutes
    private long msv;
    private String hoten;
    private float lt, th;

    // Constructor
    public SinhVien() {
        setMSV(0);
        setHoTen("");
        setLT(0);
        setTH(0);
    }
    public SinhVien(long msv, String hoten, float lt, float th) {
        setMSV(msv);
        setHoTen(hoten);
        setLT(lt);
        setTH(th);
    }

    // Get-Set Methods
    public long getMSV() {
        return msv;
    }
    public void setMSV(long msv) {
        this.msv = msv;
    }
    public String getHoTen() {
        return hoten;
    }
    public void setHoTen(String hoten) {
        this.hoten = hoten;
    }
    public float getLT() {
        return lt;
    }
    public void setLT(float lt) {
        this.lt = lt;
    }
    public float getTH() {
        return th;
    }
    public void setTH(float th) {
        this.th = th;
    }

    // Compute Methods
    public float getAvg() {
        return (lt + th)/2;
    }

    @Override
    public String toString() {
        return "%-15d\t%-30s\t%10.2f\t%10.2f\t%10.2f".formatted(msv, hoten, lt, th, getAvg());
    }
}

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(3125410208L, "Châu Lâm Nhật Vinh", 8F, 9.5F);
        SinhVien sv2 = new SinhVien(3125410105L, "Nguyễn Hoàng Minh", 9F, 9);
        SinhVien sv3 = new SinhVien();

        System.out.print("Nhập mã số sinh viên: ");
        long msv = Long.parseLong(sc.nextLine());
        System.out.print("Nhập họ tên sinh viên: ");
        String hoten = sc.nextLine();
        System.out.print("Nhập điểm lý thuyết: ");
        float lt = Float.parseFloat(sc.nextLine());
        System.out.print("Nhập điểm thực hành: ");
        float th = Float.parseFloat(sc.nextLine());

        sv3.setMSV(msv);
        sv3.setHoTen(hoten);
        sv3.setLT(lt);
        sv3.setTH(th);

        System.out.printf("%-15s\t%-30s\t%10s\t%10s\t%10s\n", "MSV", "Họ và tên", "Lý thuyết", "Thực hành", "Trung bình");
        List.of(sv1, sv2, sv3).forEach(System.out::println);

        sc.close();
    }
}
