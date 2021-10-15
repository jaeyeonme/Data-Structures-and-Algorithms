package Recursive_Tree_Graph;

/**
 * 아래 그림과 같은 이진트리를 전위순회와 후위순회를 연습해보세요.
 */
class Node {
    int data;
    Node lt, rt;
    public Node (int val) {
        data = val;
        lt = rt = null;
    }
}

public class BinaryTree {
    Node root;
    public void DFS (Node root) {
        if (root == null) return;
        else {
            DFS (root.lt);
            DFS (root.rt);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.lt= new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS (tree.root);
    }
}
