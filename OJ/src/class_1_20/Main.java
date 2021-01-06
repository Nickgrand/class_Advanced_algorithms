package class_1_20;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2021/1/4
 */

public class Main {
    public void mergeSort(int[] a) {
        int len = 1;
        while (len < a.length) {
            for (int i = 0; i < a.length; i += 2 * len) {
                merge(a, i, len);
            }
            len *= 2;
        }
    }

    public void merge(int[] a, int i, int len) {
        int start = i;
        int len_i = i + len;//归并的前半部分数组
        int j = i + len;
        int len_j = j + len;//归并的后半部分数组
        int[] temp = new int[2 * len];
        int count = 0;
        while (i < len_i && j < len_j && j < a.length) {
            if (a[i] <= a[j]) {
                temp[count++] = a[i++];
            } else {
                temp[count++] = a[j++];
            }
        }
        while (i < len_i && i < a.length) {//注意：这里i也有可能超过数组长度
            temp[count++] = a[i++];
        }
        while (j < len_j && j < a.length) {
            temp[count++] = a[j++];
        }
        count = 0;
        while (start < j && start < a.length) {
            a[start++] = temp[count++];
        }
    }


    public static int[] nonRecMerge(int[] arr) {
        int index = 1;
        int len = arr.length;

        return arr;
    }

    private static void merge(int[] arr, int index) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int len = in.nextInt();
            int[] num = new int[len];
            for (int i = 0; i < len; i++) {
                num[i] = in.nextInt();
            }
            int[] res = nonRecMerge(num);
            for (int i = 0; i < res.length - 1; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println(num[res.length - 1]);
        }
    }
}
