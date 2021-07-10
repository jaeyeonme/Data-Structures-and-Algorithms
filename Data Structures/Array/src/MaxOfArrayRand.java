// 배열 요소의 최대값을 나타냅니다.(값을 난수로 생성)
import java.util.Random;
import java.util.Scanner;

class MaxOfArrayRand {
    // 배열 a의 최대값을 구하여 반한합니다.
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if (a[i] > max)
                max = a[i];

        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최대값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt();                       // 배열의 요소수를 입력 받음

        int[] height = new int[num];                     // 요소수가 num인 배열을 생성

        System.out.println("키 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);   // 요소의 값을 난수로 결정
            System.out.println("height[" + i + "] : " + height[i]);
        }

        System.out.println("최대값은 " + maxOf(height) + "입니다.");
    }
}
