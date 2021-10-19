package Greedy;

import java.util.Scanner;

/**
 * 오늘은 새 학기 새로운 반에서 처음 시작하는 날이다. 현수네 반 학생은 N명이다. 현수는 각 학생들의 친구관계를 알고 싶다.
 * 모든 학생은 1부터 N까지 번호가 부여되고 있고, 현수에게는 각각 두명의 학생은 친구 관계가 번호로 표현된 숫자쌍이 주어진다.
 * ...
 */
class DisjointSet {
    static int[] unf;
    public static int Find (int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find (unf[v]);
    }

    public static void Union (int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) unf[i] = i;
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a, b);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if (fa == fb) System.out.println("YES");
        else System.out.println("NO");
    }
}
