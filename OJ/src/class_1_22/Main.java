package class_1_22;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2021/1/2
 */
public class Main {

    public static int[] shellSort(int[] arr, int[] gap) {
        int index = 0;
        int tmp, slowIndex;
        while (index < gap.length) {
            for (int fastIndex = gap[index]; fastIndex < arr.length; fastIndex++) {
                tmp = arr[fastIndex];
                for (slowIndex = fastIndex - gap[index]; slowIndex >= 0; slowIndex -= gap[index]) {
                    if (tmp < arr[slowIndex]) arr[slowIndex + gap[index]] = arr[slowIndex];
                    else break;
                }
                arr[slowIndex + gap[index]] = tmp;
            }
            index++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            String useless = in.nextLine();
            for (int cnt = 0; cnt < T; cnt++) {
                String[] arrayStr = in.nextLine().split(" ");
                String[] gapStr = in.nextLine().split(" ");
                int lenArray = arrayStr.length, lenGap = gapStr.length;
                int[] arr = new int[lenArray], gap = new int[lenGap];
                for (int i = 0; i < lenArray; i++) {
                    arr[i] = Integer.parseInt(arrayStr[i]);
                }
                for (int i = 0; i < lenGap; i++) {
                    gap[i] = Integer.parseInt(gapStr[i]);
                }
                int[] res = shellSort(arr, gap);
                for (int i = 0; i < res.length - 1; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println(res[res.length - 1]);
            }
        }
    }
}
