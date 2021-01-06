package class_1_10;

import java.util.Scanner;

/**
 * @author HuiMing
 * @date 2020/12/30
 */
public class Main {
    /**
     *
     * @param bookPages 书的页数数组
     * @param numberOfBooks 书数目（桶的深度）
     * @param numberOfStudents 学生数（桶）(桶的数量)
     * @return ans
     */
    private static int par(int[] bookPages, int numberOfBooks, int numberOfStudents) {
//        只有一本书，书随便给谁
        if (numberOfBooks == 1) return bookPages[0];
//        只有一位学生，书全部给他
        if (numberOfStudents == 1) return sum(bookPages, 0, bookPages.length - 1);

        int best = Integer.MAX_VALUE;
        for (int i = 0; i < numberOfBooks; i++) {
            best = Math.min(best,
                    Math.max(par(bookPages, i+1, numberOfStudents - 1),
                            sum(bookPages, i, numberOfBooks - 1)));
        }
        return best;
    }

    private static int sum(int[] arr, int begin, int end) {
        int sum = 0;
        for (int j = begin; j < end; j++) {
            sum += arr[j];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(par(new int[]{12,34, 67, 90}, 4, 2));
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int T = in.nextInt();
            for (int cnt = 0; cnt < T; cnt++) {
                int len = in.nextInt();
                int[] books = new int[len];
                for (int i = 0; i < len; i++) {
                    books[i] = in.nextInt();
                }
                int numOfStudent = in.nextInt();
//                System.out.println(allocate(books, numOfStudent));
            }
        }
    }
}
