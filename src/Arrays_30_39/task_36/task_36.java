package Arrays_30_39.task_36;

import Arrays_30_39.InputArray;

import java.util.Arrays;

/*36. Задан массив, содержащий несколько нулевых элементов.
Сжать его, выбросив эти элементы.*/
public class task_36 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int[] result = new int[inputArray.length];
        int j = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 0) {
                result[j] = inputArray[i];
                j++;
            }
        }
        result = Arrays.copyOf(result, j);
        System.out.println("Excluding zeros: " + Arrays.toString(result));
    }
}