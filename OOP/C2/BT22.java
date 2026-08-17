package OOP.C2;

class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }
    public void display() {
        System.out.printf("x = %.2f, y = %.2f\n", x, y);
    }
}

public class BT22 {
    public static void main(String[] args) {
        Point p = new Point(2, 3);
        p.display();
        p.move(3, 4);
        p.display();
    }
}
