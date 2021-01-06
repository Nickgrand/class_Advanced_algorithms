package class_1_13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/30
 */
public class Main {
    public static String fourSum(int[] arr, int target) {
        StringBuilder res = new StringBuilder();
        int len = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 1; j < len - 2; j++) {
                int left = j + 1, right = len - 1;
                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    if (sum == target)
                        res.append(arr[i]).append(" ").append(arr[j]).append(" ").append(arr[left++]).append(" ").append(arr[right--]).append(" $");
                    else if (sum > target) right--;
                    else left++;
                }
            }
        }
        return res.toString();
    }

    /*
    n^2logn解法:
    */
    // Function to find 4 elements that add up to
    // given sum
    public static void fourSum(int X, int[] arr, Map<Integer, pair> map) {
        int[] temp = new int[arr.length];

        // Iterate from 0 to temp.length
        for (int i = 0; i < temp.length; i++)
            temp[i] = 0;

        // Iterate from 0 to arr.length
        for (int i = 0; i < arr.length - 1; i++) {

            // Iterate from i + 1 to arr.length
            for (int j = i + 1; j < arr.length; j++) {

                // Store curr_sum = arr[i] + arr[j]
                int curr_sum = arr[i] + arr[j];

                // Check if X - curr_sum if present
                // in map
                if (map.containsKey(X - curr_sum)) {

                    // Store pair having map value
                    // X - curr_sum
                    pair p = map.get(X - curr_sum);

                    if (p.first != i && p.sec != i
                            && p.first != j && p.sec != j
                            && temp[p.first] == 0
                            && temp[p.sec] == 0 && temp[i] == 0
                            && temp[j] == 0) {

                        // Print the output
                        System.out.printf(
                                "%d,%d,%d,%d", arr[i], arr[j],
                                arr[p.first], arr[p.sec]);
                        temp[p.sec] = 1;
                        temp[i] = 1;
                        temp[j] = 1;
                        break;
                    }
                }
            }
        }
    }

    // Program for two Sum
    public static Map<Integer, pair> twoSum(int[] nums) {
        Map<Integer, pair> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                map.put(nums[i] + nums[j], new pair(i, j));
            }
        }
        return map;
    }

    // to store indices of two sum pair
    public static class pair {
        int first, sec;

        public pair(int first, int sec) {
            this.first = first;
            this.sec = sec;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int cnt = 0; cnt < T; cnt++) {
                int N = in.nextInt();
                int K = in.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println(fourSum(arr, K));
            }
        }
    }
}
