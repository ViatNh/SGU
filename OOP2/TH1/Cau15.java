package OOP2.TH1;

// Viết chương trình in ra giá trị lớn nhất và 
// nhỏ nhất trong một dãy các giá trị user đã nhập vào từ tham số command line.

public class Cau15 {
    public static void main(String[] args) {
        float min, max;
        min = max = Float.parseFloat(args[0]);
        for (int i = 1; i < args.length; i++) {
            float tmp = Float.parseFloat(args[i]);
            min = tmp < min ? tmp : min;
            max = tmp > max ? tmp : max;
        }
        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}
