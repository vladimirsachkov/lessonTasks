package arrayRandom;

import com.sun.jdi.Value;

import java.sql.Struct;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class arrayRandomLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array ownArray = new Array(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        int[] array = arrayInitialize(ownArray);
        arrayToString(array);
        minArrayValue(array);
        averageArrayValue(array);
        maxArrayValue(array);
    }

    private static int[] arrayInitialize(Array array) {
        int[] myArray = new int[array.getArraySize()];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            boolean notInterval = true;
            do {
                myArray[i] = random.nextInt();
                if (myArray[i] >= array.getMinN() && myArray[i] <= array.getMaxN()) {
                    notInterval = false;
                }
            } while (notInterval == true);
        }
        return myArray;
    }

    private static void arrayToString(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ") " + array[i]);
        }
    }

    private static void minArrayValue(int[] array) {
        Arrays.sort(array);
        System.out.println("Минимальное значение: " + array[0]);
    }

    private static void maxArrayValue(int[] array) {
        Arrays.sort(array);
        System.out.println("Максимальное значение: " + array[array.length - 1]);
    }

    private static void averageArrayValue(int[] array) {
        int avrN = 0;
        for (int i = 0; i < array.length; i++) {
            avrN += array[i];
        }
        avrN = avrN/array.length;

        System.out.println("Среднее значение: " + avrN);
    }
}
