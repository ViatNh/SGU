package OOP.TH3;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.Year;

// Để quản lý hồ sơ học sinh của trường THPT, người ta cần quản lý các thông tin sau:
// - Các thông tin về: lớp, khóa học, kỳ học, và các thông tin cá nhân của mỗi học sinh.
// - Mỗi học sinh, các thông tin cá nhân cần quản lý gồm: Họ và tên, tuổi, năm sinh, quê quán.
// a. Hãy xây dựng lớp Nguoi để quản lý các thông tin cá nhân của mỗi học sinh.
// b. Xây dựng lớp HocSinh để quản lý các thông tin về mỗi học sinh.
// c. Xây dựng các phương thức: nhập, hiển thị các thông tin về mỗi cá nhân.
// d. Cài đặt chương trình thực hiện các công việc sau:
//  Nhập vào 1 danh sách gồm n học sinh (n nhập từ bàn phím)
//  Hiển thị ra màn hình các học sinh có năm sinh 1985
//  Cho biết có bao nhiêu học sinh sinh năm 1985 và có quê ở Nghệ An.

class Nguoi {
    // Attribute
    private String hoten, que;
    private int yob;

    // Constructor
    public Nguoi() {
        this("", 0, "");
    }
    public Nguoi(String hoten, int yob, String que) {
        setHoten(hoten);
        setYOB(yob);
        setQue(que);
    }

    // Methods
    public String getHoten() { return hoten; }
    public void setHoten(String hoten) { this.hoten = hoten; }
    public int getYOB() { return yob; }
    public void setYOB(int yob) { this.yob = (yob < 0 || yob > Year.now().getValue()) ? 0 : yob; }
    public int getTuoi() { return Year.now().getValue() - yob; }
    public String getQue() { return que; }
    public void setQue(String que) { this.que = que; }

    @Override
    public String toString() {
        return "%-25s %10d %5d %-30s".formatted(hoten, yob, getTuoi(), que);
    }
}

class HocSinh {
    // Attribute
    private String lop, khoa, ky;
    private Nguoi hs;

    // Constructor
    public HocSinh() { this(new Nguoi(), "", "", ""); }
    public HocSinh(Nguoi hs, String lop, String khoa, String ky) {
        setHS(hs);
        setLop(lop);
        setKhoa(khoa);
        setKy(ky);
    }

    // Methods
    public Nguoi getHS() { return hs; }
    public void setHS(Nguoi hs) { this.hs = hs; }
    public String getLop() { return lop; }
    public void setLop(String lop) { this.lop = lop; }
    public String getKhoa() { return khoa; }
    public void setKhoa(String khoa) { this.khoa = khoa; }
    public String getKy() { return ky; }
    public void setKy(String ky) { this.ky = ky; }

    @Override
    public String toString() {
        return "%s %-10s %-5s %-10s".formatted(hs, lop, khoa, ky);
    }
}

public class Cau6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số lượng học sinh: ");
            n = Integer.parseInt(sc.nextLine());
        } while (n < 0);

        ArrayList<HocSinh> ds = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            Nguoi person = new Nguoi();
            System.out.println("Học sinh thứ " + (i + 1));
            System.out.print("\tHọ và tên: ");
            person.setHoten(sc.nextLine());
            System.out.print("\tNăm sinh: ");
            person.setYOB(Integer.parseInt(sc.nextLine()));
            System.out.print("\tQuê quán: ");
            person.setQue(sc.nextLine());

            HocSinh hs = new HocSinh();
            hs.setHS(person);
            System.out.print("\tLớp: ");
            hs.setLop(sc.nextLine());
            System.out.print("\tKhóa: ");
            hs.setKhoa(sc.nextLine());
            System.out.print("\tKỳ: ");
            hs.setKy(sc.nextLine());

            ds.add(hs);
        }

        System.out.printf("%-25s %10s %5s %-30s %-10s %-5s %-10s\n", 
        "Họ và tên", "Năm sinh", "Tuổi", "Quê quán", "Lớp", "Khóa", "Kỳ");

        int count = 0;
        for (HocSinh x : ds) {
            if (x.getHS().getYOB() == 1985) {
                System.out.println(x);
                if (x.getHS().getQue().trim().equalsIgnoreCase("Nghệ An")) count++;
            }
        }
        System.out.printf("Có %d học sinh sinh năm 1985 và có quê ở Nghệ An.", count);
        
        sc.close();
    }
}
