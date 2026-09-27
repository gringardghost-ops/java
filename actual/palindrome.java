package actual;

import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int re = 0, nor = x;
        while (x > 0) {
            int i = 0;
            i = x % 10;
            re = re * 10 + i;
            x /= 10;
        }
        System.out.print(re + "  " + nor);
        scn.close();
    }
}
