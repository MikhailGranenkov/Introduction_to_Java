package Java_lectures.Lecture6.part1;


// Создаются два объекта TreeSet с именами a и b, содержащие целочисленные значения, переданные в виде списка.
// Выводится содержимое множеств a и b.
// Выводится множество элементов из a, меньших заданного элемента (в данном случае - 4).
// Выводится множество элементов из a, больших или равных заданному элементу (в данном случае - 4).
// Выводится подмножество элементов из a, находящихся в заданном диапазоне (в данном случае - от 3 (включительно) до 5 (исключительно)).


import java.util.*;

public class Ex003_TreeSet {
    public static void main(String[] args) {
        // Создание множеств a и b
        var a = new TreeSet<>(Arrays.asList(1,7,2,3,6,4,5));
        var b = new TreeSet<>(Arrays.asList(13,3,17,7,2,11,5));

        // Вывод содержимого множеств a и b
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]

        // Вывод множества элементов из a, меньших 4
        System.out.println(a.headSet(4)); // [1, 2, 3]

        // Вывод множества элементов из a, больших или равных 4
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]

        // Вывод подмножества элементов из a, находящихся в диапазоне от 3 (включительно) до 5 (исключительно)
        System.out.println(a.subSet(3, 5)); // [3, 4]
    }
}
