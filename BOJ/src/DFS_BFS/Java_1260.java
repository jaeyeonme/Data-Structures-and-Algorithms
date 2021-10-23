package DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Java_1260 {
    static void DFS (int V, ArrayList<Integer>[] link, boolean[] visited, StringBuilder sb) {
        if (visited[V]) return;  // 방문했으면 return

        visited[V] = true;
        sb.append(V + " ");

        for (int i : link[V]) {
            if (!visited[i]) {
                DFS (i, link, visited, sb);
            }
        }
    }

    static void BFS (int V, ArrayList<Integer>[] link, boolean[] visited, StringBuilder sb) {
        // 담을 큐 선언 및 초기화
        Queue<Integer> q = new LinkedList<Integer>();
        visited[V] = true;
        q.add(V);

        while (!q.isEmpty()) {  // 큐가 빌 때까지
            int node = q.poll();
            sb.append(node + " ");

            for (int i : link[node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }

        }
    }

    public static void main(String[] args) throws IOException {
        // 한줄 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 토큰단위 파싱
        StringTokenizer str = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(str.nextToken());  // 정점 개수
        int M = Integer.parseInt(str.nextToken());  // 간선 개수
        int V = Integer.parseInt(str.nextToken());  // 탐색을 시작할 정점 번호

        // 연결된 노드를 저장할 list 선언
        ArrayList<Integer>[] link = new ArrayList[N + 1];

        for (int i = 0; i < link.length; i++) {
            link[i] = new ArrayList<Integer>();  // list 초기화
        }

        for (int i = 0; i < N; i++) {
            str = new StringTokenizer(br.readLine());  // 계속 입력받음
            int n1 = Integer.parseInt(str.nextToken());
            int n2 = Integer.parseInt(str.nextToken());

            link[n1].add(n2);  // 저장
            link[n2].add(n1);
        }
        br.close();  // BufferedReader 닫아주기

        // 자식이 여러 개일 때, 번호가 작은 것부터 방문하기 때문에 오름차순 정렬
        for (int i = 0; i < link.length; i++) {
            Collections.sort(link[i]);  // link[i] 줄을 정렬
        }

        // 방문 여부
        boolean[] visited = new boolean[N  + 1];
        StringBuilder sb = new StringBuilder();

        DFS (V, link, visited, sb);  // DFS 탐색 시작
        System.out.println(sb);

        sb.delete(0, sb.length());       // sb 초기화
        Arrays.fill(visited, false); // 방문여부도 다시 false

        BFS (V, link, visited, sb);     // BFS 탐색 시작
        System.out.println(sb);

    }
}
