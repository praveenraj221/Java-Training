package Patterns;

public class InvertedPyramid {
    public static void main(String[] args) {


        int n = 4;
        for (int i = n - 1; i >= 0; i--) {
            int space = n - i - 1;
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            int star = 2 * i + 1;
            for (int k = 0; k < star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
