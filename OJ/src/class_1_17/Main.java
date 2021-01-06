package class_1_17;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/30
 */
public class Main {
    public static void Bubble(int[] arr) {
        int len = arr.length;
        if (len == 0) return;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            int[] num = new int[len];
            for (int i = 0; i < len; i++) {
                num[i] = in.nextInt();
            }
            Bubble(num);
            for (int i=0; i<num.length-1 ;i++) {
                System.out.print(num[i]+" ");
            }
            System.out.println(num[num.length-1]);
        }
    }
}
