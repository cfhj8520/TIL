package 프로그래머스;

import java.util.*;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class 게임맵최단거리 {
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int mapX, mapY;
    static int[][] maps =
//            {
//            {1,0,1,1,1},
//            {1,0,1,0,1},
//            {1,0,1,1,1},
//            {1,1,1,0,1},
//            {0,0,0,0,1}
//    };
    {{1,1,1,1,1,1}};

    public static void main(String[] args) {
        System.out.println(solution(maps));
    }

    public static int solution(int[][] maps) {
        int answer = 0;
        mapX = maps.length;
        mapY = maps[0].length;

        bfs(maps, 0, 0);

        if (maps[mapX - 1][mapY - 1] == 1) {
            answer = -1;
        } else {
            answer = maps[mapX - 1][mapY - 1];
        }

        return answer;
    }

    static void bfs(int[][] maps, int x, int y) {
        Queue<Point> que = new LinkedList<>();
        que.offer(new Point(x, y));
        maps[x][y] = 1;

        while(!que.isEmpty()) {
            Point position = que.poll();

            if (position.x == mapX - 1 && position.y == mapY - 1) {
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = position.x + dx[i];
                int ny = position.y + dy[i];

                if (nx >= 0 && nx < mapX && ny >= 0 && ny < mapY) {
                    System.out.println("mapX : " + mapX + ", mapY : " + mapY);
                    System.out.println(nx + " " + ny);
                    if (maps[nx][ny] == 1) {
                        que.offer(new Point(nx, ny));
                        maps[nx][ny] = maps[position.x][position.y] + 1;
                    }
                }
            }
        }

        // for (int[] tmp : maps) {
        //     for (int ttmp : tmp) {
        //         System.out.print(ttmp + " ");
        //     }
        //     System.out.println();
        // }
    }
}