package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ThreeSumSolution {
    public static void main(String[] args) {
        ThreeSumSolution threeSumSolution = new ThreeSumSolution();
        System.out.println(Arrays.toString(threeSumSolution.solution(new int[]{2, 3, 5, 7}, 10)));
    }

    /**
     * 숫자로 구성된 배열 numbers와 target 숫자 하나가 주어졌을 떄 numbers 배열에 들어있는 수 세개를 더해서 target 숫자를
     * 만들 수 있는 인덱스를 찾는 함수를 작성하세요.
     */
    private int[] solution(int[] numbers, int target) {
        Map<Integer, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            numbersMap.put(numbers[i], i);
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int numberToFind = target - numbers[i] - numbers[j];

                if (numbersMap.containsKey(numberToFind)) {
                    return new int[]{i, j, numbersMap.get(numberToFind)};
                }
            }
        }
        return null;
    }
}
