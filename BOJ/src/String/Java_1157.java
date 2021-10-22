package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];  // 알파벳 개수만큼 배열 선언

        // 대문자로 출력하면 되므로, 대문자로 입력받기
        String a = sc.readLine().toUpperCase();

        int max = -1;
        char st = '?';

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 65]++;
            if (max < arr[a.charAt(i) - 65]) {
                max = arr[a.charAt(i) - 65];
                st = a.charAt(i);
            }
            else if (max == arr[a.charAt(i) - 65]) st = '?';
        }
        System.out.println(st);
    }
}
