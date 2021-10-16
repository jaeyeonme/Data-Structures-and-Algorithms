package Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 아래 그림과 같은 이진트리에서 루트 노드 1에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램을 작성하세요.
 * 각 경로의 길이는 루트노드에서 말단노드까지 가는데 이동하는 횟수를 즉 긴선(Edge)의 개수를 길이로 하겠습니다.
 * ...
 */
class Node3 {
    int data;
    Node3 lt, rt;
    public Node3 (int val) {
        data = val;
        lt = rt = null;
    }

}

public class TreeNode {
    Node3 root;
    public  int DFS (int L, Node3 root) {
        if (root.lt == null && root.rt == null) return L;
        else return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
    }

    public int BFS (Node3 root) {
        Queue<Node3> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node3 current = Q.poll();
                if (current.lt == null && current.rt == null) return L;
                if (current.lt != null) Q.offer(current.lt);
                if (current.rt != null) Q.offer(current.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode();
        tree.root = new Node3(1);
        tree.root.lt = new Node3(2);
        tree.root.rt = new Node3(3);
        tree.root.lt.lt = new Node3(4);
        tree.root.lt.rt = new Node3(5);
        System.out.println(tree.DFS(0, tree.root));
        System.out.println(tree.BFS(tree.root));
    }
}
