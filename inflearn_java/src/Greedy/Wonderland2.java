package Greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * 원더랜드에 문제가 생겼다. 원더랜드의 각 도로를 유지보수하는 재정이 바닥난 것이다.
 * PriorityQueue
 * ...
 */
class Edge3 implements Comparable<Edge3> {
    public int vex;
    public int cost;
    Edge3 (int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }
    @Override
    public int compareTo (Edge3 ob) {
        return this.cost - ob.cost;
    }
}

class Wonderland2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Edge3>> graph = new ArrayList<ArrayList<Edge3>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge3>());
        }
        int[] ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Edge3(b, c));
            graph.get(b).add(new Edge3(a, c));
        }
        int answer = 0;
        PriorityQueue<Edge3> pq = new PriorityQueue<>();
        pq.offer(new Edge3(1, 0));
        while (!pq.isEmpty()) {
            Edge3 tmp = pq.poll();
            int ev = tmp.vex;
            if (ch[ev] == 0) {
                ch[ev] = 1;
                answer += tmp.cost;
                for (Edge3 ob : graph.get(ev)) {
                    if (ch[ob.vex] == 0) pq.offer(new Edge3(ob.vex, ob.cost));
                }
            }
        }
        System.out.println(answer);
    }
}
