package 백준.다이나믹;

import java.util.*;

public class 하나로만들기 {
    static int[] arr = new int[1000001];

    public static int solution(int n) {
        for(int i = 2; i < 1000001; i++) {
            arr[i] = arr[i - 1] + 1;

            if(i % 2 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 2] + 1);
            }
            if(i % 3 == 0) {
                arr[i] = Math.min(arr[i], arr[i / 3] + 1);
            }
        }

        return arr[n];
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(solution(n));
    }
}
