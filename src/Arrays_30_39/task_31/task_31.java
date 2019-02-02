package Arrays_30_39.task_31;

import java.util.Scanner;

/*31. У прилавка магазина выстроилась очередь из n покупателей.
Время обслуживания i-того покупателя равно tj (i = 1, …, n).
Определить время Ci пребывания i-гo покупателя в очереди.*/
public class task_31 {
    public static void main(String[] args) {
        int n = getNumberOfBuyers();
        int[] timeService = getServiceTime(n);
        int[] queueTime = getQueueTime(timeService);
        System.out.println("Input the number of buyer, i : ");
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        System.out.println("The time in queue for " + i + " buyer = " + queueTime[i - 1]);
    }

    public static int getNumberOfBuyers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number of buyers, n:");
        return in.nextInt();
    }

    public static int[] getServiceTime(int n) {
        Scanner in = new Scanner(System.in);
        int[] timeService = new int[n];
        System.out.println("Input the service time for each buyer:");
        for (int i = 0; i < timeService.length; i++) {
            timeService[i] = in.nextInt();
        }
        return timeService;
    }

    public static int[] getQueueTime(int[] array) {
        int[] queueTime = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            queueTime[i] = queueTime[i - 1] + array[i - 1];
        }
        return queueTime;
    }
}