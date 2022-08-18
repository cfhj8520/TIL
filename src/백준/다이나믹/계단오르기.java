package 백준.다이나믹;

import java.util.*;

public class 계단오르기 {
    static int[] arr = new int[301];
    static int[] dp = new int[301];

    public static int solution(int n) {
        dp[0] = arr[0];
        dp[1] = arr[0] + arr[1];
        dp[2] = max(arr[0] + arr[2], arr[1] + arr[2]);

        for(int i = 3; i < n; i++) {
            dp[i] = max(dp[i-2] + arr[i], arr[i-1] + arr[i] + dp[i-3]);
        }

        return dp[n-1];
    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n));
    }
}
