package Arrays_30_39;

import java.util.Scanner;

public class InputArray {
    public static int getLengthOfSequence() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the length of sequence elements n:");
        int n = in.nextInt();
        return n;
    }

    public static int[] getArray(int n) {
        Scanner in = new Scanner(System.in);
        int[] inputArray = new int[n];
        System.out.println("Input the numbers of sequence:");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = in.nextInt();
        }
        return inputArray;
    }
}