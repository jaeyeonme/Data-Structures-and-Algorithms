package string;

import java.util.HashSet;
import java.util.Set;

/**
 * 모든 유효한 이메일은 @을 기준으로 로컬이름과 도메인으름으로 구성된다.
 * 또한 소문자외에 하나 이상의 '.' 또는 '+'을 포함한다.
 * .......
 * 이메일 목록이 주어지면 목록의 각 주소로 하나의 이메일을 보낸다.
 * 실제로 메일을 받는 주소는 몇 개 인가?
 */
public class UniqueEmailAddress {
    public static void main(String[] args) {
        UniqueEmailAddress a = new UniqueEmailAddress();
        String[] emails = {
                "tes.email+james@coding.com",
                "test.e.mail+toto.jane@cod.ing.com",
                "testemail+tom@cod.ing.com"};
//      String[] emails = {
//      "test.email+james@coding.com" };
        System.out.println(a.solve_1(emails));
//      System.out.println(a.solve_substring(emails));
        System.out.println(a.solve_split(emails));
    }

    // 1. Basic
    public int solve_1(String[] emails) {
        // 1. df
        Set<String> set = new HashSet<>();  // 중복 X

        // 2. for while charAt()
        for (String email : emails) {
            String localName = makeLocalName(email);
            String dName = makeDName(email);

            set.add(localName + "@" + dName);
        }

        return set.size();
    }

    private String makeDName(String email) {
        return email.substring(email.indexOf("@") + 1);
    }

    private String makeLocalName(String email) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '.') {
                continue;
            }

            if (email.charAt(i) == '+' || email.charAt(i) == '@') {
                break;
            }
            sb.append(email.charAt(i));
        }

        return sb.toString();
    }

    // 2. Substring
    public int solve_substring(String[] emails) {

        int result = 0;
        Set<String> set = new HashSet<>();
//        for (String email : emails) {
//            String tmpLocal = makeLocalName(email);
//            String tmpDomain = makeDomainName(email);
//            set.add(tmpLocal + tmpDomain);
//        }

        for (int i = 0; i < emails.length; i++) {
            String localName = "";
            String domainName = "";
            localName = emails[i].substring(0, emails[i].indexOf("+")).replace(".", "");
            domainName = emails[i].substring(emails[i].indexOf("@"));
            set.add(localName + domainName);
        }

        result = set.size();
        return result;
    }

    // 3. split
    public int solve_split(String[] emails) {
//      "test.email+james@coding.com",

        // 1. ds
        Set<String> set = new HashSet<>();

        // 2. for, while
        for (String email : emails) {
//          "test.email+james@coding.com",
            String[] parts = email.split("@");
            parts[0].split("\\+");
            String[] localName = parts[0].split("\\+");
            set.add(localName[0].replace(".", "") + "@" + parts[1]);
        }

        return set.size();
    }
}
