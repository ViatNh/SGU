package OOP.TH5A;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

class Person {
    // Attributes
    private String hoTen; // Họ tên
    private String diaChi; // địa chỉ

    // Constructor
    public Person() {}
    public Person(String hoten, String diaChi) {
        this.hoTen = hoten;
        this.diaChi = diaChi;
    }

    // Get-Set Methods
    public String getHoten() { return hoTen; }
    public void setHoten(String hoTen) { this.hoTen = hoTen; }
    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }

    // phương thức toString
    @Override
    public String toString() {
        return "%-25s %-30s"
        .formatted(hoTen, diaChi);
    }
}

class Student extends Person {
    // Attributes
    private float diemMon1, diemMon2; // điểm môn 1, điểm môn 2

    // Constructor
    public Student() {}
    public Student(String hoTen, String diaChi, float diemMon1, float diemMon2) {
        super(hoTen, diaChi);
        setDiemMon1(diemMon1);
        setDiemMon2(diemMon2);
    }

    // Get-Set Methods
    public float getDiemMon1() { return diemMon1; }
    public void setDiemMon1(float diemMon1) { this.diemMon1 = Math.max(0, diemMon1); }
    public float getDiemMon2() { return diemMon2; }
    public void setDiemMon2(float diemMon2) { this.diemMon2 = Math.max(0, diemMon2); }

    // tính điểm trung bình
    public float getAvg() { return (diemMon1 + diemMon2) /2; }
    // đánh giá
    public String getDanhGia() {
        float dtb = getAvg();
        return dtb >= 7.5 ? "Giỏi" : (dtb >= 6.5 ? "Khá" : (dtb >= 5 ? "Trung bình" : "Yếu"));
    }

    // overriding phương thức toString trả về bảng điểm sinh viên (gồm các thông tin thuộc tính và điểm TB)
    @Override
    public String toString() {
        return "%s %5.2f %5.2f %5.2f"
        .formatted(super.toString(), diemMon1, diemMon2, getAvg());
    }
}

class Employee extends Person {
    // Attributes
    private double heSoLuong; // hệ số lương
    public static final double LUONG_CB = 120; // lương cơ bản

    // Constructor
    public Employee() {}
    public Employee(String hoTen, String diaChi, double heSoLuong) {
        super(hoTen, diaChi);
        setHeSoLuong(heSoLuong);
    }

    // Get-Set Methods
    public double getHeSoLuong() { return heSoLuong; }
    public void setHeSoLuong(double heSoLuong) { this.heSoLuong = Math.max(0, heSoLuong); }

    // phương thức tính lương
    public double getLuong() { return LUONG_CB * heSoLuong; }
    // đnahs giá
    public String getDanhGia() { return ""; }

    // overriding phương thức toString trả về bảng lương cho nhân viên (gồm thông tin thuộc tính đối tượng và tiền lương)
    @Override
    public String toString() {
        return "%s %10.2f %10.2f %20.2f"
        .formatted(super.toString(), heSoLuong, LUONG_CB, getLuong());
    }
}

class Customer extends Person {
    // Attributes
    private String tenCT; // tên công ty
    private double giaTriHD; // giá trị hóa đơn

    // Constructor
    public Customer() {}
    public Customer(String hoTen, String diaChi, String tenCT, double giaTriHD) {
        super(hoTen, diaChi);
        this.tenCT = tenCT;
        setGiaTriHD(giaTriHD);
    }

    // Get-Set Methods
    public String getTenCT() { return tenCT; }
    public void setTenCT(String tenCT) { this.tenCT = tenCT; }
    public double getGiaTriHD() { return giaTriHD; }
    public void setGiaTriHD(double giaTriHD) { this.giaTriHD = Math.max(0, giaTriHD); }

    // đánh giá
    public String getDanhGia() { return ""; }
    // phương thức toString trả về thông tin hóa đơn cho khách Hàng (gồm các thuộc tính của đối tượng)
    @Override
    public String toString() {
        return "%s %-30s %20.2f"
        .formatted(super.toString(), tenCT, giaTriHD);
    }
}

class Manager {
    // biến danh sách để lưu các sinh viên, nhân viên và khách hàng (dùng 1 biến array Person)
    private Person[] danhSach;
    // biến lưu tổng số người có trong danh sách
    private int tongNguoi;

    // constructor mặc định khởi tạo array với dung lượng cho trước
    public Manager(int n) {
        danhSach = new Person[n];
        tongNguoi = 0;
    }

