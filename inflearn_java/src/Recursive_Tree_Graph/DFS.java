package Recursive_Tree_Graph;

/**
 * Recursive -> DFS
 * -----------------
 * 자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하세요.
 */
class DFS {
    public void Recursive (int n) {
        if (n == 0) return;
        else {
            Recursive(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        DFS T = new DFS();
        T.Recursive(3);
    }

}
