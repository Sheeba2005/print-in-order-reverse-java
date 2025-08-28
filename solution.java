import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        boolean first = true;

        // 1 to N
        for (int i = 1; i <= N; i++) {
            if (!first) sb.append(' ');
            sb.append(i);
            first = false;
        }

        // N to 1
        for (int i = N; i >= 1; i--) {
            sb.append(' ').append(i);
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
