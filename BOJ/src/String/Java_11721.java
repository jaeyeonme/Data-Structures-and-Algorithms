package String;

import java.util.Scanner;

/**
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 */
public class Java_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        for (int i = 0; i < n.length(); i++) {
            System.out.print(n.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
