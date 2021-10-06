package Sorting_Searching;

import java.util.Arrays;

/**
 * 배열로 logs 주어집니다.
 * 각 로그는 공백으로 구분 된 단어 문자열이며 첫 번째 단어는 식별자 입니다.
 * ...
 */
public class ReorderLogFiles {
    public static void main(String[] args) {

        String[] input = {
                "dig1 8 2 3 1",
                "let1 abc cat",
                "dig1 2 5",
                "let2 good dog book",
                "let3 abc zoo"
        };

        ReorderLogFiles a = new ReorderLogFiles();
        String[] result = a.reorderLogFiles_1(input);
        for (String s : result)
            System.out.println("s: " + s);
    }

    public String[] reorderLogFiles_1(String[] logs) {

        Arrays.sort(logs, (s1, s2) -> {

            String[] split1 = s1.split(" ", 2);
            String[] split2 = s2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
                // 1. 모두 문자
                int comp = split1[1].compareTo(split2[1]);  // 오름차순 마 -1
                if (comp == 0) return split1[0].compareTo(split2[0]);
                else return comp;

            } else if (isDigit1 && isDigit2) {
                // 2. 모두 숫자
                return 0;
            } else if (isDigit1 && !isDigit2) {
                // 3. 첫번째는 숫자, 두 번째는 문자.
                return 1;
            } else {
                // 4. 첫번째는 문자, 두 번째는 숫자.
                return -1;
            }
        });

        return logs;
    }
}
