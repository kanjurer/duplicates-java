import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] readData(int num, Scanner kb) {
        String[] array = new String[num];

        for (int i = 0; i < num; i++) {
            array[i] = kb.next();
        }

        return array;
    }

    public static void printRepeatedStrings(int num, String[] dataArray) {
        String[] array = Arrays.copyOf(dataArray, dataArray.length);
        Arrays.sort(array); // sorting array

        // arrays
        int[] counter = new int[array.length];
        String[] repeats = new String[array.length];

        // declarations
        int count;
        int sentinel = 0;
        boolean checker;
        String value;


        for (int i = 0; i < num; i++) {
            count = 1;
            value = "";
            checker = false;
            for (int j = i + 1; j < num; j++) {
                if (array[j].equals(array[i])) {
                    checker = true; // checks if this 'if' statement is executed
                    value = array[j];
                    i++; // IMPORTANT!!! -  skipping values that are read to avoid re-reading in outer loop
                    count++;
                }
            }
            if (checker) {
                counter[sentinel] = count;
                repeats[sentinel] = value;
                sentinel++;

            }

        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 0) {
                break;
            }
            System.out.println(repeats[i] + " - " + counter[i]);
        }

    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        printRepeatedStrings(num, readData(num, kb));


    }
}