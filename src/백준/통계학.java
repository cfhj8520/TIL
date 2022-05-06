package 백준;

import java.util.*;

class 통계학 {
    public static void solution(int n, List<Integer> list) {
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        int min = Collections.min(list);
        int max = Collections.max(list);
        Collections.sort(list);
        int middle = list.get(list.size()/2);
        int fre = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : list) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxValue = Collections.max(map.values());
        List<Integer> freList = new ArrayList<>();

        for(int key : map.keySet()) {
            if(maxValue == map.get(key)) {
                freList.add(key);
            }
        }

        if(freList.size() > 1) {
            Collections.sort(freList);

            fre = freList.get(1);
        } else {
            fre = freList.get(0);
        }

        System.out.println(Math.round(sum / (double) list.size()));
        System.out.println(middle);
        System.out.println(fre);
        System.out.println(max - min);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            list.add(kb.nextInt());
        }

        solution(n, list);
    }
}