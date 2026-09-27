package actual;


import java.util.Scanner;

public class gymmembership {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();
        int n = scn.nextInt();
        int b = scn.nextInt();
        int a = c;
        if (c % 2 != 0) {
            c = c + 1;

        }
        int y = (c / 2);
        int z = (n - 3);
        int f = y * z;
        
        int x = (3 * a) + f;
        System.out.println("total price: " + x);
        System.out.println(3 * a);
        System.out.println(a / 2);
        System.out.println(n - 3);
        if (x <= b) {
            System.out.print("affordable");
        }
        else {
            System.out.print("cannot afford");
        }
        scn.close();
    }
    
    
}
