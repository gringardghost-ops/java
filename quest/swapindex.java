package quest;

import module java.base;
public class swapindex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int a = scn.nextInt();
        int b = scn.nextInt();
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        scn.close();
    }
}
