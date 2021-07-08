import java.util.Scanner;

// 중복문자제거
class String6 {
    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            // i가 처음 발견되는 위치 == i
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String6 T = new String6();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
