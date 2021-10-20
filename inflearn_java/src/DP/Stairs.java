package DP;

import java.util.Scanner;

/**
 * 철수는 계단을 오를 때 한 번에 한 계단 또는 두 계산씩 올라간다. 만약 총 4계단을 오른다면 그 방법의 수는
 * ...
 */
class Stairs {
    static int[] dy ;
    public int solution (int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n];
    }

    public static void main(String[] args) {
        Stairs T = new Stairs();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 1];
        System.out.println(T.solution(n));
    }
}
