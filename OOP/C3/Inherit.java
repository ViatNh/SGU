package OOP.C3;

abstract class Person {
    // Attribute
    private String hoten, phai, diachi;
    private int tuoi;

    // Constructor
    public Person() { this("", 0, "", ""); }
    public Person(String hoten, int tuoi, String phai, String diachi) {
        setHoten(hoten);
        setTuoi(tuoi);
        setPhai(phai);
        setDiachi(diachi);
    }

    // Methods
    public String getHoten() { return hoten; }
    public void setHoten(String hoten) { this.hoten = hoten; }
    public int getTuoi() { return tuoi; }
    public void setTuoi(int tuoi) { this.tuoi = tuoi < 0 ? 0 : tuoi; }
    public String getPhai() { return phai; }
    public void setPhai(String phai) { this.phai = phai; }
    public String getDiachi() { return diachi; }
    public void setDiachi(String diachi) { this.diachi = diachi; }

    public abstract void anUong();
    public abstract void diChuyen();

    @Override
    public String toString() {
        return "".formatted();
    }
}

class Student extends Person {
    // Attributes
    private String maHS, lop;
    private float diemToan, diemVan, diemAnh;

    // Constructor
    public Student() { this("", 0, "", "", "", "", 0, 0, 0); }
    public Student(String hoten, int tuoi, String phai, String diachi, String maHS, String lop, float diemToan, float diemVan, float diemAnh) {
        super(hoten, tuoi, phai, diachi);
        setMaHS(maHS);
        setLop(lop);
        setDiemToan(diemToan);
        setDiemVan(diemVan);
        setDiemAnh(diemAnh);
    }

    // Methods
    public String getMaHS() { return maHS; }
    public void setMaHS(String maHS) { this.maHS = maHS; }
    public String getLop() { return lop; }
    public void setLop(String lop) { this.lop = lop; }
    public float getDiemToan() { return diemToan; }
    public void setDiemToan(float diemToan) { this.diemToan = (diemToan < 0 || diemToan > 10) ? 0 : diemToan; }
    public float getDiemVan() { return diemVan; }
    public void setDiemVan(float diemVan) { this.diemVan = (diemVan < 0 || diemVan > 10) ? 0 : diemVan; }
    public float getDiemAnh() { return diemAnh; }
    public void setDiemAnh(float diemAnh) { this.diemAnh = (diemAnh < 0 || diemAnh > 10) ? 0 : diemAnh; }

    public void hocBai() {}
    public float getAvg() { return (diemToan + diemVan + diemAnh)/3; }

    @Override
    public void anUong() {}

    @Override
    public void diChuyen() {}

    @Override
    public String toString() {
        return "%s".formatted(super.toString());
    }
}

class Employee extends Person {
    // Attributes
    private String maNV, chucVu;
    private double luong;

    // Constructor
    public Employee() { this("", 0, "", "", "", "", 0); }
    public Employee(String hoten, int tuoi, String phai, String diachi, String maNV, String chucVu, double luong) {
        super(hoten, tuoi, phai, diachi);
        setMaNV(maNV);
        setChucvu(chucVu);
        setLuong(luong);
    }

    // Methods
    public String getMaNV() { return maNV; }
    public void setMaNV(String maNV) { this.maNV = maNV; }
    public String getChucvu() { return chucVu; }
    public void setChucvu(String chucVu) { this.chucVu = chucVu; }
    public double getLuong() { return luong; }
    public void setLuong(double luong) { this.luong = luong; }

    public void lamViec() {}
    public void vietReport() {}

    @Override
    public void anUong() {}

    @Override
    public void diChuyen() {}

    @Override
    public String toString() {
        return "".formatted();
    }
}

// class Manager {
//     // Attributes
//     private Student[] dsHS;
//     private Employee[] dsNV;

//     // Constructor
//     public Manager(Student[] dsHS, Employee[] dsNV) {
//         // setDsHS(dsHS);
//         // setDsNV(dsNV);
//     }
// }

public class Inherit {
    
}
