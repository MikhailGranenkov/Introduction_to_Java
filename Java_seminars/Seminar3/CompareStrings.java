package Seminar3;
// Задача 0.
// Даны следующие строки, cравнить их с помощью == и
// метода equals() класса Object
// String s1 = "hello";
// String s2 = "hello";
// String s3 = s1;
// String s4 = "h" + "e" + "l" + "l" + "o";
// String s5 = new String("hello");
// String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});


// Этот код демонстрирует различные способы создания строк и различия
// в сравнении строк с помощью оператора == и метода equals().
// Оператор == сравнивает ссылки на объекты, в то время как метод equals()
// сравнивает содержимое строк.


public class CompareStrings {

    public static void main(String[] args) {
        // Создаем несколько строковых объектов с различными способами инициализации

        String s1 = "hello"; // Создаем строку "hello" и присваиваем ее s1
        String s2 = "hello"; // Создаем другую ссылку на строку "hello", указывающую на ту же самую строку в пуле строк
        String s3 = s1; // Создаем ссылку s3, которая указывает на ту же строку "hello", что и s1
        String s4 = "h" + "e" + "l" + "l" + "o"; // Конкатенация строк во время компиляции создает новую строку в пуле строк
        String s5 = new String("hello"); // Создаем новую строку в куче (heap), не используя пул строк
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' }); // Создаем новую строку в куче, используя массив символов

        // Сравниваем строки с использованием оператора ==
        System.out.println(s1 == s2); // true, так как обе переменные указывают на один и тот же объект в пуле строк
        System.out.println(s1 == s3); // true, так как обе переменные указывают на один и тот же объект
        System.out.println(s1 == s4); // true, так как s4 была сконкатенирована во время компиляции и указывает на объект в пуле строк
        System.out.println(s1 == s5); // false, так как s5 указывает на новый объект, созданный в куче
        System.out.println(s1 == s6); // false, так как s6 указывает на новый объект, созданный в куче

        // Сравниваем строки с использованием метода equals()
        System.out.println(s1.equals(s2)); // true, так как содержание строк идентично
        System.out.println(s1.equals(s3)); // true, так как содержание строк идентично
        System.out.println(s1.equals(s4)); // true, так как содержание строк идентично
        System.out.println(s1.equals(s5)); // true, так как содержание строк идентично
        System.out.println(s1.equals(s6)); // true, так как содержание строк идентично

        // Сравниваем строки с использованием оператора == между строками, созданными через new
        System.out.println(s5 == s6); // false, так как строки s5 и s6 разные объекты в куче
        // Сравниваем строки с использованием метода equals() между строками, созданными через new
        System.out.println(s5.equals(s6)); // true, так как содержание строк идентично
    }
}
