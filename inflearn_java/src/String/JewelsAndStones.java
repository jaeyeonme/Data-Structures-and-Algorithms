package String;

import java.util.HashSet;
import java.util.Set;

/**
 * 보석(jewels)와 돌(stones)이 주어진다.
 * 보석을 이용해서 돌에 얼마나 많은 보석이 포함되어 있는지 알고 싶다.
 *
 * 문자는 대소 문자를 구분하므로 "a"와 "A"은 다른 유형의 스톤으로 간주한다.
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(solve(jewels, stones));
    }

    public static int solve(String jew, String stones) {
        // 1. ds
        Set<Character> set = new HashSet<>();

        // 2. for while
        // jew
        char[] charArr = jew.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            set.add(charArr[i]);  // a, A
        }

        int count = 0;
        char[] stoneArr = stones.toCharArray();
        for (int i = 0; i < stoneArr.length; i++) {
            if (set.contains(stoneArr[i])) {
                count++;
            }
        }

        return count;
    }


}
