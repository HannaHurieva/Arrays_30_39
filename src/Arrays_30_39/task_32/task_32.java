package Arrays_30_39.task_32;

import java.util.Arrays;
import java.util.Scanner;

/*32. Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек,
 в которые надо вставить игральные кубики. Но дверь открывается только в том случае,
  когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
  (Игральный кубик имеет на каждой грани от 1 до 6 точек.)
  Напишите программу, которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.*/
public class task_32 {
    public static void main(String[] args) {
        int[] array = new int[10];
        do {
            System.out.println("Enter the first two code values :");
            Scanner in = new Scanner(System.in);
            array[0] = in.nextInt();
            array[1] = in.nextInt();
        } while ((array[0] + array[1] > 9) || (array[0] + array[1] < 4));
        for (int i = 2; i < array.length; i++) {
            array[i] = getLockCode(array[i - 2], array[i - 1]);
        }
        System.out.println("Lock code : " + Arrays.toString(array));
    }

    public static int getLockCode(int first, int second) {
        return 10 - first - second;
    }
}