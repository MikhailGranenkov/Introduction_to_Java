package Java_lectures.Lecture5;


// Этот код на Java демонстрирует использование класса HashMap для создания хэш-таблицы, а также итерацию по записям хэш-таблицы с использованием метода entrySet().

// Программа создает объект HashMap с типом ключа Integer и типом значения String, а затем добавляет три записи в хэш-таблицу с помощью метода put() и putIfAbsent().

// После заполнения хэш-таблицы программа выполняет цикл for-each, перебирая каждую запись в хэш-таблице с помощью метода entrySet(). Для каждой записи выводится ключ и значение на консоль с помощью методов getKey() и getValue().

// Таким образом, программа выводит все записи хэш-таблицы в формате [ключ: значение], предоставляя полный список ключей и соответствующих им значений.


import java.util.*;

public class Ex002_HashMapEntry {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db); 

        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}