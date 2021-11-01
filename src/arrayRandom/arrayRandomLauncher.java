package arrayRandom;

import com.sun.jdi.Value;

import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class arrayRandomLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Array ownArray = new Array (scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        int[] array = arrayInitialize(ownArray);
        arrayToString(array);
    }

    private static int[] arrayInitialize(Array array) {
        int[] myArray = new int[array.getArraySize()];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(array.getMaxN()) + array.getMinN();
        }
        return myArray;
    }

    private static void arrayToString(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + 1 + ") " + array[i]);
        }
    }
}
