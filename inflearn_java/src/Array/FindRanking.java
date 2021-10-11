package Array;

import java.util.Scanner;

class FindRanking {
    public int[] solution (int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) cnt++;
            }

            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        FindRanking T = new FindRanking();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 학생수
        int[] arr = new int[n];  // 배열
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // 점수
        }

        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }

}
