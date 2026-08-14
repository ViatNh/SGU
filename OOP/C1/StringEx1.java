package OOP.C1;
import java.util.Scanner;

// Viết chương trình nhập vào một chuỗi text và 
// in ra các kí tự viết hoa có trong chuỗi.
// Tính tổng các kí tự là số có trong chuỗi.

public class StringEx1 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập chuỗi: ");
        String st = sc.nextLine();

        int sum = 0;
        System.out.print("Các kí tự viết hoa: ");
        for (int i = 0; i < st.length(); i++) {
            char chr = st.charAt(i);
            if (Character.isUpperCase(chr))
                System.out.printf("%c ", chr);
            if (Character.isDigit(chr))
                sum += Character.getNumericValue(chr);
        }
        System.out.println("\nTổng các ký tự số: " + sum);

        sc.close();
    }
}
