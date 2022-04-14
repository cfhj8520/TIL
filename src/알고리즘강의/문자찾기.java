package 알고리즘강의;

import java.util.Scanner;

public class 문자찾기 {
    public static int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == t) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.print(solution(str, c));
    }
}
