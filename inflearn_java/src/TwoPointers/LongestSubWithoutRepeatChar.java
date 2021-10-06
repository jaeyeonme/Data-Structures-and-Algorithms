package TwoPointers;

import java.util.HashMap;
import java.util.Map;

/**
 * String s가 주어집니다.
 * 중복이 없는 가장 긴 substring 문자열을 리턴하세요.
 */
public class LongestSubWithoutRepeatChar {
    public static void main(String[] args) {

        String input = "pawwkea";
//      String input = "abcabcd";
        System.out.println(solve_map(input));
    }

    public static int solve_map(String s) {

        // 1. ds
        Map<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, counter = 0, max = 0;

        // 2. for while
        while (r < s.length()) {
            char c = s.charAt(r);  // p
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > 1)
                counter++;
            r++;

            while (counter > 0) {
                char c2 = s.charAt(l);
                if (map.get(c2) > 1)
                    counter--;
                map.put(c2, map.get(c2) - 1);
            }

            Math.max(max, r-l);
        }
        return max;
    }
}
