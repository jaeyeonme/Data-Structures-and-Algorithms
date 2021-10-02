package string;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
//      int[] digits = {9, 9, 9};
//      int[] digits = {9, 8, 9};
//      int[] digits = {8, 9, 9};
//      int[] digits = {0, 0, 1};
//      int[] digits = {0, 0};
//      int[] digits = {9, 0, 0, 9};
//      int[] digits = {9, 9, 9, 9, 9};

        int[] result = solve(digits);
        for (int i : result)
            System.out.println("val : " + i);
    }

    public static int[] solve(int[] digits) {

        int n = digits.length;  // 3
        for (int i = n - 1; i >= 0; i--) {
            // 2, 1, 0
            digits[i]++;  // 1, 2, 4
            if (digits[i] < 10) {
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[n + 1]; // 0, 0, 0, 0
        result[0] = 1;
        return result;
    }
}
