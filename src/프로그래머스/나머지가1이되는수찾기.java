package 프로그래머스;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 2;

        while(n % answer != 1) {
            answer++;
        }

        return answer;
    }
}
