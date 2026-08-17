package OOP.C2;
import java.util.Scanner;

class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getCircumference() {
        return radius * 2 * (float)Math.PI;
    }
    public float getArea() {
        return radius * radius * (float)Math.PI;
    }
}

class Rectangle {
    private int dai, rong;

    public Rectangle(int dai, int rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public int getDai() {
        return dai;
    }
    public void setDai(int dai) {
        this.dai = dai;
    }
    public int getRong() {
        return rong;
    }
    public void setRong(int rong) {
        this.rong = rong;
    }

    public int getPerimeter() {
        return (dai + rong) * 2;
    }
    public int getArea() {
        return dai * rong;
    }
}

class PTB1 {
    private float a, b;

    public PTB1(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }
    public void setA(float a) {
        this.a = a;
    }
    public float getB() {
        return b;
    }
    public void setB(float b) {
        this.b = b;
    }

    public String getResult() {
        if (a == 0) {
            if (b == 0)
                return "Phương trình có vô số nghiệm";
            else
                return "Phương trình vô nghiệm";
        }
        else
            return "Phương trình có nghiệm x = " + (-b/a);
    }
}

public class BT21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Nhập vào bán kính: ");
        // float radius = sc.nextFloat();
        // Circle c = new Circle(radius);
        
        // System.out.println("Chu vi hình tròn: " + c.getCircumference());
        // System.out.println("Diện tích hình tròn: " + c.getArea());


        // System.out.print("Nhập vào chiều dài và chiều rộng của hình chữ nhật: ");
        // int dai = sc.nextInt();
        // int rong = sc.nextInt();
        // Rectangle r = new Rectangle(dai, rong);
        
        // System.out.println("Chu vi hình chữ nhật: " + r.getPerimeter());
        // System.out.println("Diện tích hình chữ nhật: " + r.getArea());

        System.out.print("Nhập vào a và b trong phương trình bậc 1: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        PTB1 p = new PTB1(a, b);

        System.out.println(p.getResult());

        sc.close();
    }
}
