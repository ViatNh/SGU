package OOP.C2;

class SinhVien {
    private String msv, ho, ten;

    public SinhVien(String msv, String hoTen) {
        this.msv = msv;
        hoTen = hoTen.trim().replaceAll("\\s+", " ");
        int lastIdx = hoTen.lastIndexOf(" ");
        if (lastIdx != -1) {
            this.ho = hoTen.substring(0, lastIdx);
            this.ten = hoTen.substring(lastIdx + 1);
        }
        else {
            this.ho = "";
            this.ten = hoTen;
        }
    }

    public void setmsv(String msv) {
        this.msv = msv;
    }
    public void setHo(String ho) {
        this.ho = ho;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void reset() {
        this.msv = null;
        this.ho = null;
        this.ten = null;
    }

    @Override
    public String toString() {
        return "msv: %s\nHọ và tên: %s %s".formatted(msv, ho, ten);
    }
}

class ThiSinh {
    private String sbd, ho, ten;
    private float diem1, diem2, diem3;

    public ThiSinh(String sbd, String hoTen, float diem1, float diem2, float diem3) {
        this.sbd = sbd;
        hoTen = hoTen.trim().replaceAll("\\s+", " ");
        int lastIdx = hoTen.lastIndexOf(" ");
        if (lastIdx != -1) {
            this.ho = hoTen.substring(0, lastIdx);
            this.ten = hoTen.substring(lastIdx + 1);
        }
        else {
            this.ho = "";
            this.ten = hoTen;
        }
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getTongDiem() {
        return diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        float tong = getTongDiem();
        return "sbd: %s\nHọ và tên: %s %s\nĐiểm môn 1: %.2f\tĐiểm môn 2: %.2f\tĐiểm môn 3: %.2f\nTổng điểm: %.2f\nKết quả: %s\n".formatted(sbd, ho, ten, diem1, diem2, diem3, tong, (tong >= 15 ? "Đậu" : "Rớt"));
    }
}

public class ClassExample {
    // Bộ test từ Gemini :)))
    public static void main(String[] args) {
        System.out.println("=== KIỂM TRA SINH VIÊN ===");
        // Test trường hợp tên có đầy đủ họ tên và khoảng trắng thừa
        SinhVien sv1 = new SinhVien("B25DCCN001", "   Nguyen   Van   An  ");
        System.out.println(sv1);

        System.out.println("\n--- Test tên chỉ có 1 từ & hàm reset ---");
        SinhVien sv2 = new SinhVien("B25DCCN002", "Nam");
        System.out.println(sv2);
        
        sv2.reset();
        System.out.println("Sau khi reset:\n" + sv2);

        System.out.println("\n=== KIỂM TRA THÍ SINH ===");
        // Test thí sinh đậu (tổng >= 15)
        ThiSinh ts1 = new ThiSinh("TS01", "Tran Thi Mai", 6.5f, 7.0f, 8.0f);
        System.out.print(ts1);

        // Test thí sinh rớt (tổng < 15)
        ThiSinh ts2 = new ThiSinh("TS02", "Le Hoang", 4.0f, 5.0f, 4.5f);
        System.out.print(ts2);
    }
}
