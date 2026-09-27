package actual;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int s = sum(a, b);
        System.out.print(s);
        scn.close();
    }

    public static int sum(int a, int b) {
        int s = a + b;
        return s;
    }
    
}
