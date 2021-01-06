package class_1_8;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/30
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int i = 0; i < T; i++) {
                int A = in.nextInt();
                int B = in.nextInt();
                int C = in.nextInt();
                int res = 1;
                if (B == 0) {
                    System.out.println(1);
                    continue;
                }
                for (int cnt = 0; cnt < B; cnt++) {
                    res *= A;
                    res %= C;
                }
                System.out.println(res);
            }
        }
    }
}
