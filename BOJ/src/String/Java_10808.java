package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 */
public class Java_10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            count[(int)input.charAt(i) - 97] += 1;
        }

        for (int i = 0; i < count.length; i++) {
            sb.append("ABC");
            sb.append("DEF");
        }
        System.out.println(sb);
    }
}
