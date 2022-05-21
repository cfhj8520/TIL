package 백준.문자열;

import java.util.*;

public class 유기농배추 {
    static int[][] cabbages;
    static boolean visit[][];
    static int row, col;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};

    public static void dfs(int x, int y) {
        visit[x][y] = true;

        for(int i = 0; i < 4; i++) {
            int a = x + dx[i];
            int b = y + dy[i];

            if(a >= 0 && b >= 0 && a < row && b < col) {
                if(!visit[a][b] && cabbages[a][b] == 1) {
                    dfs(a, b);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int testcase = kb.nextInt();

        for(int i = 0; i < testcase; i++) {
            row = kb.nextInt();
            col = kb.nextInt();
            int n = kb.nextInt();
            int answer = 0;

            cabbages = new int[row][col];
            visit = new boolean[row][col];

            for(int j = 0; j < n; j++) {
                int a = kb.nextInt();
                int b = kb.nextInt();
                cabbages[a][b] = 1;
            }

            for(int j = 0; j < row; j++) {
                for(int k = 0; k < col; k++) {
                    if(!visit[j][k] && cabbages[j][k] == 1) {
                        dfs(j, k);

                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }
    }
}