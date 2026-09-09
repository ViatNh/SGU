package OOP.TH5A;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

class SinhVien {
    // Attributes
    protected String hoten, mssv, diachi; // họ tên, mã số sinh viên, địa chỉ
    protected String ngaysinh; // ngày/tháng/năm sinh
    protected int dob, mob, yob; // dayOfBirth, monthOfBirth, yearOfBirth
    protected String khoa, khoahoc, lop; // Khoa, Khóa học, Lớp

    // Constructor
    public SinhVien() {}
    public SinhVien(String hoten, String mssv, String diachi, String ngaysinh, String khoa, String khoahoc, String lop) {
        this.hoten = hoten;
        this.mssv = mssv;
        this.diachi= diachi;
        setNgaySinh(ngaysinh);
        this.khoa = khoa;
        this.khoahoc = khoahoc;
        this.lop = lop;
    }

    // Get-Set Methods
    public String getHoten() { return hoten; }
    public void setHoten(String hoten) { this.hoten = hoten; }
    public String getMSSV() { return mssv; }
    public void setMSSV(String mssv) { this.mssv = mssv; }
    public String getDiaChi() { return diachi; }
    public void setDiaChi(String diachi) { this.diachi = diachi; }
    public String getNgaySinh() { return ngaysinh; }
    public void setNgaySinh(String ngaysinh) {
        this.ngaysinh = ngaysinh.trim().replaceAll("\\s+", "");
        String[] tmp = ngaysinh.split("/");
        dob = Integer.parseInt(tmp[0]);
        mob = Integer.parseInt(tmp[1]);
        yob = Integer.parseInt(tmp[2]);
    }
    public String getKhoa() { return khoa; }
    public void setKhoa(String khoa) { this.khoa = khoa; }
    public String getKhoaHoc() { return khoahoc; }
    public void setKhoaHoc(String khoahoc) { this.khoahoc = khoahoc; }
    public String getLop() { return lop; }
    public void setLop(String lop) { this.lop = lop; }

    // Override
    @Override 
    public String toString() {
        return "%-25s %-10s %-30s %-10s %-20s %-5s %-10s"
        .formatted(hoten, mssv, diachi, ngaysinh, khoa, khoahoc, lop);
    }

}

class ChinhQuy extends SinhVien {
    public ChinhQuy(String hoten, String mssv, String diachi, String ngaysinh, String khoa, String khoahoc, String lop) {
        super(hoten, mssv, diachi, ngaysinh, khoa, khoahoc, lop);
}

class LienThong extends SinhVien {
    public LienThong(String hoten, String mssv, String diachi, String ngaysinh, String khoa, String khoahoc, String lop) {
        super(hoten, mssv, diachi, ngaysinh, khoa, khoahoc, lop);
}

class QLSV {
    // Attributes
    private SinhVien[] danhSach;
    private int objNum;

    // Constructor
    public QLSV(int n) {
        danhSach = new SinhVien[n];
        objNum = 0;
    }

    // Conditional Methods
    public void isFull() {
        if (objNum >= danhSach.length)
            danhSach = Arrays.copyOf(danhSach, objNum + Math.max(1, objNum / 2));
    }
    public boolean isEmpty() {
        if (objNum == 0) return true;
        return false;
    }
    public int isExist(String mssv) { // -1: danh sách rỗng, -2: không tồn tại, i: index
        if (isEmpty()) return -1;
        for (int i = 0; i < objNum; i++)
            if (danhSach[i].getMSSV().equalsIgnoreCase(mssv))
                return i;
        return -2;
    }

