package OOP.C2;
import java.util.Scanner;

class Student {
    // Field
    private String name;
    private int fee;
    private static int total = 0;

    // Constructor
    public Student(String name, int fee) {
        this.name = name;
        this.fee = fee;
        total += fee;
    }

    // Method
    @Override
    public String toString() {
        return "Tên: %s\nHọc phí: %d\n".formatted(name, fee);
    }
    public static int getTotal() {
        return total;
    }
}

public class StaticStudent {
    // Bộ test từ Gemini
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] ds = new Student[3];

        // 1. Nhập thông tin 3 sinh viên
        for (int i = 0; i < 3; i++) {
            System.out.printf("--- Nhập sinh viên thứ %d ---\n", i + 1);
            System.out.print("Nhập tên: ");
            String name = sc.nextLine();
            
            System.out.print("Nhập học phí: ");
            int fee = Integer.parseInt(sc.nextLine()); // Dùng để tránh trôi lệnh dòng tiếp theo

            ds[i] = new Student(name, fee);
        }

        // 2. Hiển thị thông tin 3 sinh viên
        System.out.println("\n=== DANH SÁCH SINH VIÊN ===");
        for (Student sv : ds) {
            System.out.println(sv);
        }

        // 3. Hiển thị tổng học phí (Gọi trực tiếp qua tên lớp Student)
        System.out.println("---------------------------");
        System.out.printf("Tổng học phí của 3 sinh viên: %d\n", Student.getTotal());
        
        sc.close();
    }
}