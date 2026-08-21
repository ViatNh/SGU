package OOP.TH4;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

// xây dựng lớp cán bộ lánh đạo cho công ty ABC
class CanBo extends NhanVien { // cán bộ lãnh đạo cũng là nhân viên của công ty
    private String chucVu, phongBan; // cán bộ sẽ có một chức vụ, phòng ban làm việc
    private double heSoPCLD; // một hệ số phụ cấp lãnh đạo

    // Xây dựng phương thức Constructor mặc định tạo ra 1 lãnh đạo giống như nhân viên nhưng có chức vụ là trưởng phòng làm việc tại phòng hành chính và có hệ số lương phụ cấp chức vụ là 0.5
    public CanBo() { this("", "", 0); }
    public CanBo(String ma, String ten, double heSoLuong) {
        super(ma, ten, heSoLuong);
        chucVu = "Trưởng phòng";
        phongBan = "Hành chính";
        heSoPCLD = 0.5;
    }
    // Xây dựng Constructor khởi tạo gồm 5 tham số: mã, tên, hệ số lương, chức vụ và hệ số phụ cấp chức vụ
    public CanBo(String ma, String ten, double heSoLuong, String chucVu, double heSoPCLD) {
        // tạo ra một nhân viên có mã, tên, hệ số lương, chức vụ và hệ số chức vụ như đã đưa vào và số ngày nghỉ là 1 và vào làm việc trong công ty là năm hiện tại
        super(ma, ten, heSoLuong, Year.now().getValue(), 1);
        this.chucVu = chucVu;
        phongBan = "";
        setHeSoPCLD(heSoPCLD);
    }
    // Xây dụng phương thức khởi tạo gồm đầy đủ các tham số
    public CanBo(String ma, String ten, double heSoLuong, int startYear, int nghi, String chucVu, String phongBan, double heSoPCLD) {
        // tạo ra một nhân viên có mã, tên, hệ số lương, chức vụ và hệ số chức vụ như đã đưa vào và số ngày nghỉ là 1 và vào làm việc trong công ty là năm hiện tại
        super(ma, ten, heSoLuong, startYear, nghi);
        this.chucVu = chucVu;
        this.phongBan = phongBan;
        setHeSoPCLD(heSoPCLD);
    }

    // Get-Set methods
    public String getChucVu() { return chucVu; }
    public void setChucVu(String chucVu) { this.chucVu = chucVu; }
    public String getPhongBan() { return phongBan; }
    public void setPhongBan(String phongBan) { this.phongBan = phongBan; }
    public double getHeSoPCLD() { return heSoPCLD; }
    public void setHeSoPCLD(double heSoPCLD) { this.heSoPCLD = heSoPCLD < 0 ? 0 : heSoPCLD; }

    // Xây dựng phương thức xét thi đua lại cho cán bộ biết rằng cán bộ của công ty luôn xếp loại A
    @Override
    public String getThiDua() { return "A"; }

    // Xây dựng phương tyhức tính phụ cấp lãnh đạo cho cán bộ, PCLD = hệ số phụ cấp lãnh đạo * lương cơ bản
    public double getPCLD() { return heSoPCLD * luongCB; }

    // Xây dựng lại phương thức tính lương của cán bộ, lương = lương + phụ cấp lãnh đạo
    @Override
    public double getLuong() { return super.getLuong() + getPCLD(); }

    // Xây dựng phương thức xuất thông tin một cán bộ.
    @Override
    public String toString() {
        return "%s %-15s %-20s %12.2f"
        .formatted(super.toString(), chucVu, phongBan, heSoPCLD);
    }
}

public class Cau2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Số lượng cán bộ cần nhập: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 0);

        ArrayList<CanBo> danhSachCB = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Cán bộ thứ " + (i + 1));
            System.out.print("\tMã: ");
            String ma = sc.nextLine();
            System.out.print("\tTên: ");
            String ten = sc.nextLine();
            System.out.print("\tHệ số lương: ");
            double heSoLuong = Double.parseDouble(sc.nextLine());

            System.out.println("\n0. Hoàn thành");
            System.out.println("1. Tiếp tục nhập chức vụ và hệ số phụ cấp chức vụ");
            System.out.println("2. Tiếp tục nhập đầy đủ các tham số (gồm năm vào làm, số ngày nghỉ trong tháng, chức vụ, phòng ban, hệ số phụ cấp chức vụ");
            int opt = Integer.parseInt(sc.nextLine());

            CanBo cb;
            switch (opt) {
                case 1 -> {
                    System.out.print("\tChức vụ: ");
                    String chucVu = sc.nextLine();
                    System.out.print("\tHệ số phụ cấp chức vụ: ");
                    double heSoPCLD = Double.parseDouble(sc.nextLine());
                    cb = new CanBo(ma, ten, heSoLuong, chucVu, heSoPCLD);
                }
                case 2 -> {
                    System.out.print("\tNăm vào làm: ");
                    int startYear = Integer.parseInt(sc.nextLine());
                    System.out.print("\tSố ngày nghỉ trong tháng: ");
                    int nghi = Integer.parseInt(sc.nextLine());
                    System.out.print("\tChức vụ: ");
                    String chucVu = sc.nextLine();
                    System.out.print("\tPhòng ban: ");
                    String phongBan = sc.nextLine();
                    System.out.print("\tHệ số phụ cấp chức vụ: ");
                    double heSoPCLD = Double.parseDouble(sc.nextLine());
                    cb = new CanBo(ma, ten, heSoLuong, startYear, nghi, chucVu, phongBan, heSoPCLD);
                }
                default -> cb = new CanBo(ma, ten, heSoLuong);
            }

            danhSachCB.add(cb);
        }

        System.out.printf("%-15s %-25s %12s %12s %15s %20s %20s %20s %-15s %-20s %12.2s\n"
        , "Mã cán bộ", "Tên cán bộ", "Năm vào làm", "Hệ số lương", "Số ngày nghỉ", "Lương cơ bản", "PCTN", "Lương", "Chức vụ", "Phòng ban", "Hệ số PCLD");
        for (CanBo canbo : danhSachCB)
            System.out.println(canbo);

        sc.close();
    }
}