package TwoPointers_SlidingWindow;

import java.util.Scanner;

/**
 * 0과 1로 구성된 길이가 N인 수열이 주어집니다. 여러분은 이 수열에서 최대 K번을 0을 1로 변경할 수 있습니다.
 * ...
 */
class MaxLengthSubsequence {
    public int solution (int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (arr[rt] == 0) cnt++;
            while (cnt > k) {
                if (arr[lt] == 0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxLengthSubsequence T = new MaxLengthSubsequence();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];  // n개의 길이의 배열
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // [1,0]
        }
        System.out.print(T.solution(n, k, arr));
    }

}
