package Queue_Stack;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
 * 응급실은 환자가 도착한 순서대로 진료를 시작합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.
 * ...
 */
class Person {
    int id;
    int priority;
    public Person (int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

class EmergencyRoom {
    public int solution (int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }
        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
                if (tmp.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        EmergencyRoom T = new EmergencyRoom();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
