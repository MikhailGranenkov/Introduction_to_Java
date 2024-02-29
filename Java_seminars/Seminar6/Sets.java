package Seminar6;


// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,3}. Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.


// Этот код создает и заполняет три различных типа множества (HashSet, LinkedHashSet, TreeSet) и выводит их содержимое. В HashSet и LinkedHashSet дубликаты игнорируются, а в TreeSet элементы автоматически сортируются в порядке возрастания.


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        // Создание и заполнение HashSet
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(2); // Дубликаты игнорируются
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(3); // Дубликаты игнорируются

        // Вывод содержимого HashSet
        System.out.println("HashSet содержит:");
        for (Integer num : hashSet) {
            System.out.println(num);
        }

        // Создание и заполнение LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(2); // Дубликаты игнорируются
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        linkedHashSet.add(3); // Дубликаты игнорируются

        // Вывод содержимого LinkedHashSet
        System.out.println("\nLinkedHashSet содержит:");
        for (Integer num : linkedHashSet) {
            System.out.println(num);
        }

        // Создание и заполнение TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(2); // Дубликаты игнорируются
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(6);
        treeSet.add(3); // Дубликаты игнорируются

        // Вывод содержимого TreeSet
        System.out.println("\nTreeSet содержит:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }
    }
}
