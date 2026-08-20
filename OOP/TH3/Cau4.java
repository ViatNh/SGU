package OOP.TH3;
import java.util.Scanner;
import java.util.List;

// Sở giao thông cần theo dõi việc đăng ký xe của người dân. Dựa vào thông tin trị giá xe và dung tích xylanh của xe, sở giao thông cũng tính mức thuế phải đóng trước bạ khi mua xe như sau:
// - Dưới 100cc: 1% giá trị xe
// - Từ 100 đến 200 cc: 3% giá trị xe
// - Trên 200cc: 5% giá trị xe
// Hãy thiết kê và cài đặt class Vehicle với các thuộc tính và phương thức phù hợp. Class phải có các contructor và phải đảm bảo tính đóng gói. Xây dựng class chứa hàm main. Hàm main in ra menu lựa chọn các công việc:
// 1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3
// 2. Xuất bảng kê khai tiền thuế trước bạ của các xe
// 3. Thoát.

class Vehicle {
    // Attributes
    private String tenChuXe, loaiXe;
    private int cylinder;
    private double price;

    // Constructor
    public Vehicle() {
        this("", "", 0, 0);
    }
    public Vehicle(String tenChuXe, String loaiXe) {
        this(tenChuXe, loaiXe, 0, 0);
    }
    public Vehicle(String tenChuXe, String loaiXe, int cylinder) {
        this(tenChuXe, loaiXe, cylinder, 0);
    }
    public Vehicle(String tenChuXe, String loaiXe, int cylinder, double price) {
        setTenChuXe(tenChuXe);
        setLoaiXe(loaiXe);
        setCylinder(cylinder);
        setPrice(price);
    }

    // Get-Set Methods
    public String getTenChuXe() {
        return tenChuXe;
    }
    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }
    public String getLoaiXe() {
        return loaiXe;
    }
    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price < 0 ? 0 : price;
    }
    public int getCylinder() {
        return cylinder;
    }
    public void setCylinder(int cylinder) {
        this.cylinder = cylinder < 0 ? 0 : cylinder;
    }

    // Compute Methods
    public double getTax() {
        int cc = getCylinder();
        double priceVehicle = getPrice();
        return cc > 200 ? 0.05 * priceVehicle : (cc >= 100 ? 0.03 * priceVehicle : 0.01 * priceVehicle);
    }
    public double getTotalPrice() {
        return getPrice() + getTax();
    }

    // Output
    @Override 
    public String toString() {
        return "%-25s %-15s %10d %15.2f %15.2f".formatted(tenChuXe, loaiXe, getCylinder(), getPrice(), getTax());
    }
}

public class Cau4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Vehicle> xeList = null;

        int c;
        do {
            System.out.println("\n1. Nhập thông tin và tạo các đối tượng xe1, xe2, xe3");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3. Thoát.");
            System.out.print("Nhập lựa chọn: ");
            c = Integer.parseInt(sc.nextLine());

            switch (c) {
                case 1 -> {
                    Vehicle xe1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
                    Vehicle xe2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
                    Vehicle xe3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);
                    xeList = List.of(xe1, xe2, xe3);
                    System.out.println("Đã nhập xong");
                }
                case 2 -> {
                    if (xeList == null)
                        System.out.println("Chưa có dữ liệu xe");
                    else {
                        System.out.printf("%-25s %-15s %10s %15s %15s\n",
                        "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                        System.out.println("=".repeat(85));
                        xeList.forEach(System.out::println);
                    }
                }
                case 3 -> System.out.println("Đã thoát chương trình");
                default -> System.out.println("Vui lòng nhập lựa chọn hợp lệ!");
            }
        } while (c != 3);

        sc.close();
    }
}