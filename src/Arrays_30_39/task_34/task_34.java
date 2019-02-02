package Arrays_30_39.task_34;

import Arrays_30_39.InputArray;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/*34. Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см,
 а каждый пасмурный день опускается вниз на 1 см.
 В начале наблюдения улитка находится в A см от земли на B-метровом дереве.
 Имеется 30-элементный массив, содержащий сведения о том, был ли
 соответствующий день наблюдения пасмурным или солнечным.
 Написать программу, определяющую местоположение улитки к концу 30-го дня наблюдения.*/
public class task_34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input A in cm - height from the ground, B in meters - tree height :");
        int a = in.nextInt();
        int b = in.nextInt();
        int snailLocation = a;
        b *= 100;
        System.out.println("Input number of day of observation :");
        int n = in.nextInt();
//        int[] inputArray = getArray(n);
        int[] inputArray = getRandomArray(n, 0, 1);
        System.out.println("Data of weather forecast for the period of observation : is cloudy = 0 or sunny = 1");
        System.out.println(Arrays.toString(inputArray));
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] > 0) {
                if (snailLocation >= b - 1) {
                    System.out.println("The snail reached the top of the tree for " + (i + 1) + " day");
                    continue;
                }
                snailLocation += 2;
            } else {
                if (snailLocation < 1) {
                    System.out.println("The snail slid down the tree for " + (i + 1) + " day");
                    continue;
                }
                snailLocation -= 1;
            }
        }
        System.out.println("Snail location at height from the ground = " + snailLocation + " cm");
    }

    // метод для ввода массива данных о погоде вручную
    public static int[] getArray(int n) {
        Scanner in = new Scanner(System.in);
        int[] inputArray = new int[n];
        System.out.println("Input data of weather forecast for the period of observation : is cloudy = 0 or sunny = 1 ");
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = in.nextInt();
        }
        return inputArray;
    }

    // метод для генерирования случайного массива данных о погоде в диапазоне значений [min, max]
    public static int[] getRandomArray(int n, int min, int max) {
        int range = max - min + 1;
        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * range) + min;
        }
        return randomArray;
    }
}