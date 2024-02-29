package Java_lectures.Lecture6.part2;


// Создаются четыре объекта типа Worker с именами w1, w2, w3 и w4, каждый из которых содержит данные о сотруднике: имя, фамилию, зарплату и идентификатор.
// Создаются два объекта w1 и w4, содержащие одинаковые данные. Это делается для иллюстрации различий при использовании оператора сравнения == и метода equals.
// Создается коллекция HashSet с именем workers, в которую добавляются объекты w1, w2 и w3.
// Выводится результат сравнения объектов w1 и w4 с использованием оператора ==. Оператор == сравнивает ссылки на объекты, поэтому результатом будет false, даже если объекты содержат одинаковые данные.
// Выводится результат сравнения объектов w1 и w4 с использованием метода equals. В данном случае метод equals не переопределен в классе Worker, поэтому он сравнивает ссылки на объекты, а не их содержимое. Поэтому результат также будет false.
// Выводится результат проверки наличия объекта w4 в коллекции workers с помощью метода contains. В данном случае результатом будет true, поскольку HashSet использует метод equals для проверки наличия элемента в коллекции, и HashSet считает объекты w1 и w4 равными, несмотря на то, что они имеют разные ссылки на объекты.


import java.util.*;

public class Ex001_Program {

    public static void main(String[] args) {
        // #region
        // Создание и инициализация объектов Worker
        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;
        // System.out.println(w1);
        // System.out.println(w2);
        // System.out.println(w3);
        //#endregion

        // Сравнение объектов с использованием оператора ==
        System.out.println(w1==w4); // false

        // Сравнение объектов с использованием метода equals
        System.out.println(w1.equals(w4)); // false

        // Создание множества HashSet и добавление в него объектов Worker
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));

        // Проверка наличия объекта w4 в множестве workers
        System.out.println(workers.contains(w4)); // true
    }
}
