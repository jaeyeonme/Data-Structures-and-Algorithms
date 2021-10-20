package Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 원더랜드에 문제가 생겼다. 원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
 * 원드랜드는 모든 도시를 서로 연결하면서 최소의 유지비용이 들도록 도로를 선택하고 나머지 도로는 폐쇄하려고 한다.
 * ...
 */
class Edge2 implements Comparable<Edge2> {
    public int v1;
    public int v2;
    public int cost;
    Edge2 (int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }
    @Override
    public int compareTo(Edge2 ob) {
        return this.cost - ob.cost;
    }
}

class Wonderland {
    static int[] unf;
    public static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 도시의 개수
        int m = sc.nextInt();  // 간선의 개수
        unf = new int[n + 1];  // union find
        ArrayList<Edge2> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) unf[i] = 1;
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            arr.add(new Edge2(a, b, c));
        }
        int answer = 0;
        Collections.sort(arr);
        for (Edge2 ob : arr) {
            int fv1 = Find(ob.v1);
            int fv2 = Find(ob.v2);
            if (fv1 != fv2) {
                answer += ob.cost;
                Union (ob.v1, ob.v2);
            }
        }
        System.out.println(answer);
    }
}
