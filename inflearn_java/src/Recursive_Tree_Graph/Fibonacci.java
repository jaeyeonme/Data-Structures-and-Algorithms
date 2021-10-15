package Recursive_Tree_Graph;

/**
 * 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * ...
 */
class Fibonacci {
    static int[] fibo;
    public int DFS (int n) {
        if (fibo[n] > 0) return fibo[n];
        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        int n = 10;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i <= n; i++) System.out.print(fibo[i] + " ");
    }
}
