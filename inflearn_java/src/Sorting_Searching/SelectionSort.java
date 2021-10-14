package Sorting_Searching;

import java.util.Scanner;

/**
 * N개의 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작겅하세요.
 * 정렬하는 방법은 선택정렬입니다.
 */
class SelectionSort {
    public int[] solution (int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }

            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort T = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
