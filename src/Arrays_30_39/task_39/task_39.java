package Arrays_30_39.task_39;

import Arrays_30_39.InputArray;

import java.util.Arrays;

/*39. Даны целые числа a1, a2, ..., аn.
Наименьший член этой последовательности заменить целой частью среднего арифметического всех членов,
остальные члены оставить без изменения.
Если в последовательности несколько наименьших членов, то заменить последний по порядку.*/
public class task_39 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        int min = getMinimum(inputArray);
        int mean = getAverage(inputArray);
        System.out.println(mean);
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] == min) {
                inputArray[i] = mean;
                break;
            }
        }
        System.out.println("Replacement in array : " + Arrays.toString(inputArray));
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

    public static int getAverage(int[] elements) {
        int sum = 0;
        for (int number :
                elements) {
            sum += number;
        }
        return sum / elements.length;
    }
}