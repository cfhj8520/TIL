package 프로그래머스;

class 점찍기 {
    public long solution(int k, int d) {
        long answer = 0;
        long dd = (long)d * (long)d;

        for (long i = 0; i <= (long)d; i += (long)k) {
            answer += (long)Math.sqrt(dd - i * i) / k + 1;
        }

        return answer;
    }
}