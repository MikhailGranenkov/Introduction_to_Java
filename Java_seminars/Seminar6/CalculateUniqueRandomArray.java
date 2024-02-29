package Seminar6;


// 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
// Для вычисления процента используйте формулу:
// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CalculateUniqueRandomArray {
    public static void main(String[] args) {
        int[] array = generateRandomArray(1000, 0, 24); // Генерируем массив из 1000 случайных чисел от 0 до 24
        double uniquePercentage = calculateUniquePercentage(array); // Вычисляем процент уникальных значений
        System.out.println("Процент уникальных чисел: " + uniquePercentage + "%");
    }

    // Метод для генерации массива из случайных чисел
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min; // Генерируем случайное число от min до max включительно
        }
        return array;
    }

    // Метод для вычисления процента уникальных значений в массиве
    public static double calculateUniquePercentage(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int num : array) {
            uniqueNumbers.add(num); // Добавляем каждое число массива в множество, чтобы получить только уникальные значения
        }
        double uniqueCount = uniqueNumbers.size(); // Количество уникальных чисел
        double totalCount = array.length; // Общее количество чисел в массиве
        return (uniqueCount * 100) / totalCount; // Вычисляем процент уникальных чисел
    }
}
