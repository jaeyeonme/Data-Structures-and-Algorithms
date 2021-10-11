package Array;

import java.util.Scanner;

/**
 * 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에
 * 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
 */
class StudentWhoSee {
    public int solution (int n, int[] arr) {
        int answer = 1, max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                answer++;
                max = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        StudentWhoSee T = new StudentWhoSee();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}
