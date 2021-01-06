package class_1_16;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/30
 */
public class Main {
    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int index = i - 1;
            while (index >= 0 && arr[index] > tmp) {
                arr[index + 1] = arr[index];
                index--;
            }
            arr[index + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int i = 0; i < T; i++) {
                int len = in.nextInt();
                int[] arr = new int[len];
                for (int j = 0; j < len; j++) {
                    arr[j] = in.nextInt();
                }
                insert(arr);
                for (int j = 0; j < arr.length - 1; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println(arr[arr.length - 1]);
            }
        }
    }
}
