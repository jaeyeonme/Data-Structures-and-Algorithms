package Sorting_Searching;

import java.util.Scanner;

/**
 * N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
 * 정렬하는 방법은 삽입정렬입니다.
 */
class InsertionSort {
    public int[] solution (int n, int[] arr) {
        for (int i = 1; i < n; i++) {
            int tmp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp) arr[j + 1] = arr[j];
                else break;
            }

            arr[j + 1] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        InsertionSort T = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
