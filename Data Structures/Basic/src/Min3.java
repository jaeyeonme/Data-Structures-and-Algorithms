import java.util.Scanner;

/**
 *  세 값의 최소값을 구하는 메서드를 작성
 */
class Min3 {
    // a, b, c의 최소값을 구하여 반환
    static int min3(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b, c;

        System.out.print("a의 값 : "); a = stdIn.nextInt();
        System.out.print("b의 값 : "); b = stdIn.nextInt();
        System.out.print("c의 값 : "); c = stdIn.nextInt();

        int min = min3(a, b, c);  // a, b, c의 최소값

        System.out.println("최소값은 " + min + "입니다.");
    }
}
