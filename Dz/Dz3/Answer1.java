package Dz.Dz3;

// Реализуйте метод, который принимает на вход целочисленный массив arr:
// - Создаёт список ArrayList, заполненный числами из исходого массива arr.
// - Сортирует список по возрастанию и выводит на экран.
// - Находит минимальное значение в списке и выводит на экран
// - Minimum is {число} - Находит максимальное значение в списке
// и выводит на экран - Maximum is {число}
// - Находит среднее арифметическое значений списка и выводит на экран
// - Average is =  {число}
// Напишите свой код в методе analyzeNumbers класса Answer.
// Метод analyzeNumbers принимает на вход один параметр:
// Integer[] arr - массив целых чисел.
// Пример.
// Исходный массив:

// 4, 2, 7, 5, 1, 3, 8, 6, 9
// Результаты:

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Answer1 {
    public static void analyzeNumbers(Integer[] arr) {
        // Создаем список ArrayList и заполняем его значениями из исходного массива arr
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        
        // Сортируем список по возрастанию
        Collections.sort(list);
        
        // Выводим отсортированный список на экран
        System.out.println(list);
        
        // Находим и выводим минимальное значение в списке
        int min = Collections.min(list);
        System.out.println("Minimum is " + min);
        
        // Находим и выводим максимальное значение в списке
        int max = Collections.max(list);
        System.out.println("Maximum is " + max);
        
        // Находим среднее арифметическое значений списка
        double sum = 0;
        for (int num : list) {
            sum += num;
        }
        double average = sum / list.size();
        
        // Выводим среднее арифметическое на экран
        System.out.println("Average is = " + average);
    }

    public static void main(String[] args) { 
        Integer[] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};
      
        // Вызываем метод analyzeNumbers с переданным массивом
        analyzeNumbers(arr);
    }
}

