package 백준.다이나믹;

import java.util.*;

public class RGB거리 {
    static int[][] arr;
    static int[][] dp;

    public static int solution(int n) {
        dp = new int[n][3];
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for(int i = 1; i < n; i++) {
            dp[i][0] = min(dp[i - 1][1], dp[i - 1][2]) + arr[i][0];
            dp[i][1] = min(dp[i - 1][0], dp[i - 1][2]) + arr[i][1];
            dp[i][2] = min(dp[i - 1][0], dp[i - 1][1]) + arr[i][2];
        }

        Arrays.sort(dp[n-1]);

        return dp[n-1][0];
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        arr = new int[n][3];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(solution(n));
    }
}
