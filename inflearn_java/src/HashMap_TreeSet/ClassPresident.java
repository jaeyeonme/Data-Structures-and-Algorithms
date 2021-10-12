package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 학급 회장을 뽑는데 후보 기호 A, B, C, D, E 후보가 등록을 했습니다.
 * 투용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 * ...
 */
class ClassPresident {
    public char solution (int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ClassPresident T = new ClassPresident();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 학생수
        String str = sc.next();  // 투표결과
        System.out.println(T.solution(n, str));
    }
}
