package 백준.구현;

import java.util.Scanner;

class 크로아티아알파벳 {
    public static long solution(String str) {
        int answer = 0;
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(String cro : croatia) {
            str = str.replaceAll(cro, "1");
        }

        return str.length();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}