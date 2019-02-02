package Arrays_30_39.task_37;

import Arrays_30_39.InputArray;

import java.util.Arrays;

/*37. Задан массив с количеством элементов N.
Сформируйте два массива: в первый включите элементы исходного массива с четными номерами,
а во второй – с нечетными.*/
public class task_37 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] evenArray = new int[length];
        int[] oddArray = new int[n / 2];
        int j = 0, k = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                evenArray[j] = inputArray[i];
                j++;
            } else {
                oddArray[k] = inputArray[i];
                k++;
            }
        }
        System.out.println("Even array : " + Arrays.toString(evenArray));
        System.out.println("Odd  array : " + Arrays.toString(oddArray));
    }
}