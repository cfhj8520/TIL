package 프로그래머스;

class 문자열나누기 {
    public int solution(String s) {
        int answer = 0;
        char[] s_charArray = s.toCharArray();
        int count = 0;
        char x = 'a';

        for (int i = 0; i < s_charArray.length; i++) {
            if (count == 0) {
                // System.out.println();
                // System.out.print(s_charArray[i]);
                count = 1;
                x = s_charArray[i];
                answer++;

                continue;
            }

            if (s_charArray[i] == x) {
                // System.out.print(s_charArray[i]);
                count++;
            } else {
                // System.out.print(s_charArray[i]);
                count--;
            }
        }


        return answer;
    }
}
