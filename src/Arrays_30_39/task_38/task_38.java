package Arrays_30_39.task_38;

import Arrays_30_39.InputArray;

import java.util.Scanner;

/*38. Дана последовательность целых чисел a1, a2, ..., аn.
Указать пары чисел аi, аj, таких, что аi + аj = m.*/
public class task_38 {
    public static void main(String[] args) {
        int n = InputArray.getLengthOfSequence();
        int[] inputArray = InputArray.getArray(n);
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number, m :");
        int m = in.nextInt();
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = inputArray.length - 1; j > i; j--) {
                if (inputArray[i] + inputArray[j] == m) {
                    System.out.println("a" + i + " = " + inputArray[i] + ", a" + j + " = " + inputArray[j]);
                }
            }
        }
    }
}