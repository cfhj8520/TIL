package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

class 두큐합같게만들기 {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        long sum1 = 0L;
        long sum2 = 0L;

        Queue<Integer> que1 = new LinkedList<>();
        Queue<Integer> que2 = new LinkedList<>();

        for(int i = 0; i < queue1.length; i++) {
            que1.add(queue1[i]);
            sum1 += queue1[i];
        }

        for(int i = 0; i < queue2.length; i++) {
            que2.add(queue2[i]);
            sum2 += queue2[i];
        }

        long fail = (sum1 + sum2) / 2L;

        if((sum1 + sum2) % 2L == 1L) {
            return -1;
        }

        while(sum1 != sum2) {
            if(sum1 > sum2) {
                int tmp = que1.peek();

                if(tmp > fail) {
                    return -1;
                }

                que1.poll();
                que2.add(tmp);
                sum1 -= tmp;
                sum2 += tmp;
            } else {
                int tmp = que2.peek();

                if(tmp > fail) {
                    return -1;
                }

                que2.poll();
                que1.add(tmp);
                sum2 -= tmp;
                sum1 += tmp;
            }
            answer++;

            if(answer > 300000) {
                return -1;
            }
        }

        return answer;
    }
}