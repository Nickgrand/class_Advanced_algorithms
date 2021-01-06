package class_1_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2021/1/4
 */
public class Main {

    public static int[] countSort(int[] arr) {
        int len = arr.length;
        int[] res = new int[len];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int count = 0;
            for (int j = 0; j < len; j++) {
                if (i != j && arr[j] <= arr[i]) count++;
            }
            map.put(arr[i], count);
        }
        for (int index : arr) {
            int count = map.get(index);
            res[count] = index;
            map.put(index, count - 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            int[] num = new int[len];
            for (int i = 0; i < len; i++) {
                num[i] = in.nextInt();
            }
            int[] res = countSort(num);
            for (int i = 0; i < res.length - 1; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println(res[res.length - 1]);
        }
    }
}
