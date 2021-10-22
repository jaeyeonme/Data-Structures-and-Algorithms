package String;

import java.util.Scanner;

/**
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
 * 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 */
public class Java_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] str = new String[num + 1];

        for (int i = 0; i < num; i++) {
            int count = 0, sum = 0;
            str[i] = sc.next();
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == 'O')
                    sum += ++count;
                else count = 0;
            }
            System.out.println(sum);
        }
    }
}
