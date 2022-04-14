package 프로그래머스;

import java.util.Arrays;

public class 신고결과받기 {
    public int[] solution(String[] id_list, String[] report, int k) {

        int[][] reportArray = readReport(id_list, report);

        int[] answer = feedback(reportArray, k);

        return answer;
    }

    //reportArray[신고한사람][신고받은사람]
    public int[][] readReport(String[] id_list, String[] report) {
        int[][] reportArray = new int[id_list.length][id_list.length];

        for (int i = 0 ; i < report.length ; i++) {
            String[] reportId = report[i].split(" ");
            int reporterIdIndex = findIndexFromName(id_list, reportId[0]);
            int reportedIdIndex = findIndexFromName(id_list, reportId[1]);

            reportArray[reporterIdIndex][reportedIdIndex]++;
        }

        // for(int i = 0 ; i < reportArray.length ; i++) {
        //     for(int j = 0 ; j < reportArray[i].length ; j++) {
        //         System.out.print(reportArray[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        return reportArray;
    }

    public int findIndexFromName(String[] id_list, String name) {
        return Arrays.asList(id_list).indexOf(name);
    }

    public int[] feedback(int[][] reportArray, int k) {
        int[] feedbackArray = new int[reportArray[0].length];

        for(int i = 0 ; i < feedbackArray.length ; i++) {
            feedbackArray[i] = countBan(reportArray, k, i);
        }

        return feedbackArray;
    }

    //index는 신고결과를 받는 사람
    public int countBan(int[][] reportArray, int k, int index) {
        int count = 0;

        //reported는 신고받은 사람
        for(int reported = 0 ; reported < reportArray[index].length ; reported++) {
            int reportCount = countReport(reportArray, reported);
            if (reportArray[index][reported] != 0 && reportCount >= k) count++;
        }

        return count;
    }

    public int countReport(int[][] reportArray, int reported) {
        int count = 0;

        for(int i = 0 ; i < reportArray.length ; i++) {
            if (reportArray[i][reported] != 0) count++;
        }

        return count;
    }
}
