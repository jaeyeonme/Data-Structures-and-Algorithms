package String;

import java.util.Scanner;

/**
 * 현수는 영희에게 알파벳 대문자로 구성된 비밀편지를 매일 컴퓨터를 이용해 보낸다.
 * 비밀편지는 현수와 영희가 서로 약속한 암호로 구성되어 있다.
 * 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있다.
 * ------------
 * Ex) 현수가 4개의 문자를 다음과 같이 신호로 보냈다면
 * #****###**#####**#####**##**
 * 이 신호를 4개의 문자신호로 구분하면
 * #****## --> 'C'
 * #**#### --> 'O'
 * #**#### --> 'O'
 * #**##** --> 'L'
 * 최종적으로 "COOL"로 해석된다.
 * 현수가 보낸 신호를 해석하는 프로그램을 작성해서 영희를 도와주세요.
 */
class PasswordEncoding {
    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args) {
        PasswordEncoding T = new PasswordEncoding();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
