package 백준.문자열;

import java.util.*;

public class 피보나치함수 {
    static int[] fibo = new int[41];

    public static void solution(int n) {
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i <= n; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.println(fibo[n-1] + " " + fibo[n]);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                System.out.println("1 0");
            } else {
                solution(arr[i]);
            }
        }
    }
}
