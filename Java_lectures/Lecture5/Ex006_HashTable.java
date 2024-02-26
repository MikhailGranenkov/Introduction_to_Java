package Java_lectures.Lecture5;


// Этот код на Java демонстрирует использование класса Hashtable, который представляет собой реализацию интерфейса Map, предназначенную для хранения пар ключ-значение.

// Создается объект Hashtable с именем table.
// Затем метод put() используется для добавления пар ключ-значение в таблицу table.
// После этого выводится содержимое таблицы table с помощью System.out.println().
// Обратите внимание, что Hashtable аналогичен HashMap, но является потокобезопасным. Ключи и значения не упорядочены и могут находиться в произвольном порядке в таблице. Кроме того, Hashtable не позволяет добавлять элементы с ключом или значением null, иначе будет сгенерировано исключение NullPointerException.


import java.util.*;

public class Ex006_HashTable {
    public static void main(String[] args) {
        Map<Integer,String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); //  java.lang.NullPointerException
    }
}
