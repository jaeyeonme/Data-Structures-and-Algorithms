package String;

import java.util.Scanner;

/**
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 */
public class Java_11719 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
    }
}
