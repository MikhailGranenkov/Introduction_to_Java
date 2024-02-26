package Java_lectures.Lecture3;


// Этот код на Java создает список из трех объектов StringBuilder, которые содержат строковые представления дня, месяца и года. Затем список выводится на консоль. После этого один из элементов списка изменяется, но это не влияет на уже существующий список. Изменение переменной day на новый объект StringBuilder, представляющий строку "09", не отражается на списке d, который сохраняет свои оригинальные значения.

import java.util.Arrays;
import java.util.List;

public class Ex005 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        List<StringBuilder> d = Arrays.asList(day, month, year);
        System.out.println(d); // [29, 9, 1990]
        day = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]
    }
}