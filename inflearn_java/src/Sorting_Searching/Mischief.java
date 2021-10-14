package Sorting_Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 새 학기가 시작되었습니다. 철수는 새 짝궁을 만나 너무 신이 났습니다.
 * 철수네 반에는 N명의 학생들이 있습니다.
 * 선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다.
 * ...
 */
class Mischief {
    public ArrayList<Integer> solution (int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) answer.add(i + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Mischief T = new Mischief();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 학생수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
