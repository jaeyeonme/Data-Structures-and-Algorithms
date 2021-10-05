package arrays;

/**
 * elevation map(양의 정수)은 아래그림에서 검은 네모모양이며 너비가 1이다.
 * 비가 내린 후 가둘 수 있는 물의 양을 계산합니다.
 */
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trap(nums));
    }

    public static int trap(int[] height) {
        int result = 0;
        if (height == null || height.length <= 2)
            return result;


        // 1. leftMax()
        int len = height.length;  // 12
        int[] left = new int[len];
        int[] right = new int[len];

        int max = height[0];
        left[0] = height[0];

        for (int i = 1; i < len; i++) {
            if (height[i] < max) {
                left[i] = max;
            } else {
                left[i] = height[i];
                max = height[i];
            }
        }

        // 2. rightMax()
        max = height[len - 1];
        right[len-1] = height[len-1];

        for (int i = len - 2; i >= 0; i--) {
            if (height[i] < max) {
                right[i] = max;
            } else {
                right[i] = height[i];
                max = height[i];
            }
        }


        // 3. min() - height
        for (int i = 0; i < len; i++) {
            result += Math.min(left[i], right[i]) - height[i];
        }

        return result;
    }

    public static void print(int[] left) {
        for (int i = 0; i < left.length; i++) {
            System.out.println(" 순서: " + i + " 값: " + left[i]);
        }
    }

    public static int solve2(int[] height) {
        int result = 0;
        int n = height.length;

        for (int i = 1; i < n - 1; i++) {
            int maxLeft = 0, maxRight = 0;
            for (int j = 1; j >= 0; j--)
                maxLeft = Math.max(maxLeft, height[i]);
            for (int j = i; j < n; j++)
                maxRight = Math.max(maxRight, height[j]);

            result += Math.min(maxLeft, maxRight) - height[i];
        }

        return result;
    }
}
