package OOP.TH4;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.Year;

class NhanVien { // Xây dựng lớp NhanVien
    // Attributes
    private String ma, ten; // Mã và tên nhân viên
    private int startYear; // năm vào làm
    private double heSoLuong; // hệ số lương
    private int nghi; // số ngày nghỉ trong tháng
    protected static int luongCB = 1150; // lương cơ bản có giá trị là 1150

    // Constructor
    public NhanVien() { this("", "", 0); } // phương thức khởi tạo không tham số
    // phương thức khởi tạo 3 tham số: mã, tên và hệ số lương
    public NhanVien(String ma, String ten, double heSoLuong) {
        // sẽ tạo ra nhân viên có mã, tên, hệ số lương đã đưa vào, năm vào làm là năm hiện tại và chưa nghỉ bất kì ngày nào.
        this.ma = ma;
        this.ten = ten;
        setHeSoLuong(heSoLuong);
        startYear = Year.now().getValue();
        nghi = 0;
    }
    // phương thức khởi tạo có đầy đủ thông tin của nhân viên
    public NhanVien(String ma, String ten, double heSoLuong, int startYear, int nghi) {
        this.ma = ma;
        this.ten = ten;
        setHeSoLuong(heSoLuong);
        setStartYear(startYear);
        setNghi(nghi);
    }

    // Get-Set Methods
    public String getMa() { return ma; }
    public void setMa(String ma) { this.ma = ma; }
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }
    public int getStartYear() { return startYear; }
    public void setStartYear(int startYear) { this.startYear = startYear < 0 ? Year.now().getValue() : startYear; }
    public double getHeSoLuong() { return heSoLuong; }
    public void setHeSoLuong(double heSoLuong) { this.heSoLuong = heSoLuong < 0 ? 0 : heSoLuong; }
    public int getNghi() { return nghi; }
    public void setNghi(int nghi) { this.nghi = nghi < 0 ? 0 : nghi; }
    public int getLuongCB() { return luongCB; }
    public static void setLuongCB(int number) { luongCB = number; }

    // Xây dựng phương thức tính phụ cấp thấm niên cho nhân viên
    // nhân viên nào làm từ 5 năm trở lên tính thâm niên (PCTN): PCTN=số năm làm việc * lương cơ bản/100.
    public double getPCTN() {
        int namLam = Year.now().getValue() - startYear;
        return namLam >= 5 ? (namLam * luongCB / 100.0) : 0;
    }

    // Xây dựng phương thức xét thi đua cho nhân viên.
    // Số ngày nghỉ<=1: xếp loại A, số ngày nghỉ <=3: xếp loại B, còn lại loại C.
    public String getThiDua() { return nghi <= 1 ? "A" : (nghi <= 3 ? "B" : "C"); }

    // Hệ số thi đua được xác định tyhông qua xếp loại như sau:
    // + Nếu xếp loại A: hệ số thi đua =1.0
    // + Nếu xếp loại B: hệ số thi đua =0.75
    // + Nếu xếp loại C: hệ số thi đua =0.5
    public double getHeSoThiDua() { 
        String loaiThiDua = getThiDua();
        return loaiThiDua.equals("A") ? 1 : (loaiThiDua.equals("B") ? 0.75 : 0.5);
    }

    // Xây dựng phương thức tính lương cho nhân viên.
    // Lương = Lương cơ bản * hệ số lương * hệ số thi đua + PCTN
    public double getLuong() { return luongCB * heSoLuong * getHeSoThiDua() + getPCTN(); }

    @Override
    public String toString() {
        return "%-15s %-25s %12d %12.2f %15d %20d %20.2f %20.2f"
        .formatted(ma, ten, startYear, heSoLuong, nghi, luongCB, getPCTN(), getLuong());
    }
}

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Số lượng nhân viên cần nhập: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 0);

        ArrayList<NhanVien> danhSachNV = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên thứ " + (i + 1));
            System.out.print("\tMã: ");
            String ma = sc.nextLine();
            System.out.print("\tTên: ");
            String ten = sc.nextLine();
            System.out.print("\tHệ số lương: ");
            double heSoLuong = Double.parseDouble(sc.nextLine());

            System.out.print("Có muốn nhập \"Năm vào làm\", \"Số ngày nghỉ trong tháng\" không?\n(Có nhập 1, không nhập 0): ");
            int opt = Integer.parseInt(sc.nextLine());
            NhanVien nv;
            if (opt == 1) {
                System.out.print("\tNăm vào làm: ");
                int startYear = Integer.parseInt(sc.nextLine());
                System.out.print("\tSố ngày nghỉ trong tháng: ");
                int nghi = Integer.parseInt(sc.nextLine());
                nv = new NhanVien(ma, ten, heSoLuong, startYear, nghi);
            }
            else nv = new NhanVien(ma, ten, heSoLuong);

            danhSachNV.add(nv);
        }

        System.out.printf("%-15s %-25s %12s %12s %15s %20s %20s %20s\n"
        , "Mã nhân viên", "Tên nhân viên", "Năm vào làm", "Hệ số lương", "Số ngày nghỉ", "Lương cơ bản", "PCTN", "Lương");
        for (NhanVien nhanVien : danhSachNV)
            System.out.println(nhanVien);

        sc.close();
    }
}