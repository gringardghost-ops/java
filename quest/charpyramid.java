package quest;

import java.util.Scanner;

public class charpyramid {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int num=86;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print((char) num + " ");
                num++;
                if (num > 90)
                    num = 65;
            }
            System.out.println();
        }
        scn.close();
    }
}
