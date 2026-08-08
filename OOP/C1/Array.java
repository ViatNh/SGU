package OOP.C1;

public class Array {
    public static void main(String[] args) {
        int[] m1 = new int[5];
        int[] m2 = new int[]{1, 2, 3, 4, 5};

        int[][] m3 = new int[3][];
        int[][] m4 = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7},
            {8, 9}
        };

        // duyệt mảng
        for (int x : m2) {
            System.out.printf("%3d ", x);
        }
        System.out.print("\n");

        for (int i = 0; i < m4.length; i++) {
            for (int j = 0; j < m4[i].length; j++)
                System.out.printf("%3d ", m4[i][j]);
            System.out.print("\n");
        }
    }
}