package class_1_6;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2021/1/1
 */
public class Main {
    public static long squares(long num) {
        return num * (num + 1) * (2 * num + 1) / 6;
    }

    public static long power(long P) {
        long min = (long) Math.pow(P, 1.0/3), mid, max = 144225;
        long res = 0;
        while (min <= max) {
            mid = (max + min) / 2;
            long num = squares(mid);
            if (num <= P) {
                res = mid;
                min = mid + 1;
            } else max = mid - 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int i = 0; i < T; i++) {
                long P = in.nextLong();
                System.out.println(power(P));
            }
        }
    }
}
