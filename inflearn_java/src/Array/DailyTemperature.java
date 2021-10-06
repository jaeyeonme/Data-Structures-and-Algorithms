package Array;

import java.util.Stack;

/**
 * 일일 온도를 나타내는 int 배열(Temperature)이 주어집니다.
 * 더 따뜻한 날씨의 날을 얻기 위해 해당날짜 이후에 기다려야하는 날짜의 수를 배열로 리턴하세요.
 */
public class DailyTemperature {
    public static void main(String[] args) {
        int[] nums = { 73, 74, 75, 71, 69, 72, 76, 73 };
//      int[] res = solve_0(nums);
        int[] res = solve_1(nums);

        System.out.println("===== result =====");
        for (int i : res)
            System.out.print(i + " ");
    }

    // 1. for 2
    public static int[] solve_1(int[] tem) {

        // 1. ds
        int len = tem.length;
        int[] result = new int[len];  // 8
        int count = 0, j;

        // 2. for
        for (int i = 0; i < len; i++) {
            for (j = i + 1; j < len - 1; j++) {
                if (tem[i] < tem[j]) {
                    count++;
                    break;
                } else {
                    count++;
                }
            }
            if (j == tem.length)
                result[i] = 0;
            else
                result[i] = count;

            count = 0;
        }

        return result;
    }


    // 2. stack
    public static int[] solve_stack(int[] temper) {

        // 1. ds
        int len = temper.length;
        int[] result = new int[len]; // 8
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < len; i++) {

            while (!stack.isEmpty() && temper[stack.peek()] < temper[i]) {
                int index = stack.pop();
                result[index] = i - index; // 1-0
            }

            stack.push(i);  // 0
        }

        return result;
    }
}
