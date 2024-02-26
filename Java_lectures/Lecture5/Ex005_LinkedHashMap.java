package Java_lectures.Lecture5;


// Этот код на Java демонстрирует использование класса LinkedHashMap, который представляет собой карту, сохраняющую порядок вставки элементов.

// Создается объект LinkedHashMap с именем linkmap.
// Затем метод put() используется для добавления пар ключ-значение в карту linkmap.
// После этого выводится содержимое карты linkmap с помощью System.out.println().
// Затем создается объект HashMap с именем map.
// Также используется метод put() для добавления пар ключ-значение в карту map.
// Выводится содержимое карты map.
// Обратите внимание, что элементы в LinkedHashMap сохраняют порядок вставки, тогда как элементы в HashMap не гарантируются в определенном порядке.


import java.util.*;

public class Ex005_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer,String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map); // {1=один, 2=два, 11=один один}
    }
}
