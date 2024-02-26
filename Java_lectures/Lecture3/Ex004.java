package Java_lectures.Lecture3;


// Этот код на Java создает массив date из трех элементов типа Integer, представляющих день, месяц и год. Затем массив преобразуется в список с помощью метода Arrays.asList(). Полученный список выводится на консоль и содержит значения дня, месяца и года в виде [29, 9, 1990].


import java.util.Arrays;
import java.util.List;

public class Ex004 {
    public static void main(String[] args) {
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
    }
}