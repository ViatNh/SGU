package OOP.TH5A;
import java.util.ArrayList;

// Hộ gia đình
class HoGiaDinh {
    // Attributes
    private String tenChuHo; // Tên chủ hộ
    private String diaChi; // địa chỉ
    private int chiSoCu; // chỉ số nước cũ
    private int chiSoMoi; // chỉ số nước mới
    public static final double DON_GIA = 8000.0; // đơn giá 8000đ

    // Constructor
    public HoGiaDinh() {}
    public HoGiaDinh(String tenChuHo, String diaChi, int chiSoMoi) { this(tenChuHo, diaChi, 0, chiSoMoi); }
    public HoGiaDinh(String tenChuHo, String diaChi, int chiSoCu, int chiSoMoi) {
        this.tenChuHo = tenChuHo;
        this.diaChi = diaChi;
        setChiSoCu(chiSoCu);
        setChiSoMoi(chiSoMoi);
    }

    // Get-Set Methods
    public String getTenChuHo() { return tenChuHo; }
    public void setTenChuHo(String tenChuHo) { this.tenChuHo = tenChuHo; }
    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public int getChiSoCu() { return chiSoCu; }
    public void setChiSoCu(int chiSoCu) { this.chiSoCu = Math.max(0, chiSoCu); }
    public int getChiSoMoi() { return chiSoMoi; }
    public void setChiSoMoi(int chiSoMoi) { this.chiSoMoi = Math.max(this.chiSoCu, chiSoMoi); }
    // Khối nước sử dụng = chỉ số mới – chỉ số cũ
    public int getKhoiNuoc() { return chiSoMoi - chiSoCu; }
    // Số nước phải trả tiền
    public int getSoNuoc() { return getKhoiNuoc(); }
    // Tiền nước = số nước phải trả tiền * 8000
    public double getTienNuoc() { return getSoNuoc() * DON_GIA; }

    @Override
    public String toString() {
        return "%-25s %-50s %10d %10d %10d %10d %20.2f"
        .formatted(tenChuHo, diaChi, chiSoCu, chiSoMoi, getKhoiNuoc(), getSoNuoc(), getTienNuoc());
    }
}

// Hộ gia đình loại A
class HoLoaiA extends HoGiaDinh {
    // Attributes
    private int nhanKhau; // số nhân khẩu

    // Constructor
    public HoLoaiA() {}
    public HoLoaiA(String tenChuHo, String diaChi, int chiSoCu, int chiSoMoi, int nhanKhau) {
        super(tenChuHo, diaChi, chiSoCu, chiSoMoi);
        setNhanKhau(nhanKhau);
    }

    // Get-Set Methods
    public int getNhanKhau() { return nhanKhau; }
    public void setNhanKhau(int nhanKhau) { this.nhanKhau = nhanKhau <= 0 ? 0 : nhanKhau; }

    // Số nước phải trả tiền = (khối nước sử dụng – 5* số nhân khẩu)
    @Override
    public int getSoNuoc() { return Math.max(0, super.getSoNuoc() - (5 * nhanKhau)); }
}

// Hộ gia đình loại B
class HoLoaiB extends HoGiaDinh {
    // mỗi hộ gia đình sẽ được miễn giảm 20 khối nưuơcs sử dụng
    public static final int MIEN_GIAM = 20;

    // Constructor
    public HoLoaiB() {}
    public HoLoaiB(String tenChuHo, String diaChi, int chiSoCu, int chiSoMoi) { super(tenChuHo, diaChi, chiSoCu, chiSoMoi); }

    // Số nước phải trả tiền = (khối nước sử dụng – MIEN_GIAM)
    @Override
    public int getSoNuoc() { return Math.max(0, (super.getSoNuoc() - MIEN_GIAM)); }
}

// Hộ gia đình loại C
class HoLoaiC extends HoGiaDinh {
    private int nhanKhau; // nhân khẩu phục vụ công tác
    public static final int MIEN_GIAM = 10; // Cứ mỗi nhân khẩu phục vụ công tác của chung cư được giảm 10 khối nước sử dụng

    // Constructor
    public HoLoaiC() {}
    public HoLoaiC(String tenChuHo, String diaChi, int chiSoCu, int chiSoMoi, int nhanKhau) {
        super(tenChuHo, diaChi, chiSoCu, chiSoMoi);
        setNhanKhau(nhanKhau);
    }

    // Get-Set Methods
    public int getNhanKhau() { return nhanKhau; }
    public void setNhanKhau(int nhanKhau) { this.nhanKhau = nhanKhau <= 0 ? 0 : nhanKhau; }

    // Số nước phải trả tiền = (khối nước sử dụng – MIEN_GIAM * số nhân khẩu)
    @Override
    public int getSoNuoc() { return Math.max(0, super.getSoNuoc() - (MIEN_GIAM * getNhanKhau())); }
}

public class Cau1 {
    public static void main(String[] args) {
        ArrayList<HoGiaDinh> danhSach = new ArrayList<>();

        danhSach.add(new HoLoaiA("Nguyen Van A", "P101", 1000, 130, 4));
        danhSach.add(new HoLoaiB("Tran Thi B", "P102", 50, 85));
        danhSach.add(new HoLoaiC("Le Van C", "P103", 10, 0, 2));

        double tongTien = 0;
        System.out.println("=== DANH SÁCH TIỀN NƯỚC HÀNG THÁNG ===");
        System.out.printf("%-25s %-50s %10s %10s %10s %10s %20s\n"
            , "Tên chủ hộ", "Địa chỉ", "Chỉ số cũ", "Chỉ số mới", "Khối nước", "Số nước", "Tiền nước");
        for (HoGiaDinh ho : danhSach) {
            System.out.println(ho);
            tongTien += ho.getTienNuoc();
        }

        System.out.printf("%n=> Tổng tiền thu được: %,.0f VNĐ%n", tongTien);
    }
}
