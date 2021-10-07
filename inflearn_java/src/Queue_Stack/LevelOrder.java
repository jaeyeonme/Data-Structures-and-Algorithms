package Queue_Stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 이진 트리가 주어지면 노드 값의 레벨 순서 순회를 반환합니다.
 */
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        this.val = x;
    }
}

public class LevelOrder {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        solve(root);
    }

    public static List<List<Integer>> solve(TreeNode root) {

        // 1. ds
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // 2. for, while add algorithm
        while (!queue.isEmpty()) {    // 2, 3
            int size = queue.size();  // 2
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);  // 1
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }
}
