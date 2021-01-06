package class_1_14;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/31
 */
public class Main {
    public static int[] mergeArray(int[][] matrix) {
        int len = matrix.length;
        int[] res = new int[len * len];
        int idx = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                res[idx++] = matrix[i][j];
            }
        }
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int cnt = 0; cnt < T; cnt++) {
                int K = in.nextInt();
                int[][] matrix = new int[K][K];
                for (int i = 0; i < K; i++) {
                    for (int j = 0; j < K; j++) {
                        matrix[i][j] = in.nextInt();
                    }
                }
                int[] res = mergeArray(matrix);
                for (int i = 0; i < res.length - 1; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println(res[res.length - 1]);
            }
        }
    }
}
