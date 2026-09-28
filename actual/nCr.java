package actual;

import java.util.Scanner;
public class nCr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        int x = n - r;
        int res1 = 1, res2 = 1, res3 = 1;
        for (int i = 1; i <= n; i++) {
            res1 = res1 * i;
        }
        for (int i = 1; i <= r; i++) {
            res2 = res2 * i;
        }
        for (int i = 1; i <= x; i++) {
            res3 = res3 * i;
        }
        System.out.print(res1 / (res2 * res3));
        scn.close();
    }
}
