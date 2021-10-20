package DP;

import java.util.Scanner;

/**
 * N개의 자연수로 이루어진 수열이 주어졌을 떄, 그 중에서 가장 길게 증가하는 원소들의 집합을 찾는 프로그램을 작성하라. 예를 들어 원소가
 * 2, 7, 5, 8, 6, 4, 7, 12, 3 이면 가장 길게 증가하도록 원소들을 차례대로 뽑아내면
 * ....
 */
class LongestIncreasingSubsequence {
    static int[] dy;
    public int solution (int[] arr) {
        int answer = 0;
        dy = new int[arr.length];
        dy[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i] && dy[j] > max) max = dy[j];
            }
            dy[i] = max + 1;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        LongestIncreasingSubsequence T = new LongestIncreasingSubsequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr));
    }
}
