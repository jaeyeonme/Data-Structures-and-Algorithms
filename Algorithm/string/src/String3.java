// 문장 속 단어 (indexOf(), substring())
import java.util.Scanner;

class String3 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos; // 가장 작은 값으로 초기화
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if (len > m) {
//                m = len;
//                answer = x;
//            }
//        }
        while ((pos = str.indexOf(' ')) != -1) { // 2번
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                answer = tmp;
            }

            // is time to study
            // time to study
            // to study
            // study
            str = str.substring(pos + 1);
        }

        // str 적용
        if (str.length() > m) answer = str;
        return answer;
    }

    public static void main(String[] args) {
        String3 T = new String3();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}

