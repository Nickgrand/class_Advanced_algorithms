package class_1_25;

import java.util.*;

/**
 * @author HuiMing
 * @date 2021/1/4
 */
public class Main {
    public static int[] sortByNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index : arr) {
            if (map.containsKey(index)) map.put(index, map.get(index) + 1);
            else map.put(index, 1);
        }
        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(set);
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());
        int[] res = new int[arr.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : list) {
            for (int j = 0; j < integerIntegerEntry.getValue(); j++) {
                res[index++] = integerIntegerEntry.getKey();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int cnt = 0; cnt < T; cnt++) {
                int len = in.nextInt();
                int[] arr = new int[len];
                for (int i = 0; i < len; i++) {
                    arr[i] = in.nextInt();
                }
                int[] res = sortByNumber(arr);
                for (int i = 0; i < len - 1; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println(res[res.length - 1]);
            }
        }
    }
}
