package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다. 현수는 지원자의 키와 몸무게 정보를 알고 있습니다.
 * ...
 */
class Body implements Comparable<Body> {
    public int h, w;
    Body (int h, int w) {
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}

class Wrestling {
    public int solution (ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if (ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Wrestling T = new Wrestling();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h, w));
        }
        System.out.println(T.solution(arr, n));
    }
}
