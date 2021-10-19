package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 현수는 유명한 강연자이다. N개의 기업에서 강연 요청을 해왔다. 각 기업은 D일 안에 와서 강연을 해주면 N만큼의 강연료를 주기로 했다.
 * 각 기업이 요청한 D와 M을 바탕으로 가장 많은 돈을 벌 수 있도록 강연 스케줄을 짜야 한다.
 */
class Lecture implements Comparable<Lecture> {
    public int money;
    public int time;
    Lecture (int money, int time) {
        this.money = money;
        this.time = time;
    }
    @Override
    public int compareTo(Lecture ob) {
        return ob.time - this.time;
    }
}

class MaxEarnings {
    static int n, max = Integer.MIN_VALUE;
    public int solution (ArrayList<Lecture> arr) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for ( ; j < n; j++) {
                if (arr.get(j).time < i) break;
                pq.offer(arr.get(j).money);
            }
            if (!pq.isEmpty()) answer += pq.poll();
        }
        return answer;
    }

    public static void main(String[] args) {
        MaxEarnings T = new MaxEarnings();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) max = d;
        }
        System.out.println(T.solution(arr));
    }
}
