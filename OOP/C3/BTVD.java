package OOP.C3;

// Hãy in thông tin chu vi, diện tích, độ dài cạnh, chiều dài, chiều rộng của hình vuông và hình chữ nhật nếu biết thông tin 4 đỉnh hình vuông, hình chữ nhật đó.

class Point {
    // Attribute
    private double x, y;

    // Constructor
    public Point() { this(0, 0); }
    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    // Methods
    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }
    public double getDistance(Point p) { // d = sqrt((x2-x1)^2 + (y2-y1)^2)
        return Math.sqrt(Math.pow(x - p.x,  2) + Math.pow(y - p.y, 2));
    }
    
    @Override
    public String toString() {
        return "(%.2f, %.2f)".formatted(x, y);
    }
}

abstract class Shape {
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Rectangle extends Shape {
    // Attributes
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    // Constructor
    public Rectangle() { this(new Point(), new Point(), new Point(), new Point()); }
    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        setP1(p1);
        setP2(p2);
        setP3(p3);
        setP4(p4);
    }

    // Methods
    public Point getP1() { return p1; }
    public void setP1(Point p1) { this.p1 = p1; }
    public Point getP2() { return p2; }
    public void setP2(Point p2) { this.p2 = p2; }
    public Point getP3() { return p3; }
    public void setP3(Point p3) { this.p3 = p3; }
    public Point getP4() { return p4; }
    public void setP4(Point p4) { this.p4 = p4; }
    public double getLength() { return p1.getDistance(p2); }
    public double getWidth() { return p1.getDistance(p4); }

    @Override
    public double getPerimeter() { return (getLength() + getWidth()) * 2; }

    @Override
    public double getArea() { return getLength() * getWidth(); }

    @Override
    public String toString() {
        return "Chu vi: %.2f\tDiện tích: %.2f\nChiều dài: %.2f\tChiều rộng: %.2f".
        formatted(getPerimeter(), getArea(), getLength(), getWidth());
    }
}

class Square extends Rectangle {
    // Attribute kế thừa từ Rectangle
    // Constructor
    public Square() { this(new Point(), new Point(), new Point(), new Point()); }
    public Square(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
    }

    // Methods kế thừa từ Rectangle

    @Override
    public String toString() {
        return "Chu vi: %.2f\tDiện tích: %.2f\nĐộ dài: %.2f".
        formatted(getPerimeter(), getArea(), getLength());
    }
}

public class BTVD {
    // Bộ test của Gemini
    public static void main(String[] args) {
        Point r1 = new Point(0, 0);
        Point r2 = new Point(6, 0);
        Point r3 = new Point(6, 4);
        Point r4 = new Point(0, 4);
        Rectangle hcn = new Rectangle(r1, r2, r3, r4);

        // Tọa độ 4 đỉnh hình vuông: (0,0), (5,0), (5,5), (0,5) -> Cạnh 5
        Point s1 = new Point(0, 0);
        Point s2 = new Point(5, 0);
        Point s3 = new Point(5, 5);
        Point s4 = new Point(0, 5);
        Square hv = new Square(s1, s2, s3, s4);

        System.out.println("\nHình chữ nhật\n" + hcn);
        System.out.println("\nHình vuông\n" + hv);
    }
}
