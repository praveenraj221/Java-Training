package Patterns;

public class Pyramid {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            int space = n - i - 1;
            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }
            int star = 2 * i + 1;
            for(int k = 0; k < star; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
