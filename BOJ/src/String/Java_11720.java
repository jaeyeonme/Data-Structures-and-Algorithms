package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N개의 숫자가 공백 없이 쓰져있다. 이숫자를 모두 합해서 출력하는 프로그램을 작성하세요.
 */
public class Java_11720 {
    public static void main(String[] args) throws IOException {

        // BufferedReader 선언 및 반복할 문자열 변수 N 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 데이터를 split을 사용 배열로 입력 및 합계 변수 선언
        String[] b = br.readLine().split("");
        int sum = 0;

        // for문을 사용하여 배열의 합 계산
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(b[i]);
        }

        // 결과 출력
        System.out.print(sum);
    }
}
