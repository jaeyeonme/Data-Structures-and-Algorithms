package string;

import java.util.Scanner;

/**
 * 앞에서 읽을 떄나 뒤에서 읽을 떄나 같은 문자열을 팰린드롬이라고 한다.
 * 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 "NO"를 출력하는 프로그램을 작성하세요.
 * 단, 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않는다.
 * 알파벳 이외의 문자들은 무시합니다.
 */
class Palindrome2 {
    public String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if (s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        Palindrome2 T = new Palindrome2();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}
