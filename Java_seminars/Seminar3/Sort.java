package Seminar3;

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() класса Collections и вывести его на
// экран.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public abstract class Sort {
    public static void main(String[] args) {
        int size = 10;
        int max = 20;
        List<Integer> list = getRand(size, max);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static List<Integer> getRand(int size, int max) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(max));
        }
        return list;
    }

}


