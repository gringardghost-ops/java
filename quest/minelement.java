package quest;

public class minelement {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 7, 9, 2 };
        int a = minel(arr);
        System.out.print(a);
    }

    public static int minel(int[] arr) {
        int m = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < m) {
                m = arr[i];
            }
        }
        return m;
    }
}
