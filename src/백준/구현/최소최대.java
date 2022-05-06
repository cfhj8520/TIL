package 백준.구현;

import java.util.*;

public class 최소최대 {
    public static void solution(int n, int[] arr) {
        Arrays.sort(arr);

        System.out.print(arr[0] + " " + arr[n-1]);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        solution(n, arr);
    }
}
