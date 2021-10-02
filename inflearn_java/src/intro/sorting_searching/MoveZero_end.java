package intro.sorting_searching;

/**
 * 정수 배열(nums)이 주어지면 0이 아닌 값은 상대적 순서를 유지하고
 * nums모든 0은 끝으로 이동하세 만드세요.
 */
public class MoveZero_end {
    public static void main(String[] args) {

        // 1
        int[] nums = { 0, 3, 2, 0, 8, 5 };

        // 3, 2, 8, 5, 0, 0

        // 2. for
        // array + 0 index
        int n = nums.length;  // 6, index - 1
        int index = 0;

        // 3, 2, 8, 5
        for (int i = 1; i < n; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // 3, 2, 8, 5, 0, 0
        while (index < n) {
            nums[index] = 0;
            index++;
        }


        for (int i : nums)
            System.out.println("i " + i);
    }
}
