package 프로그래머스;

public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int sum = 0;

        for (int i = 0 ; i < numbers.length ; i++) {
            sum += numbers[i];
        }

        return 45 - sum;
    }
}
