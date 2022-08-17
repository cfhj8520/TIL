package 백준.다이나믹;

import java.util.*;

public class 타일링 {
    static int[] arr = new int[1001];

    public static void solution() {
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 3; i < 1001; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];

            if(arr[i] > 10007) {
                arr[i] = arr[i] % 10007;
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int k = kb.nextInt();

        solution();

        System.out.println(arr[k]);
    }
}
