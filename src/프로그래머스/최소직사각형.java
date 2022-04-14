package 프로그래머스;

import java.util.Arrays;

public class 최소직사각형 {
    public int solution(int[][] sizes) {
        int w = -1;
        int h = -1;

        for(int i = 0 ; i < sizes.length ; i++) {
            Arrays.sort(sizes[i]);
            if (w < sizes[i][1]) w = sizes[i][1];
            if (h < sizes[i][0]) h = sizes[i][0];
        }

        return w*h;
    }
}
