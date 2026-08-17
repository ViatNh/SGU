package OOP.TH3;
import java.util.Scanner;

// Viết chương trình tính diện tích, chu vi hình chữ nhật.
// - Hãy viết lớp HinhChuNhat gồm có:
// + Attributes : chiều dài, chiều rộng.
// + Phương thức thiết lập (set), và lấy (get) thông tin chiều dài, chiều rộng.
// + Phương thức tính diện tích, chu vi.
// + Phương thức toString gồm các thông tin dài, rộng, diện tích, chu vi.
// - Xây dựng lớp chứa hàm main cho phần kiểm nghiệm. Dài rộng có thể nhập từ bàn
// phím.

class HinhChuNhat {
    // Attributes
    private float dai, rong;

    // Constructor
    public HinhChuNhat(float dai, float rong) {
        setDai(dai);
        setRong(rong);
    }

    // Get-Set Methods
    public void setDai(float dai) {
        this.dai = dai < 0 ? 0 : dai;
    }
    public float getDai() {
        return dai;
    }
    public void setRong(float rong) {
        this.rong = rong < 0 ? 0 : rong;
    }
    public float getRong() {
        return rong;
    }

    // Compute Methods
    public float getPerimeter() {
        return (dai + rong) * 2;
    }
    public float getArea() {
        return dai * rong;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật có:\nChiều dài: %.2f\tChiều rộng: %.2f\nChu vi: %.2f\tDiện tích: %.2f\n".formatted(dai, rong, getPerimeter(), getArea());
    }
}

public class Cau1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float dai, rong;
        do {
            System.out.print("Nhập chiều dài và chiều rộng của hình chữ nhật: ");
            dai = sc.nextFloat();
            rong = sc.nextFloat();
        } while (dai <= 0 || rong <= 0);

        HinhChuNhat h = new HinhChuNhat(dai, rong);
        System.out.print(h);

        sc.close();
    }
}
