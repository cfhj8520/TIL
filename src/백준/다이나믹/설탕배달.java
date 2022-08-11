package 백준.다이나믹;

import java.util.*;

public class 설탕배달 {
    public static int solution(int n) {
        int answer = -1;

        if((n < 5 && n != 3) || n == 7) {
            return answer;
        }

        switch(n % 5) {
            case 0 : answer = n / 5; break;
            case 1 : case 3 : answer = n / 5 + 1; break;
            case 2 : case 4 : answer = n / 5 + 2; break;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(solution(n));
    }
}
