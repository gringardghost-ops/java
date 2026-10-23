package actual;
import java.util.*;
public class numdiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1, nsp = n - 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= nsp; j++)
                System.out.print("  ");

            int mid = (nst + 1) / 2;

            for (int k = 1; k <= mid; k++)
                System.out.print(k + " ");

            for (int k = mid - 1; k >= 1; k--)
                System.out.print(k + " ");

            System.out.println();

            if (i < n) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }
        }
        sc.close();
    }
}

