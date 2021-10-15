package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 지니레코드에서는 불세출의 가수 조영필의 라이브 동여상을 DVD로 만들어 판매하려 한다.
 * DVD에는 총 N개의 곡이 들어가는데, DVD에 녹화할 때에는 라이브에서의 순서가 그대로 유지되어야 한다.
 * 순서가 바뀌는 것을 우리의 가수 조영필씨가 매우 싫어한다.
 * ...
 */
class MusicVideo {
    public int count (int[] arr, int capacity) {
        int cnt = 1, sum = 0;
        for (int x : arr) {
            if (sum + x > capacity) {
                cnt++;
                sum = x;
            }
            else sum += x;
        }
        return cnt;
    }

    public int solution (int n, int m, int[] arr) {
        int answer = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) <= m) {
                answer = mid;
                rt = mid - 1;
            }
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        MusicVideo T = new MusicVideo();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 노래곡
        int m = sc.nextInt();  // DVD장수.
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
