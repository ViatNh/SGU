package OOP.TH1;

// Câu 13. Viết chương trình in ra giá trị lớn nhất và 
// nhỏ nhất trong một dãy các giá trị user đã nhập vào từ tham số command line.

public class Cau13 {
    public static void main(String[] args) {
        int[] intArr = new int[args.length];

        for (int i = 0; i < args.length; i++)
            intArr[i] = Integer.parseInt(args[i]);

        int min, max;
        min = max = intArr[0];
        for (int x : intArr) {
            min = x < min ? x : min;
            max = x > max ? x : max;
        }

        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
    }
}
