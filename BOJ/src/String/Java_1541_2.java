package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 세준이는 양수와 +, -, 그리고 괄호를 가지고 식을 만들었다. 그리고 나서 세준이는 괄호를 모두 지웠다.
 * 그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
 * 괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.
 */
public class Java_1541_2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split("\\-");

        int minResult = 0;

        for (int i = 0; i < input.length; i++) {
            int calcNum = calc(input[i].split("\\+"));

            if (i == 0) calcNum *= -1;
            minResult -= calcNum;
        }
        System.out.println(minResult);
    }

    private static int calc (String[] subNums) {
        int result = 0;
        for (String item : subNums) {
            result += Integer.parseInt(item);
        }
        return result;
    }
}
