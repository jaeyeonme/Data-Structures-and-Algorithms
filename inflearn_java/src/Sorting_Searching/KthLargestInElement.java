package Sorting_Searching;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 정수 배열 nums와 정수 k가 주어지면 배열에서 k번째로 큰 요소를 반환합니다.
 */
public class KthLargestInElement {
    public static void main(String[] args) {
        KthLargestInElement a = new KthLargestInElement();
//      int[] nums = { 2, 3, 1, 5, 6, 4 };
//      int k = 2;

        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 4;
        System.out.println(a.solve(nums, k));
        System.out.println(a.solve_pq(nums, k));
    }

    public int solve(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - k];
    }

    public int solve_pq(int[] nums, int k) {

        // 1. PriorityQueue
        Queue<Integer> pq = new PriorityQueue<>();  // asc minHeap

        // 2. for while
        for (int i : nums) {
            pq.offer(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        return pq.peek();
    }
}
