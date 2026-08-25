package OOP.TH4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class CD {
    // Attributes - Các thuộc tính khai báo là Private
    private int ma; // Mã CD
    private String tua, casy; // Tựa CD, Ca sỹ
    private int soBaiHat; // Số bài hát: số nguyên (>0)
    private double gia; // Giá thành: số thực (>0)

    // các constructor để khởi tạo đối tượng CD
    public CD() { this(0, "", ""); }
    public CD(int ma, String tua, String casy) { this(ma, tua, casy, 0, 0.0); }
    public CD(int ma, String tua, String casy, int soBaiHat, double gia) {
        this.ma = ma;
        this.tua = tua;
        this.casy = casy;
        setSoBaiHat(soBaiHat);
        setGia(gia);
    }

    // phương thức getter/ setter cho từng thuộc tính
    public int getMa() { return ma; }
    public void setMa(int ma) { this.ma = ma; }
    public String getTua() { return tua; }
    public void setTua(String tua) { this.tua = tua; }
    public String getCasy() { return casy; }
    public void setCasy(String casy) { this.casy = casy; }
    public int getSoBaiHat() { return soBaiHat; }
    public void setSoBaiHat(int soBaiHat) { this.soBaiHat = soBaiHat < 0 ? 0 : soBaiHat; }
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia < 0 ? 0 : gia; }

    @Override
    public String toString() {
        return "%10d %-30s %-25s %10d %20.2f"
        .formatted(ma, tua, casy, getSoBaiHat(), getGia());
    }
}

class DanhSach {
    // Xây dựng lớp lưu danh sách các CD (dùng mảng)
    private ArrayList<CD> danhSachCD = new ArrayList<>();

    // Tính số lượng CD có trong danh sách
    public int lengthDS() { return danhSachCD.size(); }
    // Tính tổng giá thành của các CD
    public double priceDS() { return danhSachCD.stream().mapToDouble(CD::getGia).sum(); }

    // Phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD và kích thước của mảng còn cho phép
    public String addCD(int ma, String tua, String casy, int soBaiHat, double gia) {
        if (danhSachCD.stream().noneMatch(c -> c.getMa() == ma)) {
            danhSachCD.add(new CD(ma, tua, casy, soBaiHat, gia));
            return "Thêm CD thành công.";
        }
        return "Trùng Mã CD";  
    }
    // Phương thức sắp xếp danh sách giảm dần theo giá thành
    public void sortDESC() {
        danhSachCD.sort(Comparator.comparingDouble(CD::getGia).reversed());
    }
    // Phương thức sắp xếp dánh sách tăng dần dựa theo tựa CD
    public void sortASC() {
        danhSachCD.sort(Comparator.comparing(CD::getTua));
    }
    // Phương thức xuất toàn bộ danh sách
    public void inDS() {
        if (danhSachCD.isEmpty()) {
            System.out.println("Danh sách rỗng!");
            return;
        }
        System.out.printf("%10s %-30s %-25s %10s %20s\n"
        , "Mã CD", "Tựa CD", "Ca sỹ", "Số bài hát", "Giá thành");
        for (CD x : danhSachCD)
            System.out.println(x);
    }
}

public class Cau4 {
    public static void main(String[] args) {
        // Viết lớp cho phần kiểm thử. Dùng menu case thực hiện các chức năng theo yêu cầu
        Scanner sc = new Scanner(System.in);

        DanhSach ds = new DanhSach();
        int opt;
        do {
            System.out.println("\n0. Thoát chương trình");
            System.out.println("1. Nhập CD vào danh sách");
            System.out.println("2. Số lượng CD trong danh sách");
            System.out.println("3. Tính tổng giá thành của các CD.");
            System.out.println("4. Xuất toàn bộ danh sách.");
            System.out.println("5. Sắp xếp và xuất danh sách giảm dần theo giá thành.");
            System.out.println("6. Sắp xếp và xuất danh sách tăng dần theo tựa CD.");
            System.out.print("Nhập lựa chọn: ");

            opt = Integer.parseInt(sc.nextLine());
            switch (opt) {
                case 0 -> System.out.println("Đã thoát chương trình");
                case 1 -> {
                    System.out.print("Số lượng CD muốn nhập: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        System.out.println("CD thứ " + (i + 1));
                        System.out.print("\tMã CD: ");
                        int ma = Integer.parseInt(sc.nextLine());
                        System.out.print("\tTựa CD: ");
                        String tua = sc.nextLine();
                        System.out.print("\tCa sỹ: ");
                        String casy = sc.nextLine();
                        System.out.print("\tSố bài hát: ");
                        int soBaiHat = Integer.parseInt(sc.nextLine());
                        System.out.print("\tGiá thành: ");
                        double gia = Double.parseDouble(sc.nextLine());
                        System.out.println(ds.addCD(ma, tua, casy, soBaiHat, gia));
                    }
                }
                case 2 -> System.out.println(ds.lengthDS());
                case 3 -> System.out.println("Tổng giá thành của các CD: " + ds.priceDS());
                case 4 -> ds.inDS();
                case 5 -> { ds.sortDESC(); ds.inDS(); }
                case 6 -> { ds.sortASC(); ds.inDS(); }
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (opt != 0);

        sc.close();
    }
}
