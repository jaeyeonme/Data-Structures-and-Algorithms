package TwoPointers;

import java.util.*;

/**
 * 두 개의 문자열이 주어집니다. String s, p
 * p의 문자열이 s의 문자열에 특정인덱스에서부터 모든 아나그램 찾아서 인덱스를 리턴하세요.
 */
public class FindAllAnagramInAString {
    public static void main(String[] args) {
        FindAllAnagramInAString a = new FindAllAnagramInAString();
        String s = "bacdgabcda";
        String p = "abcd";
        System.out.println(a.solve_array(s, p));
    }

    public List<Integer> solve_array(String s, String p) {

        // 1.
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0 || s.length() < p.length())
            return result;

        int[] pArr = new int[26];  // [0,0,0,0,0,0,0,0,0....] 26개
        for (int i = 0; i < p.length(); i++) {
            pArr[p.charAt(i) - 'a']++; // [1,1,1,1,0,0,0,0,0....] 고유한 key
        }

        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            int[] sArr = new int[26];
            for (int j = 0; j < p.length(); j++) {
                // 0
                sArr[s.charAt(i + j) - 'a']++;
            }

            if (check(pArr, sArr))
                result.add(i);
        }
        return result;
    }

    private boolean check(int[] pArr, int[] sArr) {
        for (int i = 0; i < pArr.length; i++) {
            if (pArr[i] != sArr[i])
                return false;
        }
        return true;
    }

    public List<Integer> solve(String s, String t) {
        List<Integer> result = new LinkedList<>();
        if (t.length() > s.length())
            return result;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int counter = map.size();
        int left = 0, right = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0)
                    counter--;
            }
            right++;

            while (counter == 0) {
                char c2 = s.charAt(left);
                if (map.containsKey(c2)) {
                    map.put(c2, map.get(c2) + 1);
                    if (map.get(c2) > 0) {
                        counter++;
                    }
                }

                if (right - left == t.length()) {
                    result.add(left);
                }

                left++;
            }
        }
        return result;
    }
}
