package numbers;

import java.util.Scanner;

public class numbersLauncher {
    public static void main(String[] args) {
        System.out.println("Show numbers in interval:");
        Scanner scanner = new Scanner(System.in);
        Interval interval = new Interval(scanner.nextInt(), scanner.nextInt());
        showNumbersInInterval(interval);
    }

    private static void showNumbersInInterval(Interval interval) {
        for (int i = interval.getMinN(); i <= interval.getMaxN(); i++) {
            System.out.print(i + "   ");
        }
    }
}
