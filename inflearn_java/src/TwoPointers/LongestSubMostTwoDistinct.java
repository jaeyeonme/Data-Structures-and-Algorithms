package TwoPointers;

import java.util.HashMap;
import java.util.Map;

/**
 * String s가 주어집니다.
 * 최대 두 개의 고유 문자를 포함하는 가장 긴 부분 문자열의 길이를 리턴하세요.
 */
public class LongestSubMostTwoDistinct {
    public static void main(String[] args) {

        String s = "ccaabbb";
        System.out.println(solve_map(s));
    }

    public static int solve_map(String s) {

        // 1. ds
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, counter = 0, max = 0;


        // 2.
        while (r < s.length()) {
            char c = s.charAt(r);  // ccaabb
            map.put(c, map.getOrDefault(c, 0) + 1);  // c = 2, a = 2, b = 1
            if (map.get(c) == 1)
                counter++;  // 3
            r++;

            while (counter > 2) {
                char c2 = s.charAt(l);
                map.put(c2, map.get(c2) - 1);
                if (map.get(c2) == 0)
                    counter--;  // 2
                l++;
            }

            max = Math.max(max, r - l);
        }

        return max;
    }
}
