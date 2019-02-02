package Arrays_30_39.task_30;

import Arrays_30_39.InputArray;

import java.util.Arrays;

/*30. Дана последовательность целых чисел a1, a2, ..., аn.
Образовать новую последовательность, выбросив из исходной те члены, которые равны  min(a1, a2, ..., аn).*/
public class task_30 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int min = getMinimum(inputArray);
        int[] result = getRemoveMinimum(inputArray, min);
        System.out.println("The sequence excluding minimum : " + Arrays.toString(result));
    }

    public static int getMinimum(int[] elements) {
        int min = elements[0];
        for (int i = 1; i < elements.length; i++) {
            if (min > elements[i]) {
                min = elements[i];
            }
        }
        return min;
    }

    public static int[] getRemoveMinimum(int[] array, int target) {
        int[] newArray = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                newArray[j] = array[i];
                j++;
            }
        }
        newArray = Arrays.copyOf(newArray, j);
        return newArray;
    }
}