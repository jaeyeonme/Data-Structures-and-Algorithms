package arrays;

import java.util.*;

/**
 * String 배열이 주어집니다. 주어진 String은 배열안에서 다른 String과 아나그램 관계입니다.
 * String 순서 상관없이 같은 아나그램을 리턴하세요.
 */
public class GroupAnagrams {
    public static void main(String[] args) {

        String[] list = { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(solve(list));
//      System.out.println(solve_ascii(list));
    }

    // 1. sort O
    public static List<List<String>> solve(String[] strs) {

        // 1.
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0)
            return result;

        Map<String, List<String>> map = new HashMap<>();

        // 2. for
        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);  // ['a','e','t']

            String key = String.valueOf(charArr);

            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet())
            result.add(entry.getValue());
        return result;
    }

    // 2. sort X
    public static List<List<String>> solve_ascii(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String str : strs) {
            int[] count = new int[26];  // a-z
            for (int k = 0; k < str.length(); k++) {
                count[str.charAt(k) - 'a']++;  // [1,0,0,0,0,1.....1.] 26개
            }

            String key = Arrays.toString(count);

            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet())
            result.add(entry.getValue());

        return result;
    }

}
