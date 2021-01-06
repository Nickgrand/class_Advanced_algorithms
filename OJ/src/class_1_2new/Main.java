package class_1_2new;

/**
 * @author HuiMing
 * @date 2020/12/30
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        while (in.hasNext()) {
            int cnt = in.nextInt();
            int[] res = new int[cnt];
            for (int i = 0; i < cnt; i++) {
                a = in.nextInt();
                b = in.nextInt();
                res[i] = a + b;
            }
            for (int re : res) {
                System.out.println(re);
            }
        }
    }
}

