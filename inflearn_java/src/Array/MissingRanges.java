package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * 모든 요소를 포함하는 범위[lower, upper]와 정렬된 고유한 정수 배열 nums가 주어집니다.
 * 만약 x라는 number가 범위[lower, upper]존재하고 nums배열에 없다면 누락된 값으로 간주합니다.
 * ...
 */
public class MissingRanges {
    public static void main(String[] args) {

        int[] nums = { 2, 3, 5, 50, 75 };
        int lower = 0, upper = 99;
        System.out.println(solve(nums, lower, upper));
//      [0->1, 4, 6->49, 51->74, 76->99]
    }

    public static List<String> solve(int[] nums, int lower, int upper) {

        // 1
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return result;


        // 2-1
        if (lower < nums[0]) {
            result.add(makeRange(lower, nums[0] - 1));  // 0 -> 1
        }

        // 2-2
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1] && nums[i] + 1 < nums[i + 1]) {
                // 6 -> 49
                result.add(makeRange(nums[i] + 1, nums[i + 1] - 1));
            }
        }

        // 2-3
        if (nums[nums.length - 1] < upper) {
            result.add(makeRange(nums[nums.length -1] + 1, upper));  // 76 -> 99
        }

        return result;
    }

    private static String makeRange(int low, int high) {
        return low == high? String.valueOf(low): (low + " -> " + high);
    }

}
