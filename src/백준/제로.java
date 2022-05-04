package 백준;

import java.util.*;

public class 제로 {
    public static int solution(int n, int[] arr) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }

        while(!stack.empty()) {
            answer += stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
