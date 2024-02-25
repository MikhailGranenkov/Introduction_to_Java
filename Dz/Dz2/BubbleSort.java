package Dz.Dz2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.logging.Logger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BubbleSort {
    private static final Logger logger = Logger.getLogger(BubbleSort.class.getName());

    public static void sort(int[] arr) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt"))) {
            boolean swapped;
            int n = arr.length;
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

            do {
                swapped = false;
                for (int i = 1; i < n; i++) {
                    if (arr[i - 1] > arr[i]) {
                        int temp = arr[i - 1];
                        arr[i - 1] = arr[i];
                        arr[i] = temp;
                        swapped = true;
                    }
                }

                String logEntry = LocalDateTime.now().format(dtf) + " " + Arrays.toString(arr);
                writer.println(logEntry);
                logger.info(logEntry);
            } while (swapped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, 4, 8, 3, 1};
        sort(arr);
    }
}