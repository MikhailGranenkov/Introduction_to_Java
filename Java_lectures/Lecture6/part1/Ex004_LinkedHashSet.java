package Java_lectures.Lecture6.part1;


// Создаются два объекта LinkedHashSet с именами a и b, содержащие целочисленные значения, переданные в виде списка.
// В множество a добавляется новый элемент 28.
// Выводится содержимое множеств a и b.


import java.util.*;

public class Ex004_LinkedHashSet {
    public static void main(String[] args) {
        // Создание множеств a и b
        var a = new LinkedHashSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new LinkedHashSet<>(Arrays.asList(13,3,17,7,2,11,5));
        
        // Добавление элемента 28 в множество a
        a.add(28);

        // Вывод содержимого множеств a и b
        System.out.println(a); // [1, 7, 2, 3, 6, 4, 5, 28]
        System.out.println(b); // [13, 3, 17, 7, 2, 11, 5]
    }
}
