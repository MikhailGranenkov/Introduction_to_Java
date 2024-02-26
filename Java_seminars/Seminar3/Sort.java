package Seminar3;

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() класса Collections и вывести его на
// экран.


// Этот код выполняет следующие действия:

// Создает абстрактный класс Sort.
// В методе main:
// Устанавливает переменные size (размер списка) и max (максимальное значение случайных чисел).
// Получает случайный список чисел, вызывая метод getRand.
// Выводит исходный список.
// Сортирует список с помощью метода Collections.sort.
// Выводит отсортированный список.
// Метод getRand создает список случайных чисел:
// Создает пустой список.
// Создает объект Random для генерации случайных чисел.
// Заполняет список случайными числами в диапазоне от 0 до max.
// Возвращает сгенерированный список.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// Абстрактный класс Sort
public abstract class Sort {
    // Метод main, с которого начинается выполнение программы
    public static void main(String[] args) {
        int size = 10; // Размер списка
        int max = 20; // Максимальное значение для случайных чисел
        List<Integer> list = getRand(size, max); // Получаем случайный список чисел
        System.out.println(list); // Выводим исходный список
        Collections.sort(list); // Сортируем список
        System.out.println(list); // Выводим отсортированный список
    }

    // Метод для генерации случайного списка чисел
    private static List<Integer> getRand(int size, int max) {
        List<Integer> list = new ArrayList<>(); // Создаем пустой список
        Random rand = new Random(); // Создаем объект для генерации случайных чисел

        // Заполняем список случайными числами в диапазоне от 0 до max
        for (int i = 0; i < size; i++) {
            list.add(rand.nextInt(max)); // Добавляем случайное число в список
        }
        return list; // Возвращаем сгенерированный список
    }

}
