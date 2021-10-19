package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고 한다. 각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고,
 * ....
 */
class Time implements Comparable<Time> {
    public int s, e;
    Time (int s, int e) {
        this.s = s;
        this.e = e;
    }
    @Override
    public int compareTo(Time o) {
        if (this.e == o.e) return this.s - o.s;
        else return this.e - o.e;
    }
}

class Meeting {
    public int solution (ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for (Time ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Meeting T = new Meeting();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time(x, y));
        }
        System.out.println(T.solution(arr, n));
    }
}
