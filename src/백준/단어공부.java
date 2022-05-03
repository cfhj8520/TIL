package 백준;

import java.util.*;

public class 단어공부 {
    public static Character solution(String str) {
        char answer = '?';
        char[] strArr = str.toUpperCase().toCharArray();
        Map<Character, Integer> strHash = new HashMap<>();

        for(char a : strArr) {
            strHash.put(a, strHash.getOrDefault(a,0)+1);
        }

        int maxCount = Collections.max(strHash.values());
        List<Character> list = new ArrayList<>();

        for(char key : strHash.keySet()) {
            int value = strHash.get(key);

            if(value == maxCount) {
                list.add(key);
            }
        }

        if(list.size() == 1) {
            answer = list.get(0);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}
