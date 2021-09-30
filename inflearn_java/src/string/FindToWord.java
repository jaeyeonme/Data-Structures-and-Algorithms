package string;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면, 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 */
class FindToWord {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        String[] s = str.split(" ");
        for (String x : s) {
            int len = x.length();
            if (len > m) {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;           // 가장 작은 값으로 초기화
        while ((pos = str.indexOf(' ')) != -1) {  // 2번
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }

            // is time to study
            // time to study
            // to study
            // study
            str = str.substring(pos * 1);
        }

        // str적용
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        FindToWord T = new FindToWord();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));

    }
}
