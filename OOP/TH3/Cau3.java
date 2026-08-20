package OOP.TH3;
import java.util.Scanner;
import java.util.List;

// Xây dựng lớp NhanVien chưá các thông tin:
// - Thuộc tính:
//  mã số, họ tên: string;
//  số ngày công (số nguyên >0);
//  xếp loại: A, B, C. Kết quả xếp loại thi đua dựa vào qui định:
//  Nếu số ngày cống >26: A
//  26>=Số ngày công >=22: B
//  Số ngày công <22: C
//  Lương ngày: 200000 đ: áp dụng cho tất cả các nhân viên
// - Phương thức:
//  Getter/ Setter cho các thuộc tính với các ràng buộc dữ liệu đi kèm
//  3 hàm khởi tạo
//  Hàm Nhập/ Xuất thông tin NhanVien
//  Hàm tính lương (số ngày công * lương ngày)
//  Hàm tính thưởng: nếu xếp loại A thì thưởng 5% lương, B thưởng 2%
// lương và loại C không có thưởng.

class NhanVien {
    // Attributes
    private String mnv, hoten;
    private int cong;
    private String loai;
    private static double luongngay = 200000;

    // Constuctor
    public NhanVien() {
        this("", "", 0);
    }
    public NhanVien(String mnv, String hoten) {
        this(mnv, hoten, 0);
    }
    public NhanVien(String mnv, String hoten, int cong) {
        setMNV(mnv);
        setHoten(hoten);
        setCong(cong);
    }

    // Get-Set Methods
    public String getMNV() {
        return mnv;
    }
    public void setMNV(String mnv) {
        this.mnv = mnv;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getCong() {
        return cong;
    }
    public void setCong(int cong) {
        this.cong = cong < 0 ? 0 : cong;
    }
    public String getLoai() {
        loai = cong > 26 ? "A" : (cong >= 22 ? "B" : "C");
        return loai;
    }
    public static double getLuongngay() {
        return luongngay;
    }
    public static void setLuongngay(int num) {
        luongngay = num;
    }

    // Compute Methods
    public double getLuong() {
        return cong * luongngay;
    }
    public double getThuong() {
        loai = getLoai();
        return loai.equals("A") ? 0.05 * getLuong() : (loai.equals("B") ? 0.02 * getLuong() : 0);
    }
    public double getTong() {
        return getLuong() + getThuong();
    }

    @Override
    public String toString() {
        return "%-10s %-25s %5d %-5s %15.0f %15.0f %15.0f"
        .formatted(mnv, hoten, cong, getLoai(), getLuong(), getThuong(), getTong());
    }
}

public class Cau3 {
    // Bộ test từ Gemini
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Test Constructor 3 tham số (Loại A: ngày công > 26)
        NhanVien nv1 = new NhanVien("NV01", "Châu Lâm Nhật Vinh", 28);

        // 2. Test Constructor 2 tham số + setter (Loại B: 22 <= ngày công <= 26)
        NhanVien nv2 = new NhanVien("NV02", "Nguyễn Hoàng Minh");
        nv2.setCong(24);

        // 3. Test Constructor 3 tham số với dữ liệu kiểm thử ràng buộc (Số công âm -> gán về 0 -> Loại C)
        NhanVien nv3 = new NhanVien("NV03", "Trần Văn Lỗi", -5);

        // 4. Test Constructor mặc định + Nhập từ bàn phím trực tiếp tại main (Loại C: ngày công < 22)
        NhanVien nv4 = new NhanVien();
        System.out.println("=== NHẬP DỮ LIỆU TỪ BÀN PHÍM CHO NV4 ===");
        System.out.print("Nhập mã nhân viên: ");
        nv4.setMNV(sc.nextLine());
        System.out.print("Nhập họ và tên: ");
        nv4.setHoten(sc.nextLine());
        System.out.print("Nhập số ngày công: ");
        nv4.setCong(Integer.parseInt(sc.nextLine()));

        // In tiêu đề bảng
        System.out.println("\n" + "=".repeat(105));
        System.out.printf("%-10s %-25s %5s %-5s %15s %15s %15s\n",
                "Mã NV", "Họ và Tên", "Công", "Loại", "Lương (đ)", "Thưởng (đ)", "Tổng nhận (đ)");
        System.out.println("-".repeat(105));

        // In danh sách các đối tượng
        List.of(nv1, nv2, nv3, nv4).forEach(System.out::println);

        System.out.println("=".repeat(105));

        sc.close();
    }
}
