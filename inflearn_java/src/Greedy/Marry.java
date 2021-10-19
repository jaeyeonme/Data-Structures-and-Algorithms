package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 현수는 다음 달에 결혼을 합니다.
 * 현수는 결혼식 피로연을 장소를 빌려 3일간 쉬지 않고 하려고 합니다.
 * 피로연에 참석하는 친구들 N명의 참석하는 시간정보를 현수는 친구들에게 미리 요구했습니다.
 * ...
 */
class Time2 implements Comparable<Time2> {
    public int time;
    public char state;
    Time2 (int time, char state) {
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time2 ob) {
        if (this.time == ob.time) return this.state - ob.state;
        else return this.time - ob.time;
    }
}

class Marry {
    public int solution (ArrayList<Time2> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for (Time2 ob : arr) {
            if (ob.state == 's') cnt++;
            else cnt--;
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Marry T = new Marry();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time2> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sT = sc.nextInt();
            int eT = sc.nextInt();
            arr.add(new Time2(sT, 's'));
            arr.add(new Time2(eT, 'e'));
        }
        System.out.println(T.solution(arr));
    }
}
