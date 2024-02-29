package Java_lectures.Lecture6.part1;


// Создаются два множества a и b, содержащие целочисленные значения от 1 до 7 и от 2 до 17 соответственно.
// Создается новое множество u, которое содержит все уникальные элементы из множеств a и b.
// Создается новое множество r, в котором остаются только те элементы, которые одновременно присутствуют и в a, и в b.
// Создается новое множество s, содержащее элементы из a, которые отсутствуют в b.
// Выводятся содержимое множеств a, b, u, r и s.
// Выводится результат операции добавления всех элементов из b в a.


import java.util.*;

public class Ex002_MathSet {
    public static void main(String[] args) {
        // Создание множеств a и b
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        
        // Объединение множеств a и b
        var u = new HashSet<Integer>(a); u.addAll(b);
        
        // Пересечение множеств a и b
        var r = new HashSet<Integer>(a); r.retainAll(b);
        
        // Разность множеств a и b
        var s = new HashSet<Integer>(a); s.removeAll(b);
        
        // Вывод результатов
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]

        // Вывод результата операции добавления всех элементов из b в a
        System.out.println(a.addAll(b));
    }
}
