package quest;

public class maxelement {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 2, 9 };
        int a = maxel(arr);
        System.out.print(a);
    }

    public static int maxel(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        return m;
    }

}
