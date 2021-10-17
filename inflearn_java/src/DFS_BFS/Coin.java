package DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 다음과 같은 여러 단위의 동전들이 주어져 있을 떄 거스름돈이 가장 적은 수의 동전으로 교환해주려면 어떻게 주면 되는가?
 * ...
 */
class Coin {
    static int n, m, answer = Integer.MAX_VALUE;
    public void DFS (int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (L >= answer) return;
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Coin T = new Coin();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();   // 동전의 종류
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();  // 거슬러줄 금액
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
