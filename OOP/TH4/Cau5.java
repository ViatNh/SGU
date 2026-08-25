package OOP.TH4;
import java.util.Scanner;
import java.util.ArrayList;

class Nguoi {
    // Attributes
    private String hoten; // họ tên
    private String ngaySinh;
    private int dob, mob, yob; // ngày/tháng/năm sinh
    private String phai; // giới tính

    // Xây dựng phương thức khởi tạo mặc định
    public Nguoi() { this( "", "", ""); }
    // Xây dựng phương thức khởi tạo có tham số
    public Nguoi(String hoten, String ngaySinh, String phai) {
        this.hoten = hoten;
        setNgaySinh(ngaySinh);
        setPhai(phai);
    }

    // Get-Set Methods
    public String getHoten() { return hoten; }
    public void setHoten(String hoten) { this.hoten = hoten; }
    public String getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
        if (ngaySinh.trim().isEmpty()) return;
        String[] tmp = new String[3];
        tmp = ngaySinh.split("/");
        dob = Integer.parseInt(tmp[0]);
        mob = Integer.parseInt(tmp[1]);
        yob = Integer.parseInt(tmp[2]);
    }
    public String getPhai() { return phai; }
    // nếu tham số giới tính không rơi vào một trong hai trường hợp “nam” hoặc “nữ” thì thuộc tính giơi stính là “nam”
    public void setPhai(String phai) { this.phai = phai.equalsIgnoreCase("nữ") ? "nữ" : "nam"; }

    // Xây dựng phương thức xuất 1 người
    @Override
    public String toString() {
        return "%-25s %-15s %9s"
        .formatted(hoten, ngaySinh, phai);
    }
}

// Xây dựng lớp SinhVien kế thừa từ lớp Nguoi
class SinhVien extends Nguoi {
   // Attributes
    private String mssv; // mã số sinh viên
    private String heDT; // hệ đào tạo (“cao đẳng”, “đại học”, “cao đẳng nghề”)
    private int tongTC; // tổng số tín chỉ

    // Xây dựng phương thức khởi tạo có tham số
    public SinhVien(String hoten, String ngaySinh, String phai, String mssv, String heDT) {
        super(hoten, ngaySinh, phai);
        this.mssv = mssv;
        setHeDT(heDT);
        setTongTC();
    }

    // Get-Set Methods
    public String getMSSV() { return mssv; }
    public void setMSSV(String mssv) { this.mssv = mssv; }
    public String getHeDT() { return heDT; }
    public void setHeDT(String heDT) {
        // Thuộc tính Hệ đào tạo là một trong 3 giá trị “cao đẳng”, “đại học” và “cao đẳng nghề”.
        // Nếu tham số hệ đào tạo không thuộc 1 trong 3 giá trị này thì thiết lập hệ đào tạo là “đại học”
        this.heDT = heDT.equalsIgnoreCase("cao đẳng") ? "cao đẳng" :
                    (heDT.equalsIgnoreCase("cao đẳng nghề") ? "cao đẳng nghề" : "đại học");
    }
    public int getTongTC() { return tongTC; }
    public void setTongTC() {
        // o Nếu hệ đào tạo là “đại học” thì tổng số tín chỉ là 150.
        // o Nếu hệ đào tạo là “cao đẳng” thì tổng số tín chỉ là 100.
        // o Nếu hệ đào tạo là “cao đẳng nghề” thì tổng số tín chỉ là 130.
        this.tongTC = getHeDT().equals("cao đẳng") ? 100 :
                        (getHeDT().equals("cao đẳng nghề") ? 130 : 150);
    }
    // Xây dựng phương thức tính tổng học phí của sinh viên
    public double getTongHP() {
        double hpTC; // học phí tín chỉ
        // o Nếu hệ đào tạo là “đại học” thì học phí tín chỉ là 200 000.
        // o Nếu hệ đào tạo là “cao đẳng” thì học phí tín chỉ là 150 000.
        // o Nếu hệ đào tạo là “cao đẳng nghề” thì học phí tín chỉ là 120 000.
        hpTC = tongTC == 100 ? 150000.0 :
                (tongTC == 130 ? 120000.0 : 200000.0);
        // tổng học phí = tổng số tín chỉ * học phí tín chỉ
        return tongTC * hpTC;
    }

    // Xây dựng phương thức xuất SinhVien
    @Override
    public String toString() {
        return "%s %-10s %-15s %10d %20.2f"
        .formatted(super.toString(), mssv, heDT, tongTC, getTongHP());
    }
}

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<SinhVien> danhSachSV = new ArrayList<>();
        int opt;
        do {
            System.out.println("\n0. Thoát chương trình");
            System.out.println("1. Nhập thông tin sinh viên");
            System.out.println("2. Danh sách sinh viên");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(sc.nextLine());

            switch (opt) {
                case 0 -> System.out.println("Đã thoát chương trình.");
                case 1 -> {
                    System.out.print("Số lượng sinh viên cần nhập: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        // Nhập thông tin class Nguoi
                        System.out.println("Sinh viên thứ " + (i + 1));
                        System.out.print("\tHọ và tên: ");
                        String hoten = sc.nextLine();
                        System.out.print("\tNgày/tháng/năm sinh: ");
                        String ngaySinh = sc.nextLine();
                        System.out.print("\tGiới tính: ");
                        String phai = sc.nextLine();
                        // Nhập thông tin class SinhVien
                        System.out.print("\tMSSV: ");
                        String mssv = sc.nextLine();
                        System.out.print("\tHệ đào tạo: ");
                        String heDT = sc.nextLine();

                        danhSachSV.add(new SinhVien(hoten, ngaySinh, phai, mssv, heDT));
                    }
                }
                case 2 -> {
                    if (danhSachSV.isEmpty()) System.out.println("Danh sách rỗng!");
                    else {
                        System.out.printf("%-25s %-15s %9s %-10s %-15s %10s %20s\n", 
                        "Họ và tên", "Ngày sinh", "Giới tính", "MSSV", "Hệ đào tạo", "Tổng số TC", "Tổng học phí");
                        danhSachSV.forEach(System.out::println);
                    } 
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (opt != 0);

        sc.close();
    }
}
