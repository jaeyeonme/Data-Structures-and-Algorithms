package DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * NxN 크기의 도시지도가 있습니다. 도시지도는 1x1 크기의 격자칸으로 이루어져 있습니다. 각 격자칸에는 0은 빈칸, 1은 집, 2는 피자집으로 표현됩니다.
 * 각 격자칸은 좌표(행번호, 열번호)로 표현됩니다. 행번호는 1부터 N까지이고, 열 번호도 1부터 N까지입니다.
 * ...
 */
class Point4 {
    public int x, y;
    Point4 (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PizzaDistance {
    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point4> hs, pz;
    public void DFS (int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point4 h : hs) {
                int dis = Integer.MAX_VALUE;
                for (int i : combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        PizzaDistance T = new PizzaDistance();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pz = new ArrayList<>();
        hs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt();
                if (tmp == 1) hs.add(new Point4(i, j));
                else if (tmp == 2) pz.add(new Point4(i, j));
            }
        }
        len = pz.size();
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
