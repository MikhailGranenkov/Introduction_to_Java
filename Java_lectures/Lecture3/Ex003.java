package Java_lectures.Lecture3;


// Этот код на Java создает несколько объектов ArrayList с различными параметрами конструктора и демонстрирует их использование. Вот пошаговое объяснение:

// Создание объектов ArrayList:
// ArrayList<Integer> list1 = new ArrayList<Integer>();: Создается объект ArrayList типа Integer без указания начальной емкости.
// ArrayList<Integer> list2 = new ArrayList<>();: Также создается объект ArrayList типа Integer без явного указания типа в угловых скобках (введено с Java 7).
// ArrayList<Integer> list3 = new ArrayList<>(10);: Создается объект ArrayList типа Integer с начальной емкостью 10.
// ArrayList<Integer> list4 = new ArrayList<>(list3);: Создается объект ArrayList типа Integer, который инициализируется содержимым другого списка list3.
// Вывод содержимого списка:
// System.out.println(list3);: Выводится содержимое списка list3. Поскольку список пустой, выводится пустой список [].
// Добавление элемента в список и вывод содержимого другого списка:
// list3.add(123);: В список list3 добавляется элемент со значением 123.
// System.out.println(list4);: Выводится содержимое списка list4, который был инициализирован содержимым списка list3. Теперь он также содержит элемент 123.

import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        System.out.println(list3);
        list3.add(123);
        System.out.println(list4);

    }
}
