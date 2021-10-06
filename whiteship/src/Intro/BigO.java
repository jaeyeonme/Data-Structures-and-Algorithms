package Intro;

import java.util.ArrayList;

public class BigO {

    public static void main(String[] args) {
        // 1. 시간복잡도의 의미 : 시간X 조작(연산)되는 횟수 (공간복잡도는 사용하는 메모리)
        // (연산을 하는 기기마다 성능이 다르므로 시간 소요가 아닌 연산 횟수를 기준)
        // 2. 시간복잡도 예시
        /*
            계산에서 상수는 무시한다. (왜?)
            => 최악의 경우를 생각하는 BigO에서 상수의 차이는 미미하므로 무시
            N = 입력된 수 : ex) 16
            O(1) : 상수 시간
            O(logN) : 로그 : 4 = 2 * 2, 16 = 4 * 4, log2^4 = 2
            O(N) : 직선(선형)
            O(NlogN) : 선형로그  16log16
            O(N^2) : 제곱  256
            O(2^N) : 지수 (N의 n제곱)  65~
         */

        //               Add  /  Remove / Get
        // ArrayList   : O(1) /  O(n)  / O(1)  [1, 2, 3, ...]
        //     vs
        // LinkedList  : O(1) /  O(1)  / O(n)  [1, 2, 3, ...]
    }

    // O(1) - 별다른 계산없이 일정하게 1번만 연산
    public static void method1() {
        System.out.println("hello everybody");
    }

    public static void methodLogN(int digit) {
        // 로그 개념
        // log2^8 = 3
        // O(logN) - 점차 횟수가 줄어듦
        // 이진탐색 (정렬이 되어있는 배열에서 이분하여 찾는 방법)
        int[] sortedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int mid;
        int left = 0;
        int right = sortedArr.length - 1;

        while (right >= left) {
            mid = (right + left) / 2;

            if (2 == sortedArr[mid]) {
                // same
                break;
            }

            if (2 < sortedArr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // 작게 나누기
        while (digit != 0) {
            digit = digit / 2;  // 16 > 8 > 4 > 2 > 1
            System.out.println(digit);
        }

        // 4 + log16 + 2 = 100 + 6
    }

    // O(N) - input수와 동일하게 횟수가 증가
    public static void methodN(ArrayList<String> arr) {  // 16
        for (String s : arr) {
            System.out.println(s);
        }
    }

    // O(N^2) - '중첩'된 반복문(aka. 이중 for문)과 같은 경우
    public static void methodN2(ArrayList<String> arr1, ArrayList<String> arr2) {

        // 중첩
        for (String s1 : arr1) {      // 4
            for (String s2 : arr2) {  // 4
                if (s1.equals(s2)) {  // 16번 돈다.
                    System.out.println("SAME");
                }
            }
        }

        // *. 중첩된 반복문이 아닌경우는 단순히 N + N 입니다.
        /*
            for (String s1 : arr1) {

            }

            for (String s2 : arr2) {

            }
         */
    }
}
