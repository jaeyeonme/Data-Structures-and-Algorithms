package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumSolutions {
    public static void main(String[] args) {
        TwoSumSolutions twoSumSolutions = new TwoSumSolutions();
        System.out.println(Arrays.toString(twoSumSolutions.solution2(new int[]{2, 3, 4, 7}, 6)));
    }

    private int[] solution1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    private int[] solution2(int[] numbers, int target) {
        Map<Integer, Integer> numbersMap = new HashMap<>();

        // 2, 3, 4, 5, 6
        for (int i = 0; i < numbers.length; i++) {
            int numberToFind = target - numbers[i];
            if (numbersMap.containsKey(numberToFind) && numbersMap.get(numberToFind) != i)
                return new int[] {i, numbersMap.get(numberToFind)};

            numbersMap.put(numbers[i], i);
        }

        return null;
    }
}
