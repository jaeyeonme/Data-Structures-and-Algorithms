package Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 현수네 반에는 N명의 학생들이 있습니다.
 * 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
 * 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)을 출력하고,
 * ...
 */
class Duplication {
    public String solution (int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) return "D";
        }

        return answer;
    }

    public static void main(String[] args) {
        Duplication T = new Duplication();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
