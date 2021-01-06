package class_1_15;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2021/1/2
 */
public class Main {
    public static int minSwap(int[] arr) {
        int len = arr.length;
        int cnt = 0;
        int[] cmp = Arrays.copyOfRange(arr, 0, len);
        Arrays.sort(cmp);
        for (int i = 0; i < len; i++) {
            if (arr[i] != cmp[i]) {
                swap(arr, i, findIndexOf(arr, cmp[i]));
                cnt++;
            }
        }
        return cnt;
    }

    private static int findIndexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int cnt = 0; cnt < T; cnt++) {
                int len = in.nextInt();
                int[] arr = new int[len];
                for (int i = 0; i < len; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println(minSwap(arr));
            }
        }
    }
}
