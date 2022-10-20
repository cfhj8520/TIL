package 프로그래머스;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<String, Integer> MBTI = new HashMap<String, Integer>();
        MBTI.put("RT", 0);
        MBTI.put("TR", 0);
        MBTI.put("CF", 0);
        MBTI.put("FC", 0);
        MBTI.put("JM", 0);
        MBTI.put("MJ", 0);
        MBTI.put("AN", 0);
        MBTI.put("NA", 0);

        for(int i = 0; i < survey.length; i++) {
            MBTI.put(survey[i], MBTI.get(survey[i]) + choices[i] - 4);
        }

        if(MBTI.get("RT") - MBTI.get("TR") <= 0) {
            answer += "R";
        } else {
            answer += "T";
        }

        if(MBTI.get("CF") - MBTI.get("FC") <= 0) {
            answer += "C";
        } else {
            answer += "F";
        }

        if(MBTI.get("JM") - MBTI.get("MJ") <= 0) {
            answer += "J";
        } else {
            answer += "M";
        }

        if(MBTI.get("AN") - MBTI.get("NA") <= 0) {
            answer += "A";
        } else {
            answer += "N";
        }

        return answer;
    }
}
