package 백준;

import java.util.*;

public class 수정렬하기 {
    public static void solution(int[] arr) {
        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        solution(arr);
    }
}
