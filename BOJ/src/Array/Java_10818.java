package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * N개의 정수가 주어진다. 이떄, 최솟값과 최대값을 구하는 프로그램을 작성하시오.
 */
public class Java_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int index = 0;
        int[] arr = new int[n];
        while (st.hasMoreTokens()) {
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[n - 1]);
    }
}
