package Recursive_Tree_Graph;

/**
 * 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 단, 재귀함수를 이용해서 출력해야 합니다.
 */
class BinaryNumber {
    public void Binary (int n) {
        if (n == 0) return;
        else {
            Binary (n / 2);
            System.out.print(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        BinaryNumber T = new BinaryNumber();
        T.Binary(11);
    }
}
