package 백준.문자열;

import java.util.*;

public class 어린왕자 {
    public static int solution(int[] start, int[] end, List<int[]> planets) {
        int answer = 0;
        int x = start[0];
        int y = start[1];
        int a = end[0];
        int b = end[1];

        for(int[] planet : planets) {
            boolean insidePlanetStart = (Math.pow(x - planet[0],2) + Math.pow(y - planet[1],2)) < Math.pow(planet[2], 2);
            boolean insidePlanetEnd = (Math.pow(a - planet[0],2) + Math.pow(b - planet[1],2)) < Math.pow(planet[2], 2);

            if(insidePlanetStart ^ insidePlanetEnd) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int testcase = kb.nextInt();

        for(int i = 0; i < testcase; i++) {
            int[] start = {kb.nextInt(), kb.nextInt()};
            int[] end = {kb.nextInt(), kb.nextInt()};
            int n = kb.nextInt();
            List<int[]> planets = new ArrayList<>();

            for(int j = 0; j < n; j++) {
                planets.add(new int[] {kb.nextInt(), kb.nextInt(), kb.nextInt()});
            }

            System.out.println(solution(start, end, planets));
        }
    }
}
