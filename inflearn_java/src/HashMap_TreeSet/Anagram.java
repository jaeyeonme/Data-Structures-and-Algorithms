package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Anagram이란 두 문자열이 알파벳의 나열 순서가 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
 * ....
 */
class Anagram {
    public String solution (String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : s2.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Anagram T = new Anagram();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.print(T.solution(a, b));
    }
}
