package quest;

public class greaterthanitself {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 2, 2, 3 };
        int m = arr[0];
        int c = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > m) {
                m = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (m == arr[i]) {
                c++;
            }
        }
        System.out.print(arr.length - c);
    }
}
