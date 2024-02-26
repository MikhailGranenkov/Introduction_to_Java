package Java_lectures.Lecture5;


// Этот код на Java демонстрирует использование класса HashMap для создания и управления хэш-таблицей. Программа создает объект HashMap с типом ключа Integer и типом значения String.

// Затем в хэш-таблицу добавляются три записи с помощью метода put() и putIfAbsent(). Ключ null также добавляется в таблицу, что является допустимой операцией в HashMap.

// После этого программа выводит содержимое хэш-таблицы с помощью метода System.out.println(), демонстрируя порядок элементов и возможность хранения ключа null.

// Затем программа проверяет, содержится ли определенное значение или ключ в хэш-таблице, используя методы containsValue() и containsKey(), и выводит результаты на консоль.

// Наконец, программа выводит набор ключей и коллекцию значений с помощью методов keySet() и values() соответственно.


import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один"); 
        db.put(2, "два"); 
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        //db.remove(null); 
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet());
        System.out.println(db.values());


    }
}