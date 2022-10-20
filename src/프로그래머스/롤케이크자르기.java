package 프로그래머스;

import java.util.Map;
import java.util.HashMap;

class 롤케이크자르기 {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> bro1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> bro2 = new HashMap<Integer, Integer>();

        for(int i : topping) {
            bro1.put(i, bro1.getOrDefault(i, 0) + 1);
        }

        int i = 0;
        while(bro2.size() <= bro1.size()) {
            bro1.put(topping[i], bro1.get(topping[i]) - 1);
            bro2.put(topping[i], bro2.getOrDefault(topping[i], 0) + 1);

            if(bro1.get(topping[i]) == 0) {
                bro1.remove(topping[i]);
            }

            if(bro1.size() == bro2.size()) {
                answer++;
            }

            // System.out.println("bro1 : " + bro1.size() + ", bro2 : " + bro2.size());

            i++;
        }

        return answer;
    }
}
