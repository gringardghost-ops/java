package actual;

import java.util.Scanner;

public class revarray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n ; i++){
            arr[i]=scn.nextInt();
        }
        revarr(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        scn.close();

    }
    public static void revarr(int[] arr, int n){
      int j = n-1;
      for (int i = 0; i<n/2 ; i++){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j--;
      }
    }
    }


