package quest;
import java.util.*;
public class character {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[] arr = new char[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scn.next().charAt(0);
        }
        // for (int i = 0; i < 5; i++) {
        // System.out.print(arr[i] + " ");
        // }
        System.out.print(arr);
        scn.close();
    }
}
