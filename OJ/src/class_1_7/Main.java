package class_1_7;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2021/1/1
 */

public class Main {
    public static void showTree(int[] arr) {
        int len = arr.length;
        int row = 0;
        int end = 0;
        for (int i = 0; i < len; ) {
            if (row != 0) end = (int) (end + Math.pow(2, row));
            if (end >= len) end = len - 1;
            for (int j = end; j >= i; j--) {
                if (j != i) System.out.print(arr[j] + " ");
                else System.out.println(arr[j]);
            }
            i = (int) (Math.pow(2, ++row) - 1);
        }
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
                showTree(arr);
            }
        }
    }
}
