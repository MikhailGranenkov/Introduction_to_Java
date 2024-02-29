package Java_lectures.Lecture6.part1;


// Создание HashSet и добавление элементов:
// В начале программы создается новый объект типа HashSet, который будет содержать целые числа. Затем в этот HashSet добавляются четыре числа: 1, 12, 123 и 1234. Обратите внимание, что при попытке добавить число 1234 еще раз, оно не добавляется, потому что HashSet не может содержать дубликаты.
// Проверка наличия элемента:
// Программа проверяет, содержится ли число 12 в HashSet. Так как число 12 было добавлено ранее, метод contains возвращает true.
// Добавление null:
// Затем в HashSet добавляется значение null. HashSet может содержать только одно значение null.
// Вывод размера HashSet:
// Выводится количество элементов в HashSet. В данном случае это 5, так как в нем находятся 4 числа и значение null.
// Вывод содержимого HashSet:
// Программа выводит содержимое HashSet на экран. Порядок элементов в выводе не гарантирован из-за особенностей внутреннего устройства HashSet.
// Удаление элемента:
// Из HashSet удаляется число 12 с помощью метода remove.
// Итерация по HashSet и вывод элементов:
// Программа проходит по всем элементам в HashSet с помощью цикла for-each и выводит каждый элемент на экран.
// Очистка HashSet:
// HashSet очищается, удаляя все его элементы с помощью метода clear.
// Вывод пустого HashSet:
// После очистки программа выводит пустой HashSet на экран.


import java.util.*;

public class Ex001_HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1); set.add(12); set.add(123);
        set.add(1234); set.add(1234);
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        for (var item : set) {
            System.out.println(item); // null 1 1234 123
        }
        set.clear();
        System.out.println(set); // []
    }
}