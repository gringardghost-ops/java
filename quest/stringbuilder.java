package quest;
import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        s.append('a');
        s.append("abcde");
        s.append(50);
        System.out.println(s);
        System.out.println(s.charAt(2));
        s.delete(1, 3);
        System.out.println(s);
        s.deleteCharAt(1);
        System.out.println(s);
        System.out.println(s.length());
        scn.close();
    }
}
