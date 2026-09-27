package actual;


import java.util.Scanner;
public class rightangled {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int k = 1; k <=i; k++) {
                System.out.print(" ");
            }
            for (int j = x; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    scn.close();
    }
}
