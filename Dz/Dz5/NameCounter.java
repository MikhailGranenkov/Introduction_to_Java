package Dz.Dz5;


// Вы работаете с приложением для учета имен пользователей. Ваша задача - разработать программу, которая принимает на вход пять имен пользователей (или использует имена по умолчанию, если аргументы не предоставлены) и подсчитывает, сколько раз каждое имя встречается.
// Программа должна использовать HashMap для хранения имен и их количества вхождений.
// По завершении, программа выводит результат в виде пар "имя - количество".


// Импорт библиотек:
// import java.util.HashMap;: Это импорт класса HashMap из пакета java.util, который позволяет использовать HashMap для хранения имен и их количества вхождений.
// Основной класс NameCounter:
// Этот класс содержит метод main, который является точкой входа в программу.
// Метод main:
// Создается объект Scanner, который позволяет считывать данные с клавиатуры.
// Создается HashMap с именем nameCounts, где ключами являются имена пользователей, а значениями - количество вхождений каждого имени.
// Запускается цикл for, в котором пользователю предлагается ввести пять имен с клавиатуры.
// Введенное имя считывается с помощью метода nextLine() объекта Scanner.
// Проверяется, содержится ли имя уже в HashMap с помощью метода getOrDefault(). Если содержится, значение увеличивается на 1, иначе имя добавляется в HashMap с начальным значением 1.
// После ввода всех имен, результаты подсчета выводятся на экран с помощью метода println(). Выводится содержимое HashMap, которое представляет собой пары "имя - количество".
// Наконец, объект Scanner закрывается с помощью метода close().
// Этот код реализует задачу подсчета количества вхождений имен, введенных пользователем, и выводит результаты на экран. Он использует HashMap для хранения имен и их количества вхождений.


import java.util.HashMap;
import java.util.Scanner;

public class NameCounter {
    public static void main(String[] args) {
        // Создаем HashMap для хранения имен и их количества вхождений
        HashMap<String, Integer> nameCounts = new HashMap<>();

        // Создаем объект Scanner для ввода данных с клавиатуры
        Scanner scanner = new Scanner(System.in);

        // Считываем пять имен пользователей или используем имена по умолчанию, если аргументы не предоставлены
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя пользователя: ");
            String name = scanner.nextLine();

            // Если имя уже есть в HashMap, увеличиваем счетчик на 1
            // Иначе, добавляем имя в HashMap с начальным счетчиком 1
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }

        // Выводим результаты подсчета
        System.out.println("Результаты подсчета:");
        System.out.println(nameCounts);

        // Закрываем Scanner
        scanner.close();
    }
}
