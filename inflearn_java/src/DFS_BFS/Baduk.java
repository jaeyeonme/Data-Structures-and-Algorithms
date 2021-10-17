package DFS_BFS;

import java.util.Scanner;

/**
 * 철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울 수가 없다. 철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게
 * 태우고 싶다.
 * ...
 */
class Baduk {
    static int answer = Integer.MIN_VALUE, c, n;
    public void DFS (int L, int sum, int[] arr) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }

    public static void main(String[] args) {
        Baduk T = new Baduk();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();  // 무게
        n = sc.nextInt();  // 바둑이 마리수
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
