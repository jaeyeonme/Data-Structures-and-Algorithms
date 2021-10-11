package Array;

import java.util.Scanner;

/**
 * OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다. 여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을
 * 주기 위해서 다음과 같이 점수 계산을 하기로 하였다. 1번 문제가 맞는 경우 1점으로 계산한다.
 * ...
 */
class ScoreCalculation {
    public int solution (int n, int[] arr) {
        int answer = 0, cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            }
            else cnt = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        ScoreCalculation T = new ScoreCalculation();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 10
        int[] arr = new int[n];  // 배열 길이
        for (int i = 0; i < n; i++) {  // n만큼 순회
            arr[i] = sc.nextInt();     // 배열에 0번 index부터 넣는다.
        }

        System.out.print(T.solution(n, arr));
    }
}
