package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * N개의 마구간의 수직선상에 있습니다. 각 마구간은 x1, x2, nx3, ... xN개의 좌표를 가지며, 마구간간에 좌표가 중복되는 일은 없습니다.
 * 현수는 C마리의 말을 가지고 있는데, 이 말들은 서로 가까이 있는 것을 좋아하지 않습니다. 각 마구간에는 한 마리의 말만 넣을 수 있고,
 * 가장 가까운 두 말의 거리가 최대가 되게 말을 마구간에 배치하고 싶습니다.
 * ...
 */
class Stable {
    public int count (int[] arr, int dist) {
        int cnt = 1;
        int ep = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - ep >= dist) {
                cnt++;
                ep = arr[i];
            }
        }
        return cnt;
    }

    public int solution (int n, int c, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n - 1];
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(arr, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            }
            else rt = mid - 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Stable T = new Stable();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 마구간 좌표
        int c = sc.nextInt();  // 말 마리수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, c, arr));
    }
}
