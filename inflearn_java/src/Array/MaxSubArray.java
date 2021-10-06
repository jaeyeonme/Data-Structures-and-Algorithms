package Array;

/**
 * 정수 배열 nums가 주어지면 합계가 가장 큰 연속 하위 배열 (최소한 하나의 숫자 포함)을 찾아서 합계를 리턴합니다.
 */
public class MaxSubArray {
    public static void main(String[] args) {
//      int[] nums = { -30, -20, -10, 10 };
//      int[] nums = { 10, 10, -3, 10, 10 };
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(solve(nums));
    }

    public static int solve(int[] nums) {

        // 1.
        int curMax = nums[0];
        int allMax = nums[0];

        // 2.
        for (int i = 1; i < nums.length; i++) {

            curMax = Math.max(nums[i], nums[1] + curMax);
            allMax = Math.max(allMax, curMax);
        }
        return allMax;
    }
}