    // Get-Set Methods
    public int getTongNguoi() { return tongNguoi; }

    // Khi danh sách đầy thì tự động tăng dung lượng dãy lên 50%
    public void isFull() {
        if (danhSach.length == tongNguoi)
            danhSach = Arrays.copyOf(danhSach, danhSach.length + danhSach.length/2);
    }
    // phương thức thêm 1 người vào danh sách (thông số Person)
    public void addPerson(Person p) {
        isFull();
        danhSach[tongNguoi] = p;
        tongNguoi++;
    }
    // xóa 1 ngưới khỏi danh sách (nhận thông số là họ tên người cần xóa)
    public boolean rmPerson(String hoTen) {
        for (int i = 0; i < tongNguoi; i++) {
            if (danhSach[i].getHoten().equalsIgnoreCase(hoTen)) {
                for (int j = i; j < tongNguoi - 1; j++)
                    danhSach[j] = danhSach[j + 1];
                danhSach[tongNguoi - 1] = null; // tránh memory leak
                tongNguoi--;
                return true;
            }
        }
        return false;
    }
    // sắp xếp danh sách theo thứ tự họ tên
    public void sortHoten() {
        Arrays.sort(danhSach, 0, tongNguoi, Comparator.comparing(Person::getHoten));
    }
    // phương thức xuất danh sách
    public void printDS() {
        if (tongNguoi == 0) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        for (int i = 0; i < tongNguoi; i++) {
            System.out.println(danhSach[i]);
        }
    }
}

public class Cau2 {
    // Viết lớp cho phương thức main cho phần kiểm nghiệm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager ds = new Manager(10); // ví dụ cho 10

        // Giao tiếp với người dùng bằng menu (thể hiện tính đa hình bằng cách cho phép lựa chọn nhập thông tin là sinh viên, nhân viên hay khách hàng)
        int opt;
        do {
            System.out.println("\n0. Thoát chương trình");
            System.out.println("1. Nhập sinh viên");
            System.out.println("2. Nhập nhân viên");
            System.out.println("3. Nhập khách hàng");
            System.out.println("4. Xem danh sách");
            System.out.println("5. Sắp xếp danh sách");
            System.out.println("6. Xóa thông tin");
            System.out.println("7. Tổng số người có trong danh sách");

            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 0 -> System.out.println("Đã thoát chương trình!");
                case 1 -> {
                    System.out.print("Số lượng sinh viên cần nhập: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
                        System.out.print("\tHọ và tên: ");
                        String hoten = sc.nextLine();
                        System.out.print("\tĐịa chỉ: ");
                        String diachi = sc.nextLine();
                        System.out.print("\tĐiểm môn 1: ");
                        float diem1 = Float.parseFloat(sc.nextLine());
                        System.out.print("\tĐiểm môn 2: ");
                        float diem2 = Float.parseFloat(sc.nextLine());

                        ds.addPerson(new Student(hoten, diachi, diem1, diem2));
                    }
                }
                case 2 -> {
                    System.out.print("Số lượng nhân viên cần nhập: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
                        System.out.print("\tHọ và tên: ");
                        String hoten = sc.nextLine();
                        System.out.print("\tĐịa chỉ: ");
                        String diachi = sc.nextLine();
                        System.out.print("\tHệ số lương: ");
                        double heSoLuong = Double.parseDouble(sc.nextLine());

                        ds.addPerson(new Employee(hoten, diachi, heSoLuong));
                    }
                }
                case 3 -> {
                    System.out.print("Số lượng khách hàng cần nhập: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin khách hàng thứ " + (i + 1));
                        System.out.print("\tHọ và tên: ");
                        String hoten = sc.nextLine();
                        System.out.print("\tĐịa chỉ: ");
                        String diachi = sc.nextLine();
                        System.out.print("\tTên Công ty: ");
                        String tenCT = sc.nextLine();
                        System.out.print("\tGiá trị hóa đơn: ");
                        double giaTriHD = Double.parseDouble(sc.nextLine());

                        ds.addPerson(new Customer(hoten, diachi, tenCT, giaTriHD));
                    }
                }
                case 4 -> {
                    System.out.printf("\n");
                    ds.printDS();
                }
                case 5 -> ds.sortHoten();
                case 6 -> {
                    System.out.print("Nhập họ tên cần xóa: ");
                    String hoten = sc.nextLine();
                    ds.rmPerson(hoten);
                }
                case 7 -> System.out.println("Tổng số người: " + ds.getTongNguoi());
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (opt != 0);

        sc.close();
    }
}
