package 백준.다이나믹;

import java.util.*;

public class 더하기123 {
    static int[] arr = new int[11];

    public static void solution(int n) {
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        for(int i = 4; i < 11; i++) {
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        solution(n);

        for(int i = 0; i < n; i++) {
            int k = kb.nextInt();

            System.out.println(arr[k]);
        }
    }
}
