package 백준.문자열;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 유기농배추 {
    static List<int[]> cabbages = new ArrayList<>();

    public static int solution(List<int[]> cabbages) {
        int answer = 0;

        while(!cabbages.isEmpty()) {
            int[] cabbage = cabbages.get(0);

            removeCabbage(cabbage);
            System.out.println("test");

            answer++;
        }

        return answer;
    }

    public static void removeCabbage(int[] cabbage) {
        System.out.println(cabbage[0] + " " + cabbage[1]);
        cabbages.remove(cabbages.indexOf(cabbage));

        int[] a = {cabbage[0] - 1, cabbage[1]};
        int[] b = {cabbage[0], cabbage[1] - 1};
        int[] c = {cabbage[0] + 1, cabbage[1]};
        int[] d = {cabbage[0], cabbage[1] + 1};

        List<int[]> list = new ArrayList<>(Stream.of(a, b, c, d).collect(Collectors.toList()));

        for(int[] i : list) {
            boolean test = cabbages.contains(i);
            System.out.println(test);
            if(cabbages.contains(i)) {
                removeCabbage(i);
            }
        }
    }

    public static boolean checkRange(int row, int col, int[] cab) {
        return cab[0] > 0 && cab[1] > 0 && cab[0] < row && cab[1] < col;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int testcase = kb.nextInt();

        for(int i = 0; i < testcase; i++) {
            int row = kb.nextInt();
            int col = kb.nextInt();
            int n = kb.nextInt();

            for(int j = 0; j < n; j++) {
                cabbages.add(new int[] {kb.nextInt(), kb.nextInt()});
            }

            System.out.println(solution(cabbages));
        }
    }
}