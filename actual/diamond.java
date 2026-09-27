package actual;
import java.util.Scanner;
public class diamond {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if (x%2 != 0){
            x=x+1;
        }
        for (int i = 1; i <= x; i++) {
            for (int j = x / 2; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= x / 2+1; k=k+2) {
                System.out.print("*");
            }
            System.out.println();
        }
    scn.close();
    }
}
