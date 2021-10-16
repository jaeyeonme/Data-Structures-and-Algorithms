package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 아래 그림과 같은 이진트리를 레벨탐색 연습하세요.
 */
class Node1 {
    int data;
    Node1 lt, rt;
    public Node1 (int val) {
        data = val;
        lt = rt = null;
    }
}

public class BFS {
    Node1 root;
    public void Main (Node1 root) {
        Queue<Node1> Q = new LinkedList<>();
        Q.offer(root);  // 100번지
        int L = 0;      // root Node는 0
        while (!Q.isEmpty()) {
            int len = Q.size();  // len = 1
            System.out.print(L + " ");
            for (int  i = 0; i < len; i++) {  // 0레벨 원소 순회해서 출력
                Node1 current = Q.poll();     // 꺼내놓고 출력  현재 current == root
                System.out.print(current.data + " ");
                if (current.lt != null) Q.offer(current.lt);  // 200번지 삽입
                if (current.rt != null) Q.offer(current.rt);  // 300번지 삽입
            }
            L++;  // 레벨이 끝났으므로 증가
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BFS tree = new BFS();
        tree.root = new Node1(1);
        tree.root.lt = new Node1(2);
        tree.root.rt = new Node1(3);
        tree.root.lt.lt = new Node1(4);
        tree.root.lt.rt = new Node1(5);
        tree.Main(tree.root);
    }
}
