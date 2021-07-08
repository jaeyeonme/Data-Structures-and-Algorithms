// 문자 찾기
import java.util.Scanner;

class String1 {
    public int solution(String str, char t) {
        int answer = 0;
        // 대문자로 바꾸기
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
//        System.out.println(str);
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == t) answer++;
//        }
        for (char x : str.toCharArray()) {
            if (x == t) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        String1 T = new String1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();        // 문자열 읽기
        char c = kb.next().charAt(0);  // 문자 읽기

        System.out.print(T.solution(str, c));

    }
}
