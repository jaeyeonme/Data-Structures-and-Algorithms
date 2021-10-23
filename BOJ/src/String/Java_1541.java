package String;

import java.util.Scanner;

public class Java_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String tmp = sc.nextLine();
        String[] str = tmp.split("\\-");

        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            String[] subStr = str[i].split("\\+");

            int calc = 0;
            for (String item : subStr) {
                calc += Integer.parseInt(item);
            }

            if (i == 0) {
                answer += calc;
            } else {
                answer -= calc;
            }
        }
        System.out.println(answer);
    }
}
