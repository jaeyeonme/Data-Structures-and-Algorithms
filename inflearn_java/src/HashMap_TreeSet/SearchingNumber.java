package HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다.
 * 같은 숫자의 카드가 여러장 있을 수 있씁니다. 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를
 * 합한 값을 기록하려고 합니다.
 * ...
 */
class SearchingNumber {
    public int solution (int[] arr, int n, int k) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k) return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        SearchingNumber T = new SearchingNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(arr, n, k));
    }
}
