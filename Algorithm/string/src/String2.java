// 대소문자 변환
import java.util.Scanner;

class String2 {
    public String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
//            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
//            else answer += Character.toLowerCase(x);
            if (x >= 97 && x <= 122) answer += (char)(x-32); // ASCII 소문자
            else answer += (char)(x + 32);                   // ASCII 대문자
        }

        return answer;
    }

    public static void main(String[] args) {
        String2 T = new String2();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
