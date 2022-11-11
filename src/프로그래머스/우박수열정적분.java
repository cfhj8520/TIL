package 프로그래머스;

import java.util.List;
import java.util.ArrayList;

class 우박수열정적분 {
    public static void main(String[] args) {
        int k = 5;
        int[][] ranges = {
                {0,0},{0,-1},{2,-3},{3,-3}
        };

        for (double a : solution(k, ranges)) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];
        List<Integer> collatzKList = getCollatz(k);
        System.out.println(collatzKList);

        int index = 0;
        for (int[] range : ranges) {
            int start, end;

            if (range[0] <= collatzKList.size() + range[1] - 1) {
                start = range[0];
                end = collatzKList.size() + range[1] - 1;
            } else {
                answer[index++] = -1.0;
                continue;
            }

            double sum = 0;

            for (int i = start; i < end; i++) {
                sum += (double)(collatzKList.get(i) + collatzKList.get(i + 1)) / 2.0;
            }

            answer[index++] = sum;
            System.out.println(start + " " + end);
        }

        return answer;
    }

    static List<Integer> getCollatz(int k) {
        List<Integer> list = new ArrayList<>();
        list.add(k);

        while (k > 1) {
            if (k % 2 == 0) {
                k = k / 2;
                list.add(k);
            } else {
                k = k * 3 + 1;
                list.add(k);
            }
        }

        return list;
    }
}