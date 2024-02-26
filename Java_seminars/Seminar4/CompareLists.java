package Seminar4;

// Задача №0.
// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
// Сравните с предыдущим.


// Этот код сравнивает производительность операций добавления элементов
// в списки типа ArrayList и LinkedList. В частности, он измеряет время,
// которое требуется для добавления элементов в конец списка,
// в начало списка и в середину списка для обоих типов списков.

// Давайте рассмотрим пошагово:

// В начале программы определяются два метода для каждой операции добавления
// (в конец, в начало, в середину) для обоих типов списков: ArrayList и LinkedList.
// В методе main устанавливается переменная count, которая указывает количество элементов,
// которые будут добавлены в каждый список. Затем выполняются операции добавления элементов
// в каждый из списков типа ArrayList и LinkedList.
// Замеряется время выполнения каждой операции с помощью вызова System.currentTimeMillis()
// перед и после выполнения операции, а затем вычисляется разница во времени, чтобы узнать,
// сколько миллисекунд заняло выполнение каждой операции.
// Результаты выводятся на экран для сравнения времени выполнения операций для ArrayList
// и LinkedList.
// Конкретные методы, такие как getArrayListAddLast, getLinkedListAddLast,
// getArrayListAddFirst, и так далее, выполняют добавление элементов в конец,
// начало и середину списков соответственно.

// Обратите внимание, что операции добавления в начало и середину ArrayList
// могут быть более затратными, чем для LinkedList, потому что в ArrayList для
// этого требуется сдвиг всех последующих элементов вправо, чтобы освободить место
// для нового элемента, что занимает O(n) времени, в то время как для LinkedList этого
// не происходит.


import java.util.ArrayList;
import java.util.LinkedList;

public class CompareLists {

    public static void main(String[] args) {
        // Устанавливаем количество элементов, которые будут добавлены в каждый список
        int count = 200_000;

        // Сравнение производительности операций добавления в конец списка
        System.out.println("Добавление в конец списка");
        long start = System.currentTimeMillis();
        getArrayListAddLast(count); // Добавление в конец ArrayList
        System.out.println(System.currentTimeMillis() - start); // Вывод времени выполнения
        start = System.currentTimeMillis();
        getLinkedListAddLast(count); // Добавление в конец LinkedList
        System.out.println(System.currentTimeMillis() - start); // Вывод времени выполнения
        System.out.println();

        // Сравнение производительности операций добавления в начало списка
        System.out.println("Добавление в начало списка");
        start = System.currentTimeMillis();
        getArrayListAddFirst(count); // Добавление в начало ArrayList
        System.out.println(System.currentTimeMillis() - start); // Вывод времени выполнения
        start = System.currentTimeMillis();
        getLinkedListAddFirst(count); // Добавление в начало LinkedList
        System.out.println(System.currentTimeMillis() - start); // Вывод времени выполнения
        System.out.println();

        // Сравнение производительности операций добавления в середину списка
        System.out.println("Добавление в середину списка");
        start = System.currentTimeMillis();
        getArrayListAddMiddle(count); // Добавление в середину ArrayList
        System.out.println(System.currentTimeMillis() - start); // Вывод времени выполнения
        start = System.currentTimeMillis();
        getLinkedListAddMiddle(count); // Добавление в середину LinkedList
        System.out.println(System.currentTimeMillis() - start); // Вывод времени выполнения
   }

    // Метод для добавления элементов в конец ArrayList
    public static ArrayList<Integer> getArrayListAddLast(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addLast(i); // Добавляем элемент в конец списка
        }
        return arrayList;
    }

    // Метод для добавления элементов в конец LinkedList
    public static LinkedList<Integer> getLinkedListAddLast(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addLast(i); // Добавляем элемент в конец списка
        }
        return linkedList;
    }

    // Метод для добавления элементов в начало ArrayList
    public static ArrayList<Integer> getArrayListAddFirst(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.addFirst(i); // Добавляем элемент в начало списка
        }
        return arrayList;
    }

    // Метод для добавления элементов в начало LinkedList
    public static LinkedList<Integer> getLinkedListAddFirst(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.addFirst(i); // Добавляем элемент в начало списка
        }
        return linkedList;
    }

    // Метод для добавления элементов в середину ArrayList
    public static ArrayList<Integer> getArrayListAddMiddle(int count) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            arrayList.add(arrayList.size()/2, i); // Добавляем элемент в середину списка
        }
        return arrayList;
    }

    // Метод для добавления элементов в середину LinkedList
    public static LinkedList<Integer> getLinkedListAddMiddle(int count) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            linkedList.add(linkedList.size()/2, i); // Добавляем элемент в середину списка
        }
        return linkedList;
    }
}