    // Methods
    public boolean add(SinhVien sv) {
        isFull();
        danhSach[this.objNum++] = sv;
        return true;
    }
    public void edit(Scanner sc, String mssv) {
        int idx = isExist(mssv);
        if (idx < 0) return;
        else {
            int opt;
            do {
                System.out.println("\nĐang chỉnh sửa sinh viên " + danhSach[idx].getHoten());
                System.out.println("0: Quay về màn hình chính");
                System.out.println("1. Sửa họ tên");
                System.out.println("2. Sửa địa chỉ");
                System.out.println("3. Sửa ngày sinh");
                System.out.println("4. Sửa Khoa");
                System.out.println("5. Sửa Khóa học");
                System.out.println("6. Sửa Lớp");
                System.out.print("Nhập lựa chọn: ");
                opt = Integer.parseInt(sc.nextLine());

                switch (opt) {
                    case 0 -> System.out.println("Đã thoát trạng thái sửa.");
                    case 1 -> {
                        System.out.print("\nNhập họ tên mới: ");
                        String hoten = sc.nextLine();
                        danhSach[idx].setHoten(hoten);
                    }
                    case 2 -> {
                        System.out.print("\nNhập địa chỉ mới: ");
                        String diachi = sc.nextLine();
                        danhSach[idx].setDiaChi(diachi);
                    }
                    case 3 -> {
                        System.out.print("\nNhập ngày sinh mới: ");
                        String ngaysinh = sc.nextLine();
                        danhSach[idx].setNgaySinh(ngaysinh);
                    }
                    case 4 -> {
                        System.out.print("\nNhập Khoa mới: ");
                        String khoa = sc.nextLine();
                        danhSach[idx].setKhoa(khoa);
                    }
                    case 5 -> {
                        System.out.print("\nNhập Khóa học mới: ");
                        String khoahoc = sc.nextLine();
                        danhSach[idx].setKhoaHoc(khoahoc);
                    }
                    case 6 -> {
                        System.out.print("\nNhập Lớp mới: ");
                        String lop = sc.nextLine();
                        danhSach[idx].setLop(lop);
                    }
                    default -> System.out.println("Lựa chọn không hợp lệ!");
                }
            } while (opt != 0);
        }
    }
    public int rm(String mssv) { //0: không tồn tại, 1: thành công
        int idx = isExist(mssv);
        if (idx < 0) return 0;
        else {
            for (int j = idx; j < objNum - 1; j++)
                danhSach[j] = danhSach[j + 1];
            danhSach[--objNum] = null;
            return 1;
        }
    }
    public SinhVien find(String mssv) {
        int idx = isExist(mssv);
        if (idx < 0) return null;
        return danhSach[idx];
    }

    public void printDS() {
        for (int i = 0; i < objNum; i++)
            System.out.println(danhSach[i]);
    }
}

public class Cau3 {
    // main của Gemini
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLSV ql = new QLSV(5);
        int choice;

        do {
            System.out.println("\n--- QUẢN LÝ SINH VIÊN ---");
            System.out.println("1. Thêm sinh viên chính quy");
            System.out.println("2. Thêm sinh viên liên thông");
            System.out.println("3. Hiển thị danh sách");
            System.out.println("4. Tìm kiếm theo MSSV");
            System.out.println("5. Sửa thông tin sinh viên");
            System.out.println("6. Xóa sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1, 2 -> {
                    System.out.print("Nhập họ tên: "); String hoten = sc.nextLine();
                    System.out.print("Nhập MSSV: "); String mssv = sc.nextLine();
                    System.out.print("Nhập địa chỉ: "); String diachi = sc.nextLine();
                    System.out.print("Nhập ngày sinh (dd/mm/yyyy): "); String ngaysinh = sc.nextLine();
                    System.out.print("Nhập khoa: "); String khoa = sc.nextLine();
                    System.out.print("Nhập khóa học: "); String khoahoc = sc.nextLine();
                    System.out.print("Nhập lớp: "); String lop = sc.nextLine();

                    if (choice == 1) {
                        ql.add(new ChinhQuy(hoten, mssv, diachi, ngaysinh, khoa, khoahoc, lop));
                    } else {
                        ql.add(new LienThong(hoten, mssv, diachi, ngaysinh, khoa, khoahoc, lop));
                    }
                    System.out.println("Thêm thành công!");
                }
                case 3 -> {
                    System.out.println("\nDANH SÁCH SINH VIÊN:");
                    ql.printDS();
                }
                case 4 -> {
                    System.out.print("Nhập MSSV cần tìm: ");
                    String mssv = sc.nextLine();
                    SinhVien sv = ql.find(mssv);
                    if (sv != null) System.out.println("Tìm thấy: " + sv);
                    else System.out.println("Không tìm thấy sinh viên!");
                }
                case 5 -> {
                    System.out.print("Nhập MSSV cần sửa: ");
                    ql.edit(sc, sc.nextLine());
                }
                case 6 -> {
                    System.out.print("Nhập MSSV cần xóa: ");
                    int res = ql.rm(sc.nextLine());
                    if (res == 1) System.out.println("Xóa thành công!");
                    else System.out.println("Không tìm thấy sinh viên để xóa!");
                }
                case 0 -> System.out.println("Đang thoát chương trình...");
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
        
        sc.close();
    }
}