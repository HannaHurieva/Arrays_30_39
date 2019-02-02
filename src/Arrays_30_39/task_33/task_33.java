package Arrays_30_39.task_33;

import Arrays_30_39.InputArray;

import java.util.Arrays;

/*33. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.*/
public class task_33 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int[] iteratonArray = getIteration(inputArray);
        int repeat = getMaximum(iteratonArray);
        int j = 0;
        int[] result = new int[iteratonArray.length];
        for (int i = 0; i < iteratonArray.length; i++) {
            if (iteratonArray[i] == repeat) {
                result[j] = inputArray[i];
                j++;
            }
        }
        result = Arrays.copyOf(result, j);
        int out;
        if (j > 1) {
            out = getMinimum(result);
        } else out = result[0];
        System.out.println("The most common number = " + out);
    }

    public static int[] getIteration(int[] array) {
        int[] iteration = new int[array.length];
        for (int i = array.length - 1; i > 0; i--) {
            int k = 0;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    k++;
                }
            }
            iteration[i] = k;
        }
        return iteration;
    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}