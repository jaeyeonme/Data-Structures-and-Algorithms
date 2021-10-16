package Recursive_Tree_Graph;

/**
 * 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하세요.
 */
class Subset {
    static int n;     // 집합의 원소의 개수
    static int[] ch;  // 체크배열. 부분집합 OX
    public void DFS (int L) {
        if (L == n + 1) {  // L이라는 값을 부분집합으로 사용하느냐 사용하지않느냐. n=3, L=4 가 되야 종착점에 오는 것이다.
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);  // 0이면 공집합
        }
        else {
            ch[L] = 1;
            DFS (L + 1);  // 왼쪽 가지
            ch[L] = 0;
            DFS (L + 1);  // 오른쪽 가지
        }
    }

    public static void main(String[] args) {
        Subset T = new Subset();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
