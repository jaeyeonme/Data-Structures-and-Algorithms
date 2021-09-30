package string;

import java.util.Scanner;

/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * ------
 * 첫 줄에 문자열이 입력되고, 문자열의 길이는 100을 넘지 않는다.
 * 문자열은 영어 알파벳으로만 구성되어 있다.
 */
class ChangeUpperToLower {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (x > 97 && x <= 122) answer += (char)(x - 32);  // ASCII 소문자
            else answer += (char)(x + 32);                     // ASCII 대문자
        }

        return answer;
    }

    public static void main(String[] args) {
        ChangeUpperToLower t = new ChangeUpperToLower();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(t.solution(str));
    }
}
