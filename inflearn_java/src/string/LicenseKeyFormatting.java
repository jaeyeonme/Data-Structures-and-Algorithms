package string;

/**
 * 숫자, 문자와 대시로만 구성된 문자열로 표현된 라이센스 키가 제공 된다.
 * 문자열은 대시(-)로 n과 n+1그룹으로 구분된다. 정수값 k도 주어진다.
 * 첫 번째 그룹을 제외하고 각 그룹이 정확히 k로 문자열을 형식화(Formatting)해야 한다.
 * ...
 */
public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String str = "8F3Z-2e-9-wabcdef";
//      String str = "8F3Z-2e-90-w";
//      String str = "8-5g-3-3";
        int k = 4;
        System.out.println(solve(str, k));
    }

    public static String solve(String str, int k) {

        // 1. - del
        String newStr = str.replace("-", "");

        // 2. toUpperCase
        newStr = newStr.toUpperCase();

        // 3. k개로 파싱하기, 그리고 - 넣기
        StringBuilder sb = new StringBuilder(newStr);

        // "8F3Z2E90W"
        int len = sb.length();
        for (int i = k; i < len; i = i + k) {
            sb.insert(len - i, '-');
        }

        return sb.toString();
    }
}
