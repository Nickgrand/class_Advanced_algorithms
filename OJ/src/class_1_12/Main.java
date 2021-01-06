package class_1_12;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/31
 */
public class Main {
    public static int[] maxGuests(int[] entry, int[] exit) {
        Arrays.sort(entry);
        Arrays.sort(exit);
        int lenArray = entry.length;
        int max = Integer.MIN_VALUE;
        int numberOfPeople = 1;
        int time = entry[0];
        int indexOfEntry = 1, indexOfExit = 0;
        while (indexOfEntry < lenArray && indexOfExit < lenArray) {
            if (entry[indexOfEntry] <= exit[indexOfExit]) {
                numberOfPeople++;
                if (numberOfPeople > max) {
                    max = numberOfPeople;
                    time = entry[indexOfEntry++];
                } else {
                    numberOfPeople--;
                    indexOfExit++;
                }
            }
        }
        return new int[]{numberOfPeople, time};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int cnt = 0; cnt < T; cnt++) {
                int len = in.nextInt();
                int[] entryTime = new int[len];
                int[] exitTime = new int[len];
                for (int i = 0; i < len; i++) {
                    entryTime[i] = in.nextInt();
                }
                for (int i = 0; i < len; i++) {
                    exitTime[i] = in.nextInt();
                }
                int[] res = maxGuests(entryTime, exitTime);

                System.out.println(res[0] + " " + res[1]);
            }
        }
    }
}
