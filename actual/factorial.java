package actual;

import java.util.Scanner;
public class factorial {
    public static int fact(int a) {
        int res1 = 1;
        for (int i = 1; i <= a; i++) {
            res1 = res1 * i;
        }
        return res1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.print(fact(a));
        scn.close();
    }
}
