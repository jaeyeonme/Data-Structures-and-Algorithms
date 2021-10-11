package Array;

import java.util.Scanner;

/**
 * A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고,
 * B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
 */
class RockPaperScissors {
    public String solution (int n, int[] a, int[] b) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A";
            else if (a[i] == 2 && b[i] == 1) answer += "A";
            else if (a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        RockPaperScissors T = new RockPaperScissors();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n을 입력받는다. (가위바위보 횟수)
        int[] a = new int[n];  // A배열을 만든다.
        int[] b = new int[n];  // B배열을 만든다.
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();  // A라는 사람이 낸 가위바위보 정보를 a배열에 넣는다.
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();  // B라는 사람이 낸 가위바위보 정보를 b배열에 넣는다.
        }

        for (char x : T.solution(n, a, b).toCharArray())
            System.out.println(x);
    }

}
