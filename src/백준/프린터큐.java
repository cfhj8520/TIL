package 백준;

import java.util.*;

class 프린터큐 {
    public static int solution(int n, int doc, Queue<int[]> queue) {
        int seq = 1;
        int docSeq = 0;

        while(!queue.isEmpty()){
            if(checkPriority(queue)) {
                if(queue.peek()[0] == doc) {
                    docSeq = seq;
                }
                queue.poll();
                seq++;
            } else {
                queue.add(queue.poll());
            }
        }

        return docSeq;
    }

    public static boolean checkPriority(Queue<int[]> queue) {
        boolean check = false;
        int doc = queue.peek()[1];

        for(int[] priority : queue) {
            if(priority[1] > doc) {
                check = true;
            }
        }

        return check;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int testCase = kb.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < testCase; i++) {
            int n = kb.nextInt();
            int doc = kb.nextInt();
            Queue<int[]> queue = new ArrayDeque<>();

            for(int j = 0; j < n; j++) {
                int priority = kb.nextInt();

                int[] arr = {j, priority};
                queue.add(arr);
            }

            list.add(solution(n, doc, queue));
        }

        for(int i : list) {
            System.out.println(i);
        }
    }
}