package 백준.구현;

import java.util.*;

public class 덩치 {
    public static void solution(int[][] arr) {
        int[] bigCount = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            bigCount[i] = 1;
            for(int j = 0; j < arr.length; j++) {
                bigCount[i] += big(arr[i], arr[j]);
            }
        }

        System.out.print(Arrays.toString(bigCount).replaceAll("[^0-9 ]", ""));
    }

    public static int big(int[] a, int[] b) {
        return (a[0] < b[0] && a[1] < b[1]) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int arr[][] = new int[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = kb.nextInt();
            arr[i][1] = kb.nextInt();
        }

        solution(arr);
    }
}
