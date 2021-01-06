package class_1_19;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author HuiMing
 * @date 2021/1/4
 */
public class Main {
    public static int[] nonRecQuickSort(int[] arr) {
        int len = arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.push(len - 1);
        stack.push(0);
        while (!stack.isEmpty()) {
            int left = stack.pop();
            int right = stack.pop();
            int index = partition(arr, left, right);
            if (left < index - 1) {
                stack.push(index - 1);
                stack.push(left);
            }
            if (right > index + 1) {
                stack.push(right);
                stack.push(index + 1);
            }
        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= pivot) right--;
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) left++;
            arr[right] = arr[left];
        }
        arr[right] = pivot;
        return right;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            int[] num = new int[len];
            for (int i = 0; i < len; i++) {
                num[i] = in.nextInt();
            }
            int[] res = nonRecQuickSort(num);
            for (int i = 0; i < res.length - 1; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println(num[res.length - 1]);
        }
    }
}
