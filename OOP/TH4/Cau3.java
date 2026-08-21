package OOP.TH4;
import java.util.Scanner;
import java.util.ArrayList;

// Công ty du lịch V quản lý thông tin là các chuyến xe.
class Chuyen {
    // Attributes
    private String ma, hoTenTX, soXe; // Mã số chuyến, Họ tên tài xế, số xe
    private double doanhThu; // doanh thu

    // Constructor
    public Chuyen() { this("", "", "", 0); }
    public Chuyen(String ma, String hoTenTX, String soXe, double doanhThu) {
        this.ma = ma;
        this.hoTenTX = hoTenTX;
        this.soXe = soXe;
        setDoanhThu(doanhThu);
    }

    // Get-Set Methods
    public String getMa() { return ma; }
    public void setMa(String ma) { this.ma = ma; }
    public String getHoTenTX() { return hoTenTX; }
    public void setHoTenTX(String hoTenTX) { this.hoTenTX = hoTenTX; }
    public String getSoXe() { return soXe; }
    public void setSoXe(String soXe) { this.soXe = soXe; }
    public double getDoanhThu() { return doanhThu; }
    public void setDoanhThu(double doanhThu) { this.doanhThu = doanhThu < 0 ? 0 : doanhThu; }

    @Override
    public String toString() {
        return "%-10s %-25s %-12s %20.2f"
        .formatted(ma, hoTenTX, soXe, doanhThu);
    }
}

class Noi extends Chuyen { // Chuyến xe nội thành
    // Attributes
    private int soTuyen; // số tuyến
    private double soKm; // số km đi được

    // Constructor
    public Noi() { this("", "", "", 0, 0.0, 0.0); }
    public Noi(String ma, String hoTenTX, String soXe, int soTuyen, double soKm, double doanhThu) {
        super(ma, hoTenTX, soXe, doanhThu);
        setSoTuyen(soTuyen);
        setSoKm(soKm);
    }

    // Get-Set Methods
    public int getSoTuyen() { return soTuyen; }
    public void setSoTuyen(int soTuyen) { this.soTuyen = soTuyen < 0 ? 0 : soTuyen; }
    public double getSoKm() { return soKm; }
    public void setSoKm(double soKm) { this.soKm = soKm < 0.0 ? 0.0 : soKm; }

    @Override
    public String toString() {
        return "%s %10d %10.2f"
        .formatted(super.toString(), soTuyen, soKm);
    }
}

class Ngoai extends Chuyen { // Chuyến ngoại thành
    // Attributes
    private String noiDen; // nơi đến
    private int soNgay; // số ngày đi được

    // Constructor
    public Ngoai() { this("", "", "", "", 0, 0.0); }
    public Ngoai(String ma, String hoTenTX, String soXe, String noiDen, int soNgay, double doanhThu) {
        super(ma, hoTenTX, soXe, doanhThu);
        this.noiDen = noiDen;
        setSoNgay(soNgay);
    }

    // Get-Set Methods
    public String getNoiDen() { return noiDen; }
    public void setNoiDen(String noiDen) { this.noiDen = noiDen; }
    public int getSoNgay() { return soNgay; }
    public void setSoNgay(int soNgay) { this.soNgay = soNgay < 0 ? 0 : soNgay; }

    @Override
    public String toString() {
        return "%s %30s %10d"
        .formatted(super.toString(), noiDen, soNgay);
    }
}

public class Cau3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Chuyen> dsChuyen = new ArrayList<>();
        int opt, n;
        do {
            System.out.println("\n0. Thoát");
            System.out.println("1. Nhập chuyến xe nội thành");
            System.out.println("2. Nhập chuyến xe ngoại thành");
            System.out.println("3. Hiển thị danh sách các chuyến xe");
            System.out.println("4. Tổng doanh thu các chuyến xe");
            System.out.print("Nhập lựa chọn: ");
            opt = Integer.parseInt(sc.nextLine());

            switch (opt) {
                case 0 -> System.out.println("Chương trình đã kết thúc!");
                case 1 -> {
                    System.out.print("Nhập số lượng chuyến xe nội thành: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin chuyến xe nội thành thứ " + (i + 1));
                        System.out.print("\tMã số chuyến: ");
                        String ma = sc.nextLine();
                        System.out.print("\tHọ và tên tài xế: ");
                        String hoTenTX = sc.nextLine();
                        System.out.print("\tSố xe: ");
                        String soXe = sc.nextLine();
                        System.out.print("\tSố tuyến: ");
                        int soTuyen = Integer.parseInt(sc.nextLine());
                        System.out.print("\tSố km đi được: ");
                        double soKm = Double.parseDouble(sc.nextLine());
                        System.out.print("\tDoanh thu: ");
                        double doanhThu = Double.parseDouble(sc.nextLine());

                        dsChuyen.add(new Noi(ma, hoTenTX, soXe, soTuyen, soKm, doanhThu));
                    }
                }
                case 2 -> {
                    System.out.print("Nhập số lượng chuyến xe ngoại thành: ");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhập thông tin chuyến xe ngoại thành thứ " + (i + 1));
                        System.out.print("\tMã số chuyến: ");
                        String ma = sc.nextLine();
                        System.out.print("\tHọ và tên tài xế: ");
                        String hoTenTX = sc.nextLine();
                        System.out.print("\tSố xe: ");
                        String soXe = sc.nextLine();
                        System.out.print("\tNơi đến: ");
                        String noiDen = sc.nextLine();
                        System.out.print("\tSố ngày đi được: ");
                        int soNgay = Integer.parseInt(sc.nextLine());
                        System.out.print("\tDoanh thu: ");
                        double doanhThu = Double.parseDouble(sc.nextLine());

                        dsChuyen.add(new Ngoai(ma, hoTenTX, soXe, noiDen, soNgay, doanhThu));
                    }
                }
                case 3 -> {
                    if (dsChuyen.isEmpty()) System.out.println("Danh sách trống.");
                    else {
                        System.out.println("\n--- DANH SÁCH CHUYẾN XE NỘI THÀNH ---");
                        System.out.printf("%-10s %-25s %-12s %20s %10s %10s\n",
                                "Mã số", "Họ tên tài xế", "Số xe", "Doanh thu", "Số tuyến", "Số KM");
                        for (Chuyen c : dsChuyen)
                            if (c instanceof Noi) System.out.println(c);

                        System.out.println("\n--- DANH SÁCH CHUYẾN XE NGOẠI THÀNH ---");
                        System.out.printf("%-10s %-25s %-12s %20s %30s %10s\n"
                        , "Mã số chuyến", "Họ và tên tài xế", "Số xe", "Doanh thu", "Nơi đến", "Số ngày đi được");
                        for (Chuyen c : dsChuyen)
                            if (c instanceof Ngoai) System.out.println(c);
                    }
                }
                case 4 -> {
                    double tongNoi, tongNgoai;
                    tongNoi = tongNgoai = 0;
                    for (Chuyen c : dsChuyen) {
                        if (c instanceof Noi) tongNoi += c.getDoanhThu();
                        else if (c instanceof Ngoai) tongNgoai += c.getDoanhThu();
                    }

                    System.out.println("Tổng doanh thu các chuyến xe nội thành là " + tongNoi);
                    System.out.println("Tổng doanh thu các chuyến xe ngoại thành là " + tongNgoai);
                    System.out.println("Tổng doanh thu toàn bộ chuyến xe là " + (tongNoi + tongNgoai));
                }
                default -> System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (opt != 0);

        sc.close();
    }
}
