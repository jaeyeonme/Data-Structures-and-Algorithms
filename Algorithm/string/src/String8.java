import java.util.Scanner;

// 유효한 팰린드롬
class String8 {
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
