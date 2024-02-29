package Seminar5;


// Написать метод, который переведет число из римского формата записи в арабский. Например, MMXXII = 2022


// Создает отображение (Map) для соответствия римских символов их арабским значениям.
// Проходит по римскому числу справа налево.
// Для каждого символа находит его числовое значение с помощью отображения.
// Если значение текущего символа меньше предыдущего, вычитает его из результата, иначе прибавляет его к результату.
// Возвращает арабское число.


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToArabic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите римское число:"); // Приглашаем пользователя ввести римское число
        String romanNumber = scanner.nextLine(); // Считываем римское число из консоли
        scanner.close();

        int arabicNumber = romanToArabic(romanNumber); // Вызываем метод для преобразования римского числа в арабское
        System.out.println("Арабское число для римского числа " + romanNumber + " = " + arabicNumber); // Выводим результат преобразования
    }

    public static int romanToArabic(String romanNumber) {
        Map<Character, Integer> romanMap = new HashMap<>(); // Создаем отображение символов римской цифры в их арабское значение
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int previousValue = 0;

        for (int i = romanNumber.length() - 1; i >= 0; i--) { // Проходим по римскому числу справа налево
            int value = romanMap.get(romanNumber.charAt(i)); // Получаем значение текущего символа
            if (value < previousValue) {
                result -= value; // Если значение текущего символа меньше предыдущего, вычитаем его из результата
            } else {
                result += value; // Иначе прибавляем его к результату
            }
            previousValue = value; // Обновляем предыдущее значение
        }

        return result; // Возвращаем арабское число
    }
}
