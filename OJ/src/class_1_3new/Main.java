package class_1_3new;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/30
 */
//Under Test
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            List<Integer> list = new ArrayList<>();
            int a = in.nextInt();
            int b = in.nextInt();
            while (a != 0 || b != 0) {
                list.add(a + b);
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
