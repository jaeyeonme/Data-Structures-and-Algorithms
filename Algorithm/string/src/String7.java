// 회문 문자열
import java.util.Scanner;

class String7 {
    public String solution(String str) {
        String answer = "NO";
        int len = str.length();
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args) {
        String7 T = new String7();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
