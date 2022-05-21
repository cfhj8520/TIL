package 백준.그래프탐색;

import java.util.*;

public class 수열의합 {
    public static int[] solution(int n, int l) {
        int[] answer;
        int sum = 0;

        for(int i = 0; i < l; i++) {
            sum += i;
        }

        answer = func(n, l, sum);

        return answer;
    }

    private static int[] func(int n, int l, int sum) {
        int[] answer;

        if(check(n, l, sum)) {
            answer = new int[l];
            int k = (n - sum) / l;

            for(int i = 0; i < l; i++) {
                answer[i] = i + k;
            }
        } else {
            if(l >= 100 || sum > n) {
                answer = new int[] {-1};
            } else {
                answer = func(n, l + 1, sum + l);
            }
        }

        return answer;
    }

    private static boolean check(int n, int l, int sum) {
        if((n - sum) % l == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int l = kb.nextInt();

        int[] arr = solution(n, l);

        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }
}