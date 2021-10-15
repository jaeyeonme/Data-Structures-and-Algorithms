package Sorting_Searching;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수중 한 개의 수인 M이 주어지면 이분검색으로 M이
 * 정렬된 상태에서 몇 번째에세 있는지 구하는 프로그램을 작성하세요. 단, 중복값은 존재하지 않습니다.
 */
class BinarySearch {
    public int solution (int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr);
        int lt = 0, rt = n - 1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1;
                break;
            }
            if (arr[mid] > m) rt = mid - 1;
            else lt = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        BinarySearch T = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, m, arr));

    }
}
