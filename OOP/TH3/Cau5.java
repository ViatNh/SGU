package OOP.TH3;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.Year;

// Để quản lý khách hàng đến thuê phòng trọ của một khách sạn, người ta cần quản lý các thông tin sau:
// - Số ngày trọ, loại phòng trọ, giá phòng, và các thông tin cá nhân về mỗi khách trọ.
// - Với mỗi cá nhân người ta cần quản lý các thông tin: họ và tên, tuổi, năm sinh, số cmnd
// a) Xây dựng lớp Nguoi để quản lý thông tin cá nhân về mỗi cá nhân.
// b) Xây dựng lớp KhachSan để quản lý các thông tin về khách trọ
// c) Viết các phương thức: nhập, hiển thị thông tin về mỗi khách trọ.
// d) Cài đặt chương trình thực hiện các công việc sau:
//  Nhập vào 1 dãy gồm n khách trọ (n nhập từ bàn phím)
//  Hiển thị ra màn hình các thông tin về các cá nhân hiện đang trọ ở khách sạn đó.

class Nguoi {
    // Attributes
    private String hoten, cccd;
    private int yob;

    // Constructor
    public Nguoi() {
        this("", 0, "");
    }
    public Nguoi(String hoten, int yob, String cccd) {
        setHoten(hoten);
        setYOB(yob);
        setCCCD(cccd);
    }

    // Get-Set Methods
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public int getYOB() {
        return yob;
    }
    public void setYOB(int yob) {
        this.yob = yob;
    }
    public int getTuoi() {
        return Year.now().getValue() - yob;
    }
    public String getCCCD() {
        return cccd;
    }
    public void setCCCD(String cccd) {
        this.cccd = cccd;
    }
    
    @Override
    public String toString() {
        return "%-25s %10d %5d %-15s".formatted(hoten, yob, getTuoi(), cccd);
    }
}

class KhachSan {
    // Attributes
    private int ngay;
    private String loai;
    private double gia;
    private Nguoi khach;

    // Constructor
    public KhachSan() {
        this(0, "", 0, new Nguoi());
    }
    public KhachSan(int ngay, String loai, double gia, Nguoi khach) {
        setNgay(ngay);
        setLoai(loai);
        setGia(gia);
        setKhach(khach);
    }

    // Methods
    public int getNgay() { return ngay; }
    public void setNgay(int ngay) { this.ngay = ngay < 0 ? 0 : ngay; }
    public String getLoai() { return loai; }
    public void setLoai(String loai) { this.loai = loai; }
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia < 0 ? 0 : gia; }
    public Nguoi getKhach() { return khach; }
    public void setKhach(Nguoi khach) { this.khach = khach; }
    public double getTong() { return gia * ngay; }

    @Override
    public String toString() {
        return "%s %-15s %5d %-15.2f %-20.2f".formatted(khach, loai, ngay, gia, getTong());
    }
}

public class Cau5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập vào số lượng khách trọ: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 0);

        ArrayList<KhachSan> ks = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            Nguoi person = new Nguoi();
            System.out.println("\nKhách trọ thứ " + (i + 1));
            System.out.println("\tNhập thông tin của khách trọ:");
            System.out.print("\t\tHọ và tên: ");
            person.setHoten(sc.nextLine());
            System.out.print("\t\tNăm sinh: ");
            person.setYOB(Integer.parseInt(sc.nextLine()));
            System.out.print("\t\tCCCD: ");
            person.setCCCD(sc.nextLine());
            
            KhachSan phong = new KhachSan();
            System.out.print("\t Nhập số ngày trọ: ");
            phong.setNgay(Integer.parseInt(sc.nextLine()));
            System.out.print("\t Nhập loại phòng: ");
            phong.setLoai(sc.nextLine());
            System.out.print("\t Nhập giá phòng: ");
            phong.setGia(Double.parseDouble(sc.nextLine()));
            phong.setKhach(person);

            ks.add(phong);
            System.out.print("\n");
        }

        System.out.println("DANH SÁCH PHÒNG TRỌ");
        System.out.printf("%-25s %10s %5s %-15s %-15s %5s %-15s %-20s\n", 
        "Họ và tên", "Năm sinh", "Tuổi", "CCCD", "Loại", "Ngày", "Giá/ngày", "Tổng");
        for(KhachSan x : ks) System.out.println(x);

        sc.close();
    }
}
