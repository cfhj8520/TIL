package 백준;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class 그룹단어체커 {
    public static int solution(String[] strArray) {
        int answer = 0;

        for (int i = 0; i < strArray.length; i++) {
            List<Character> list = new ArrayList<>();
            char[] str = strArray[i].toCharArray();
            char tmp = '.';
            boolean b = true;

            for (char a : str) {
                if (list.contains(a)) {
                    if (tmp == a) {
                        continue;
                    } else {
                        b = false;
                        break;
                    }
                } else {
                    list.add(a);
                    tmp = a;
                }
            }

            if (b) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int a = kb.nextInt();
        String[] strArray = new String[a];

        for (int i = 0; i < a; i++) {
            strArray[i] = kb.next();
        }

        System.out.print(solution(strArray));
    }
}