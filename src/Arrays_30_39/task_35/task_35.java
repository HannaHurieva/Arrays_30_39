package Arrays_30_39.task_35;

import Arrays_30_39.InputArray;

import java.util.Arrays;

/*35. Дан целочисленный массив с количеством элементов n.
"Сожмите" массив, выбросив из него каждый второй элемент (дополнительный массив при этом не использовать).*/
public class task_35 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int length = n % 2 == 0 ? n / 2 : n / 2 + 1;
        for (int i = 1; i < length; i++) {
            inputArray[i] = inputArray[i * 2];
        }
        inputArray = Arrays.copyOf(inputArray, length);
        System.out.println("Excluding every second element : " + Arrays.toString(inputArray));
    }
}